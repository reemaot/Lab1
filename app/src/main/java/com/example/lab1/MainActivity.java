package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text1 = (TextView)findViewById(R.id.textView2);
        final TextView text2 = (TextView)findViewById(R.id.textView3);
        final TextView text3 = (TextView)findViewById(R.id.textView4);
        final TextView text4 = (TextView)findViewById(R.id.textView5);


        final EditText edit1 = (EditText) findViewById(R.id.editTextTextPersonName);
        final EditText edit2 = (EditText) findViewById(R.id.editTextTextEmailAddress);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final EditText edit3 = (EditText) findViewById(R.id.editTextPhone);

       final Button bttnClick = (Button)findViewById(R.id.button);
        bttnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}