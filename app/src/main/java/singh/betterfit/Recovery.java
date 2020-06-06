package singh.betterfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Recovery extends AppCompatActivity implements View.OnClickListener{
    Intent intent;
    Button log,workout;
    RecyclerView recyclerView;

    List<Muscle> allMuscles;
    List<Integer> muscleImages;
    List<String> musclesNames;
    List<String> muscleDescriptions;
    List<Boolean> muscleTrained;
    Muscle muscleInstance;
    DatabaseManager db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recovery);
        log=findViewById(R.id.recovery_log);
        workout=findViewById(R.id.recovery_workout);

        log.setOnClickListener(this);
        workout.setOnClickListener(this);

        db = new DatabaseManager(this);
        muscleInstance = new Muscle();
        allMuscles =  db.getAllMuscles();

        List<Muscle> alreadyTrained = db.getTrainedMuscle();
        muscleDescriptions = new ArrayList<>();
        muscleImages = new ArrayList<>();
        musclesNames = new ArrayList<>();
        muscleTrained = new ArrayList<>();
        if (alreadyTrained.size() > 0) {
            for (int j = 0; j < alreadyTrained.size(); j++) {
                muscleImages.add(alreadyTrained.get(j).getImage());
                musclesNames.add(alreadyTrained.get(j).getNombre());
                muscleDescriptions.add(alreadyTrained.get(j).getDescription());
                muscleTrained.add(alreadyTrained.get(j).isTrained());
            }
        }

        recyclerView=findViewById(R.id.recovery_recycler_view);

        RecylerAdapter recylerAdapter = new RecylerAdapter(this, musclesNames, muscleImages, muscleDescriptions);
        recyclerView.setAdapter(recylerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.recovery_log:
             //   Toast.makeText(this, "Log Clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Log.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finishAffinity();
                startActivity(intent);
                break;
            case R.id.recovery_workout:
              //  Toast.makeText(this, "Workout Clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, MainActivity.class);
               // intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finishAffinity();
                startActivity(intent);
                break;
        }
    }

}
