package com.eceakilli.birdenfazlaaktivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editTextTextPersonName);
        username="";
    }
    public void changeActivity(View view) {

        username = editText.getText().toString();

        Intent intent = new Intent(MainActivity.this,MainActivity2.class);

        intent.putExtra("userInput",username);

        startActivity(intent);




    }
}