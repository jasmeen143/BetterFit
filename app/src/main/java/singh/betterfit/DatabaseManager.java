package singh.betterfit;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseManager extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    //NOM DE LA BASE DE DADES
    private static final String DATABASE_NAME = "BetterFit";
    // TAULA CON MUSCULOS
    private static final String TABLE_MUSCULOS = "muscles";
    //CAMPS DE LA BASE DE TAULA
    private static final String KEY_MUSCLE_NAME = "nombre";
    private static final String KEY_MUSCLE_DESCRIPTION = "description";
    private static final String KEY_MUSCLE_IMAGE = "image";
    private static final String KEY_MUSCLE_ENTRENADO = "trained";

    // TAULA CON LOG
    private static final String TABLE_LOG = "log";
    //CAMPS DE LA BASE DE TAULA
    private static final String KEY_MUSCLE_DATETIME = "traineddate";


    public DatabaseManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        SQLiteDatabase db = this.getWritableDatabase();
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableMuscles = "CREATE TABLE IF NOT EXISTS " + TABLE_MUSCULOS + "(" + KEY_MUSCLE_NAME + " TEXT PRIMARY KEY, " + KEY_MUSCLE_DESCRIPTION + " TEXT NOT NULL, " + KEY_MUSCLE_IMAGE + " INTEGER NOT NULL, " + KEY_MUSCLE_ENTRENADO + " BOOLEAN NOT NULL " + ")";
        String createTableLog = "CREATE TABLE IF NOT EXISTS " + TABLE_LOG + "(" + KEY_MUSCLE_NAME + " TEXT NOT NULL, " + KEY_MUSCLE_DATETIME + " DATETIME, FOREIGN KEY (" + KEY_MUSCLE_NAME + ") REFERENCES " + TABLE_MUSCULOS + "(" + KEY_MUSCLE_NAME + ") ON DELETE CASCADE" + ")";
        db.execSQL(createTableMuscles);
        db.execSQL(createTableLog);
        db.execSQL("PRAGMA foreign_keys = ON;");
        System.out.println("Base de datos creado");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //DROP SI EXISTEIX
        db.execSQL("DROP TABLE  IF EXISTS " + TABLE_MUSCULOS);

        // CREAR LA TABLA DE NOU
        onCreate(db);
    }

    public void insertAllMuscles() {
        Muscle muscleInstance = new Muscle();
        List<Integer> muscleImages = muscleInstance.addImages();
        List<String> musclesNames = muscleInstance.addNames();
        List<String> muscleDescriptions = muscleInstance.addDescriptions();
        List<Boolean> muscleTrained = muscleInstance.addTrained();

        SQLiteDatabase db = this.getWritableDatabase();

            for (int i = 0; i < musclesNames.size(); i++) {
                ContentValues valors = new ContentValues();

                valors.put(KEY_MUSCLE_DESCRIPTION, muscleDescriptions.get(i));
                valors.put(KEY_MUSCLE_ENTRENADO, muscleTrained.get(i));
                valors.put(KEY_MUSCLE_NAME, musclesNames.get(i));
                valors.put(KEY_MUSCLE_IMAGE, muscleImages.get(i));

                //Instertar a tabla productes
                db.insert(TABLE_MUSCULOS, null, valors);
            }
            db.close();
    }

    public List<Muscle> getAllMuscles(){
        List<Muscle> muscles = new ArrayList<Muscle>();
            String selectCategoria = "SELECT * FROM " + TABLE_MUSCULOS;
            SQLiteDatabase db = this.getWritableDatabase();
            Cursor cursor = db.rawQuery(selectCategoria, null);
            if (cursor.moveToFirst()) {
                do {
                    Muscle muscle = new Muscle();
                    muscle.setNombre(String.valueOf(cursor.getString(0)));
                    muscle.setDescription(String.valueOf(cursor.getString(1)));
                    muscle.setImage(Integer.parseInt(cursor.getString(2)));
                    muscle.setTrained(Boolean.parseBoolean(String.valueOf(cursor.getString(3))));
                    muscles.add(muscle);
                } while (cursor.moveToNext());
            }
        return muscles;
    }

    public void setTrained(Muscle m){
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues valors = new ContentValues();
        valors.put(KEY_MUSCLE_ENTRENADO, m.isTrained());
        db.update(TABLE_MUSCULOS, valors, KEY_MUSCLE_NAME+"=?",
                new String[]{String.valueOf(m.getNombre())});
    }

    public List<Muscle> getTrainedMuscle(){
        List<Muscle> muscles = new ArrayList<Muscle>();
        String selectCategoria = "SELECT * FROM " + TABLE_MUSCULOS + " WHERE "+KEY_MUSCLE_ENTRENADO+" = 1";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectCategoria, null);
        if (cursor.moveToFirst()) {
            do {
                Muscle muscle = new Muscle();
                muscle.setNombre(String.valueOf(cursor.getString(0)));
                muscle.setDescription(String.valueOf(cursor.getString(1)));
                muscle.setImage(Integer.parseInt(cursor.getString(2)));
                muscle.setTrained(Boolean.parseBoolean(String.valueOf(cursor.getString(3))));
                muscles.add(muscle);
            } while (cursor.moveToNext());
        }
        return muscles;
    }

    public List<Muscle> getNotTrainedMuscles(){
        List<Muscle> muscles = new ArrayList<Muscle>();
        String selectCategoria = "SELECT * FROM " + TABLE_MUSCULOS + " WHERE "+KEY_MUSCLE_ENTRENADO+" = 0";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectCategoria, null);
        if (cursor.moveToFirst()) {
            do {
                Muscle muscle = new Muscle();
                muscle.setNombre(String.valueOf(cursor.getString(0)));
                muscle.setDescription(String.valueOf(cursor.getString(1)));
                muscle.setImage(Integer.parseInt(cursor.getString(2)));
                muscle.setTrained(Boolean.parseBoolean(String.valueOf(cursor.getString(3))));
                muscles.add(muscle);
            } while (cursor.moveToNext());
        }
        return muscles;
    }

    /*public void dropTable(){
        String query = "DROP TABLE IF EXISTS '" + TABLE_MUSCULOS + "'";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(query);
    }*/



/*
    //AFEGIS UN PRODUCTE NOU

public void addProducte(Producte producte) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues valors = new ContentValues();

        valors.put(KEY_CODI, producte.getCodi_producte());
        valors.put(KEY_NOM, producte.getNom());
        valors.put(KEY_DESCRIPCIO, producte.getDescripcio());
        valors.put(KEY_QUANTITAT, producte.getQuantitat());
        valors.put(KEY_PREU, producte.getPreu());
        valors.put(KEY_CATEGORIA, producte.getCategoria());

        //Instertar a tabla productes
        db.insert(TABLE_PRODUCTES, null, valors);
        // tancar  conexio base de dades
        db.close();
    }

    public List<String> allCategories(){
        List<String> categories = new ArrayList<String>();
        SQLiteDatabase db = this.getWritableDatabase();
        String[] categoryArray = new String[1];
        categoryArray[0]=KEY_CATEGORIA;
        Cursor cursor = db.query(TABLE_PRODUCTES, categoryArray, null, null, null, null, KEY_CATEGORIA+" ASC");
        if (cursor.moveToFirst()) {
            do{
                String actual_category = String.valueOf(cursor.getString(0));
                if (!(categories.contains(actual_category))){
                    categories.add(actual_category);
                }
            } while (cursor.moveToNext());
        }
        return categories;
    }

    //Query que retorna liste de producteByCategoria
    public List<Producte> producteByCategoria(String categoria){
        List<Producte> productes = new ArrayList<Producte>();
        String selectCategoria ="SELECT * FROM "+ TABLE_PRODUCTES + " WHERE "+KEY_CATEGORIA+" = '" + categoria + "'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectCategoria, null);
        if (cursor.moveToFirst()) {
            do{
                Producte producte = new Producte();
                producte.setCodi_producte(Integer.parseInt(cursor.getString(0)));
                producte.setNom(String.valueOf(cursor.getString(1)));
                producte.setDescripcio(String.valueOf(cursor.getString(2)));
                producte.setQuantitat(Integer.parseInt(cursor.getString(3)));
                producte.setPreu(Float.parseFloat(cursor.getString(4)));
                producte.setCategoria(String.valueOf(cursor.getString(5)));
                productes.add(producte);
            } while (cursor.moveToNext());
        }
        return productes;
    }


    //Metodo per bucar un producte amb codi
    public Producte searchByCodiProducte(int codi){
        SQLiteDatabase db =this.getReadableDatabase();
        //Creem un cursor per desplaçarse pels registres per localitzar l'element en concrete
        Cursor cursor = db.query(TABLE_PRODUCTES, new String[]{KEY_CODI, KEY_NOM, KEY_DESCRIPCIO, KEY_QUANTITAT, KEY_PREU, KEY_CATEGORIA},
                KEY_CODI+ "= ?",new String[]{String.valueOf(codi)}, null, null, null, null);

        if(cursor != null) {
            cursor.moveToFirst();
        }

        Producte producte = new Producte(Integer.parseInt(cursor.getString(0)), String.valueOf(cursor.getString(1)), String.valueOf(cursor.getString(2)),
                Integer.parseInt(cursor.getString(3)), Float.parseFloat(cursor.getString(4)), String.valueOf(cursor.getString(5)));

        return producte;
    }

    //Metodo per bucar un producte amb nom
    public Producte productbyname(String nom){
        SQLiteDatabase db =this.getReadableDatabase();
        //Creem un cursor per desplaçarse pels registres per localitzar l'element en concrete
        Cursor cursor = db.query(TABLE_PRODUCTES, new String[]{KEY_CODI, KEY_NOM, KEY_DESCRIPCIO, KEY_QUANTITAT, KEY_PREU, KEY_CATEGORIA},
                KEY_NOM+ "= ?",new String[]{String.valueOf(nom)}, null, null, null, null);

        if(cursor != null) {
            cursor.moveToFirst();
        }

        Producte producte = new Producte(Integer.parseInt(cursor.getString(0)), String.valueOf(cursor.getString(1)), String.valueOf(cursor.getString(2)),
                Integer.parseInt(cursor.getString(3)), Float.parseFloat(cursor.getString(4)), String.valueOf(cursor.getString(5)));

        return producte;
    }

    //Query que retorna liste de todos productes de la taula
    public List<Producte> allProducte(){
        List<Producte> productes = new ArrayList<Producte>();
        String selectCategoria ="SELECT * FROM "+ TABLE_PRODUCTES;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectCategoria, null);
        if (cursor.moveToFirst()) {
            do{
                Producte producte = new Producte();
                producte.setCodi_producte(Integer.parseInt(cursor.getString(0)));
                producte.setNom(String.valueOf(cursor.getString(1)));
                producte.setDescripcio(String.valueOf(cursor.getString(2)));
                producte.setQuantitat(Integer.parseInt(cursor.getString(3)));
                producte.setPreu(Float.parseFloat(cursor.getString(4)));
                producte.setCategoria(String.valueOf(cursor.getString(5)));
                productes.add(producte);
            } while (cursor.moveToNext());
        }
        return productes;
    }
*/
}
