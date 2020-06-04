package singh.betterfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MuscleTraining extends AppCompatActivity implements View.OnClickListener{
    TextView muscleTrainingTextView;
    String textViewText;
    Intent intent;
    Button muscleTraining_workout, muscleTraining_log, muscleTraining_recovery, btnSubmit;
    Spinner spinner;

    List<Muscle> allMuscles;
    DatabaseManager db;
    Muscle muscle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_training);

        db = new DatabaseManager(this);
        spinner = findViewById(R.id.spinner);
        btnSubmit = findViewById(R.id.btnSubmit);

        muscleTrainingTextView = findViewById(R.id.muscleTrainingTextView);
        intent = getIntent();
        textViewText = intent.getStringExtra("MuscleName");
        muscleTrainingTextView.setText(textViewText);

        muscleTraining_log = findViewById(R.id.muscleTraining_log);
        muscleTraining_recovery = findViewById(R.id.muscleTraining_recovery);
        muscleTraining_workout = findViewById(R.id.muscleTraining_workout);

        muscleTraining_workout.setOnClickListener(this);
        muscleTraining_log.setOnClickListener(this);
        muscleTraining_recovery.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);

        allMuscles = db.getAllMuscles();
        for (Muscle m : allMuscles){
            if (m.getNombre().equalsIgnoreCase(textViewText)){
                muscle = m;
                break;
            }
        }

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

                break;
        }
    }
}
