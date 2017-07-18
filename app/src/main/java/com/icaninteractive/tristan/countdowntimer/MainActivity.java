package com.icaninteractive.tristan.countdowntimer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.todddavies.components.progressbar.ProgressWheel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProgressWheel pw = (ProgressWheel) findViewById(R.id.pw_spinner);

        pw.startSpinning();
        //pw.stopSpinning();
        //pw.incrementProgress();


    }
}
