package com.eceakilli.birdenfazlaaktivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

        TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView=findViewById(R.id.sayac);

        new CountDownTimer(10000,1000){


            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("sayac"+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {

            }
        }.start();

    }
}