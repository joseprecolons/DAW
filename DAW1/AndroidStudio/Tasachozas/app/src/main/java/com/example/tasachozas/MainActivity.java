package com.example.tasachozas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText metresQuadrats;
    private RadioButton nova;
    private RadioButton bonEstat;
    private Switch piscina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        metresQuadrats = findViewById(R.id.etMetres);
        nova = findViewById(R.id.rbNova);
        bonEstat = findViewById(R.id.rbBuenEstado);
        piscina = findViewById(R.id.swPiscina);
    }

    public void bTaxacio(View view) {

        if (metresQuadrats.getText().toString().isEmpty()) {
            Toast.makeText(this,"Error, sin metros dificil calcular algo" , Toast.LENGTH_SHORT).show();
        } else {
            double metresQ = Double.parseDouble(metresQuadrats.getText().toString());
            Double calcul;

            if (nova.isChecked() && piscina.isChecked()) {
                calcul = metresQ * 2700;
            } else if (nova.isChecked()) {
                calcul = metresQ * 1700;
            } else if (bonEstat.isChecked() && piscina.isChecked()) {
                calcul = metresQ * 2500;
            } else if (bonEstat.isChecked()) {
                calcul = metresQ * 1500;
            } else if (piscina.isChecked()) {
                calcul = metresQ * 2100;
            } else {
                calcul = metresQ * 1100;
            }
                Intent calcular = new Intent(getApplicationContext(), taxacio.class);
                calcular.putExtra("preu", calcul);
                startActivity(calcular);
        }
    }
}