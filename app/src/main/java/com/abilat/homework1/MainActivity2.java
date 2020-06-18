package com.abilat.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvTwo = (TextView) findViewById(R.id.tvTwo);

        Intent intent = getIntent();

        String eText = intent.getStringExtra("eText");

        tvTwo.setText(eText);

    }
}