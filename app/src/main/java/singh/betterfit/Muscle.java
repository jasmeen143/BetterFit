package singh.betterfit;

import java.util.ArrayList;
import java.util.List;

public class Muscle {

    private String nombre;
    private String description;
    private int image;
    private boolean trained;

    public Muscle() {
    }

    public Muscle(String nombre, String description, int image,boolean trained) {
        this.nombre = nombre;
        this.description = description;
        this.image = image;
        this.trained = trained;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public List<String> addNames() {
        List<String> names = new ArrayList<String>();
        names.add("Abs");
        names.add("Biceps");
        names.add("Calves");
        names.add("Chest");
        names.add("Forearms");
        names.add("Glutes");
        names.add("Hamstrings");
        names.add("Lats");
        names.add("MidBack");
        names.add("Quadriceps");
        names.add("Shoulders");
        names.add("Traps");
        names.add("Triceps");
        return names;
    }

    public List<String> addDescriptions() {
        List<String> descriptions = new ArrayList<String>();
        descriptions.add("The rectus abdominis, the external oblique, the internal oblique, and the transverse abdominis.");
        descriptions.add("The bis are comprised of a long and short head, hence the name bicep.");
        descriptions.add("The calves are involved every time you take a step, stand up, or jump.");
        descriptions.add("Pectoral muscles are most predominantly associated with movement of the shoulders and arms.");
        descriptions.add("The brachioradialis, the wrist flexors, and the pronator teres.");
        descriptions.add("The glutes originate from the pelvis and insert into the femur.");
        descriptions.add("The hamstrings are the big muscles on the back of your thighs.");
        descriptions.add("Muscle that has origin points at the mid and lower spine, the iliac crest (pelvis), and the ribs.");
        descriptions.add("The medial, or middle, trapezius originates from the vertebral column and inserts into the scapula.");
        descriptions.add("Consist of four heads: the rectus femoris, vastus lateralis, vastus medialis, and vastus intermedius.");
        descriptions.add("The deltoid has three different heads: anterior (front), lateral (middle), and posterior (rear)");
        descriptions.add("The traps are divided into three portions: the superior, medial, and inferior fibers");
        descriptions.add("The triceps are a muscle with three heads are the long head, lateral head, and medial head.");
        return descriptions;
    }

    public List<Integer> addImages() {
        List<Integer> images = new ArrayList<Integer>();

        images.add(R.drawable.abs);
        images.add(R.drawable.biceps);
        images.add(R.drawable.calves);
        images.add(R.drawable.chest);
        images.add(R.drawable.forearms);
        images.add(R.drawable.glutes);
        images.add(R.drawable.hamstrings);
        images.add(R.drawable.lats);
        images.add(R.drawable.midback);
        images.add(R.drawable.quadriceps);
        images.add(R.drawable.shoulders);
        images.add(R.drawable.traps);
        images.add(R.drawable.triceps);

        return images;
    }
    public List<Boolean> addTrained() {
        List<Boolean> trained = new ArrayList<Boolean>();
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        trained.add(false);
        return trained;
    }
}
