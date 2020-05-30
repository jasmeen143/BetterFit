package singh.betterfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Log extends AppCompatActivity implements View.OnClickListener{
Intent intent;
    Button recovery,workout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        recovery=findViewById(R.id.log_recovery);
        workout=findViewById(R.id.log_workout);

        recovery.setOnClickListener(this);
        workout.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.log_recovery:
                Toast.makeText(this, "Recovery Clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, Recovery.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finishAffinity();
                startActivity(intent);
                break;
            case R.id.log_workout:
                Toast.makeText(this, "Workout Clicked", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, MainActivity.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                finishAffinity();
                startActivity(intent);
                break;
        }
    }
}
