package singh.betterfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Recovery extends AppCompatActivity implements View.OnClickListener{
    Intent intent;
    Button log,workout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recovery);
        log=findViewById(R.id.recovery_log);
        workout=findViewById(R.id.recovery_workout);

        log.setOnClickListener(this);
        workout.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.recovery_log:
                Toast.makeText(this, "Log Clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Log.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finishAffinity();
                startActivity(intent);
                break;
            case R.id.recovery_workout:
                Toast.makeText(this, "Workout Clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, MainActivity.class);
               // intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finishAffinity();
                startActivity(intent);
                break;
        }
    }
}
