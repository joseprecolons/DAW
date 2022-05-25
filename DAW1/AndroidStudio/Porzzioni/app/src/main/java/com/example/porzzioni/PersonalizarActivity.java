package com.example.porzzioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PersonalizarActivity extends AppCompatActivity {

    private EditText NumIngredients;
    private TextView Preu;
    private RadioButton Gran;
    private RadioButton Mitja;
    private Switch Borde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalizar);

        NumIngredients = findViewById(R.id.etNumIngredients);
        Preu = findViewById(R.id.tvPreu);
        Gran = findViewById(R.id.rbPetit);
        Mitja = findViewById(R.id.rbMitja);
        Borde = findViewById(R.id.swBorde);
    }

    public void bCalcular (View view) {

    double ingredients = Double.parseDouble(NumIngredients.getText().toString());
    Double calcul;

    if (Gran.isChecked()) {
        calcul = 5 + (ingredients * 0.5);
    } else if(Mitja.isChecked()) {
        calcul = 6 + (ingredients * 1.25);
    } else {
        calcul = 7 + (ingredients * 2);
    }

    if (Borde.isChecked()) {
        calcul = calcul + 2;
    }

    Preu.setText(calcul.toString());

    }

    public void bEnviar (View view) {

        Intent confirmar = new Intent(getApplicationContext(), ConfirmarActivity.class);
        int ingredients = Integer.parseInt(NumIngredients.getText().toString());

        confirmar.putExtra("numIng", ingredients);

        String tamany = "";
        String borde = "";

        if (Gran.isChecked()) {
            tamany = "Gran";
            confirmar.putExtra("mida", tamany);
        } else if(Mitja.isChecked()) {
            tamany = "Mitjana";
            confirmar.putExtra("mida", tamany);
        } else {
            tamany = "Petita";
            confirmar.putExtra("mida", tamany);
        }

        if (Borde.isChecked()) {
            borde = "Amb formatge";
            confirmar.putExtra("borde", borde);
        } else {
            borde = "Sense formatge";
            confirmar.putExtra("borde", borde);
        }

        startActivity(confirmar);
    }
}