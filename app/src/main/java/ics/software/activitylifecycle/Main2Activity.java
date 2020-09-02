package ics.software.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private final String TAG = "Sortie";
    Intent startSecondActivity = null;
    Button startActivity2 = null;
    int duree = 10;
    int iteration = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        startSecondActivity = new Intent(this.getApplicationContext(), Main3Activity.class);
        startActivity2 = (Button) findViewById(R.id.startActivity3);
        startActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(startSecondActivity);
            }
        });
        Log.i(TAG, "Entered the onCreate() method Activity 2");
        for (int i = 0; i < iteration; i++) {
            try {
                Thread.sleep(duree);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Entered the onStart() method Activity 2");
        for (int i = 0; i < iteration; i++) {
            try {
                Thread.sleep(duree);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Entered the onResume() method Activity 2");
        for (int i = 0; i < iteration; i++) {
            try {
                Thread.sleep(duree);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Entered the onPause() method Activity 2");
        for (int i = 0; i < iteration; i++) {
            try {
                Thread.sleep(duree);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Entered the onStop() method Activity 2");
        for (int i = 0; i < iteration; i++) {
            try {
                Thread.sleep(duree);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Entered the onRestart() method Activity 2");
        for (int i = 0; i < iteration; i++) {
            try {
                Thread.sleep(duree);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Entered the onDestroy() method");
        for (int i = 0; i < iteration; i++) {
            try {
                Thread.sleep(duree);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}