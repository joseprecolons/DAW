package com.example.calcularnota;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText NotaAct;
    private EditText NotaEx;
    private TextView NotaGran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NotaAct = findViewById(R.id.etNotaAct);
        NotaEx = findViewById(R.id.etNotaEx);
        NotaGran = findViewById(R.id.tvNota);
    }

    public void bcalcular(View view) {

        double notaA;
        double notaE;
        Double calcul;

        notaA = Double.parseDouble(NotaAct.getText().toString());
        notaE = Double.parseDouble(NotaEx.getText().toString());
        if (notaA > 10 || notaA < 0 || notaE > 10 || notaE < 0) {
            Toast toast = Toast.makeText(this, "Les notes introduïdes son incorrectes", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            notaA = notaA * 0.4;
            notaE = notaE * 0.6;
            calcul = notaA + notaE;

            NotaGran.setText(calcul.toString());
        }


    }
}