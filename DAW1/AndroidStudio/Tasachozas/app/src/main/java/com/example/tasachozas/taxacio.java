package com.example.tasachozas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class taxacio extends AppCompatActivity {

    private TextView preu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxacio);

        preu = findViewById(R.id.tvCalcul);

        Double PreuFinal;

        PreuFinal = getIntent().getDoubleExtra("preu", 0);

        preu.setText(PreuFinal + "€");
    }
}