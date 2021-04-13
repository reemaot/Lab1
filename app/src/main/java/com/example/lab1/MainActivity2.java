package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final ImageView image = (ImageView) findViewById(R.id.logo);
        final TextView txt1 = (TextView) findViewById(R.id.textView1);
        final TextView txt2 = (TextView) findViewById(R.id.textView6);
        final TextView txt3 = (TextView) findViewById(R.id.textView7);
        final TextView txt4 = (TextView) findViewById(R.id.textView8);
        final TextView txt5 = (TextView) findViewById(R.id.textView9);
    }
}