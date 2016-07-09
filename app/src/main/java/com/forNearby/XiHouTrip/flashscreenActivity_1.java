package com.forNearby.XiHouTrip;

import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import android.os.Bundle;
import android.widget.Chronometer;

public class flashscreenActivity_1 extends Activity {

    Chronometer ch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashscreen_1);
        ch= (Chronometer) findViewById(R.id.chronometer);
        ch.setBase(SystemClock.elapsedRealtime());
        ch.start();
        ch.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if(SystemClock.elapsedRealtime()-ch.getBase()>1*1000){
                    ch.stop();
                    Intent intent = new Intent();
                    intent.setClass(flashscreenActivity_1.this,flashscreenActivity_2.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }
}
