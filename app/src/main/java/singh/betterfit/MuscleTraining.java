package singh.betterfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MuscleTraining extends AppCompatActivity implements View.OnClickListener{

    TextView muscleTrainingTextView;
    Spinner spinner;
    Button muscleTraining_workout, muscleTraining_log, muscleTraining_recovery, btnSubmit, btnFinishWorkout;
    ListView listViewTraining;

    String textViewText, selecedOption;
    Intent intent, intentGoHome;
    int musclePosInAllMusclesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_training);

        spinner = findViewById(R.id.spinner);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnFinishWorkout = findViewById(R.id.btnFinishWorkout);
        listViewTraining = findViewById(R.id.listViewTraining);
        muscleTraining_log = findViewById(R.id.muscleTraining_log);
        muscleTraining_recovery = findViewById(R.id.muscleTraining_recovery);
        muscleTraining_workout = findViewById(R.id.muscleTraining_workout);
        muscleTrainingTextView = findViewById(R.id.muscleTrainingTextView);

        muscleTraining_workout.setOnClickListener(this);
        muscleTraining_log.setOnClickListener(this);
        muscleTraining_recovery.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);
        btnFinishWorkout.setOnClickListener(this);

        intent = getIntent();
        textViewText = intent.getStringExtra("MuscleName");
        musclePosInAllMusclesList = intent.getIntExtra("musclePosInAllMusclesList", 0);
        muscleTrainingTextView.setText("Train "+textViewText);

        addItemsOnSpinner();
    }

    public void addItemsOnSpinner() {
        List<String> list = new ArrayList<String>();
        list.add("EXERCISES");
        list.add("STRETCHES");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.muscleTraining_log:
                Toast.makeText(this, "Log Clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Log.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finishAffinity();
                startActivity(intent);
                break;
            case R.id.muscleTraining_recovery:
                Toast.makeText(this, "Recovery Clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Recovery.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finishAffinity();
                startActivity(intent);
                break;
            case R.id.muscleTraining_workout:
                Toast.makeText(this, "Workout Clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, MainActivity.class);
                // intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finishAffinity();
                startActivity(intent);
                break;
            case R.id.btnSubmit:
                listViewTraining.setAdapter(new SimpleAdapter(MuscleTraining.this,new ArrayList<HashMap<String, String>>(),0,new String[]{},
                        new int[]{}));

                selecedOption = String.valueOf(spinner.getSelectedItem());
                if (selecedOption.equalsIgnoreCase("Exercises")){
                    ArrayList<HashMap<String, String>> noName = new ArrayList<HashMap<String, String>>();
                    List<Exercise> selectedMuscleExercises = new ArrayList<Exercise>();
                    Exercise exerciseInstance = new Exercise();
                    List<Exercise> allExercises = exerciseInstance.getAllExercises();

                    for (Exercise ex : allExercises){
                        if (textViewText.equalsIgnoreCase(ex.getNameMuscle())){
                            selectedMuscleExercises.add(ex);
                        }
                    }
                    for (Exercise ex : selectedMuscleExercises){
                        String exNom = ex.getNameExercise();
                        HashMap<String, String>  hashMap = new HashMap<String, String>();
                        hashMap.put("nom", exNom);
                        noName.add(hashMap);
                    }
                    ListAdapter adapter = new SimpleAdapter(
                            MuscleTraining.this,
                            noName,
                            R.layout.row2,
                            new String[]{"nom"},
                            new int[]{R.id.tvName}
                    );
                    listViewTraining.setAdapter(adapter);
                }else if(selecedOption.equalsIgnoreCase("Stretches")){
                    ArrayList<HashMap<String, String>> noName = new ArrayList<HashMap<String, String>>();
                    List<Stretches> selectedMuscleStretches = new ArrayList<Stretches>();
                    Stretches stretchesInstance = new Stretches();
                    List<Stretches> allStretches = stretchesInstance.getAllStretches();
                    for (Stretches str : allStretches){
                        if (textViewText.equalsIgnoreCase(str.getNameMuscle())) {
                            selectedMuscleStretches.add(str);
                        }
                    }
                    for (Stretches ex : selectedMuscleStretches){
                        int exNom = ex.getIdStretch();
                        HashMap<String, String>  hashMap = new HashMap<String, String>();
                        hashMap.put("nom", "Stretch "+String.valueOf(exNom));
                        noName.add(hashMap);
                    }
                    ListAdapter adapter = new SimpleAdapter(
                            MuscleTraining.this,
                            noName,
                            R.layout.row2,
                            new String[]{"nom"},
                            new int[]{R.id.tvName}

                    );
                    listViewTraining.setAdapter(adapter);
                }
                break;
            case R.id.btnFinishWorkout:
                DatabaseManager db = new DatabaseManager(this);
                final List<Muscle> allMuscles = db.getAllMuscles();
                allMuscles.get(musclePosInAllMusclesList).setTrained(true);
                db.setTrained(allMuscles.get(musclePosInAllMusclesList));
                intentGoHome = new Intent(MuscleTraining.this, MainActivity.class);
                finishAffinity();
                startActivity(intentGoHome);
                break;
        }
    }

    /*public void defaultListView(){

    }*/
}
