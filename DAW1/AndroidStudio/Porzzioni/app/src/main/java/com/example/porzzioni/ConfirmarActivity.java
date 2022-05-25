package com.example.porzzioni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ConfirmarActivity extends AppCompatActivity {

    private TextView confirmacio1;
    private TextView confirmacio2;
    private TextView confirmacio3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar);


        confirmacio1 = findViewById(R.id.Conf1);
        confirmacio2 = findViewById(R.id.Conf2);
        confirmacio3 = findViewById(R.id.Conf3);

        int numIng;
        String mida;
        String borde;

        borde = getIntent().getStringExtra("borde");
        numIng = getIntent().getIntExtra("numIng", 0);
        mida = getIntent().getStringExtra("mida");

        confirmacio1.setText("Número d'ingradients: " + numIng);
        confirmacio2.setText("Mida: " + mida);
        confirmacio3.setText("Borde: " + borde);

    }
}