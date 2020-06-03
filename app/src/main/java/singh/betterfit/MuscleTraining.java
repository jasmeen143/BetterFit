package singh.betterfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MuscleTraining extends AppCompatActivity implements View.OnClickListener{
    TextView muscleTrainingTextView;
    String textViewText;
    Intent intent;
    Button muscleTraining_workout, muscleTraining_log, muscleTraining_recovery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_training);

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
            default:
                System.out.println("nothing Clicked");
        }
    }
}
