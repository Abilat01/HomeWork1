package com.abilat.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnGo;
    EditText eText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGo = (Button) findViewById(R.id.btnGo);
        btnGo.setOnClickListener(this);
        eText = (EditText) findViewById(R.id.eText);


    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("eText", eText.getText().toString());
        startActivity(intent);


    }
}