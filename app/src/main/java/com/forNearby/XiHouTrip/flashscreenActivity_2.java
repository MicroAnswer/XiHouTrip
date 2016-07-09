package com.forNearby.XiHouTrip;

import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;

public class flashscreenActivity_2 extends Activity {
    Chronometer chronometer_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashscreen_2);
        chronometer_2= (Chronometer) findViewById(R.id.chronometer_2);
        chronometer_2.setBase(SystemClock.elapsedRealtime());
        chronometer_2.start();
        chronometer_2.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if(SystemClock.elapsedRealtime()-chronometer_2.getBase()>1*1000){
                    chronometer_2.stop();
                    Intent intent=new Intent();
                    intent.setClass(flashscreenActivity_2.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
