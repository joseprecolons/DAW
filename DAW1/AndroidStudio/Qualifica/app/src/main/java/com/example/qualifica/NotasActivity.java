package com.example.qualifica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;

public class NotasActivity extends AppCompatActivity {

    private Button b1;
    private TextView tv1;
    private TextView tv2;
    private EditText et1;
    private EditText et2;
    private Spinner sp1;
    private Double notaFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
        tv1 = findViewById(R.id.tvNom);
        sp1 = findViewById(R.id.sp1);

        String nom;
        nom = getIntent().getStringExtra("nom");
        tv1.setText(nom);

        String[] opcions = {"Bona actitud", "Actitud normal", "Mala actitud"};
        ArrayAdapter<String> adaptder1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opcions);
        sp1.setAdapter(adaptder1);
    }

    public void Calcular(View view) {
        et1 = findViewById(R.id.etNotaP);
        et2 = findViewById(R.id.etNotaE);
        tv2 = findViewById(R.id.tvResultat);

        double notaP = Double.parseDouble(et1.getText().toString());
        double notaE = Double.parseDouble(et2.getText().toString());
        notaFinal = (notaP * 0.3) + (notaE * 0.5);

        String seleccio = sp1.getSelectedItem().toString();
        if (seleccio.equals("Bona actitud")) {
            notaFinal = notaFinal + 2;
        } else if (seleccio.equals("Actitud normal")){
            notaFinal = notaFinal + 1;
        }

        tv2.setText(notaFinal.toString());


    }
}