package com.example.conversimoneda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText text1;
    private TextView dollars;
    private TextView lliures;
    private TextView iens;
    private TextView bitcoins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.escribirNum);
        dollars = findViewById(R.id.dollars);
        lliures = findViewById(R.id.lliures);
        iens = findViewById(R.id.iens);
        bitcoins = findViewById(R.id.bitcoins);
    }

    public void ferCalcul(View view) {

        Double euro;
        Double fdollar;
        Double flliura;
        Double fien;
        Double fbitcoin;

        euro = Double.parseDouble(text1.getText().toString());

        fdollar = euro * 1.18;
        dollars.setText(fdollar.toString() + " $");

        flliura = euro * 0.91;
        lliures.setText(flliura.toString() + " £");

        fien = euro * 124.39;
        iens.setText(fien.toString() + " ¥");

        fbitcoin = euro * 0.00011;
        bitcoins.setText(fbitcoin.toString() + " ฿");
    }
}