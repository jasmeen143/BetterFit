package singh.betterfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Intent intent;
    Button log,recovery;
    RecyclerView recyclerView;

    TextView textView1, textView2;
    String label1, label2;

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
        setContentView(R.layout.activity_main);

        log=findViewById(R.id.main_log);
        recovery=findViewById(R.id.main_recovery);
        log.setOnClickListener(this);
        recovery.setOnClickListener(this);

        db = new DatabaseManager(this);
        db.insertAllMuscles();

        muscleInstance = new Muscle();
        allMuscles =  db.getAllMuscles();

        textView1=findViewById(R.id.main_tv_1);
        textView2=findViewById(R.id.main_tv_2);

        noNameMethod();

        recyclerView=findViewById(R.id.main_recycler_view);

        RecylerAdapter recylerAdapter = new RecylerAdapter(this, musclesNames, muscleImages, muscleDescriptions);
        recyclerView.setAdapter(recylerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        RecylerAdapter recylerAdapter;
                        List<String> abc = new ArrayList<>();
                        List<Integer>  intege;
                        intege = new ArrayList<>();

                        int musclePosInAllMusclesList=0;
                        for (int i=0; i<allMuscles.size();i++){
                            if (allMuscles.get(i).getNombre().equalsIgnoreCase(musclesNames.get(position))){
                                musclePosInAllMusclesList = i;
                                break;
                            }
                        }

                        //allMuscles.get(musclePosInAllMusclesList).setTrained(true);
                        //db.setTrained(allMuscles.get(musclePosInAllMusclesList));

                        recylerAdapter = new RecylerAdapter(MainActivity.this, abc, intege, abc);
                        recyclerView.setAdapter(recylerAdapter);
                        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

                        Intent intent = new Intent(MainActivity.this, MuscleTraining.class);
                        intent.putExtra("MuscleName",  allMuscles.get(musclePosInAllMusclesList).getNombre());
                        intent.putExtra("musclePosInAllMusclesList", musclePosInAllMusclesList);
                        finishAffinity();
                        startActivity(intent);

                        noNameMethod();

                        recylerAdapter = new RecylerAdapter(MainActivity.this, musclesNames, muscleImages, muscleDescriptions);
                        recyclerView.setAdapter(recylerAdapter);
                        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

                        label1="Muscles to train\n"+(allMuscles.size()-db.getTrainedMuscle().size());
                        label2="Muscles to recover\n"+db.getTrainedMuscle().size();

                        textView1.setText(label1);
                        textView2.setText(label2);

                        //Toast.makeText(MainActivity.this, allMuscles.get(musclePosInAllMusclesList).getNombre()+" clicked", Toast.LENGTH_SHORT).show();
                    }
                    @Override public void onLongItemClick(View view, int position) {
                        //Toast.makeText(MainActivity.this, "long clicked", Toast.LENGTH_SHORT).show();
                    }
                })
        );
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_log:
                //Toast.makeText(this, "Log Clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, about.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finishAffinity();
                startActivity(intent);
                break;
            case R.id.main_recovery:
                //Toast.makeText(this, "Recovery Clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Recovery.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finishAffinity();
                startActivity(intent);
                break;
        }
    }

    public void noNameMethod(){
        List<Muscle> NotTrained = db.getNotTrainedMuscles();
        muscleDescriptions= new ArrayList<>();
        muscleImages= new ArrayList<>();
        musclesNames= new ArrayList<>();
        muscleTrained= new ArrayList<>();
        if (NotTrained.size()>=0) {
            for (int i = 0; i < NotTrained.size(); i++) {
                Muscle m = NotTrained.get(i);
                muscleImages.add(m.getImage());
                musclesNames.add(m.getNombre());
                muscleDescriptions.add(m.getDescription());
                muscleTrained.add(m.isTrained());
            }
            label1="Muscles to train\n"+(allMuscles.size()-db.getTrainedMuscle().size());
            label2="Muscles to recover\n"+db.getTrainedMuscle().size();
            textView1.setText(label1);
            textView2.setText(label2);
        }else {
            for (Muscle m : allMuscles) {
                muscleImages.add(m.getImage());
                musclesNames.add(m.getNombre());
                muscleDescriptions.add(m.getDescription());
                muscleTrained.add(m.isTrained());
            }
            textView1.setText("Muscles to train\n13");
            textView2.setText("Muscles to recover\n0");
        }
    }

}
