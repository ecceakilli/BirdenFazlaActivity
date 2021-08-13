package com.eceakilli.birdenfazlaaktivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button button1;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.textView1);

        Intent intent=getIntent();
        String username=intent.getStringExtra("userInput");
        textView.setText(username);

    }

    public void changeScreen (View view) {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
    public  void otherScreen(){
        Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(intent);
    }
}
///!!!!!!!!! Buton clik ile ekranlar arası geçiş olması grekiyorken neden ekrana tıklayınca gecis var