package com.example.act8_myrestaurants;

import androidx.appcompat.app.AppCompatActivity;

import java.util.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class AfegirRestaurant extends AppCompatActivity {

    private EditText nomRest;
    private EditText municipiRest;
    private EditText tlfRest;
    private Spinner spPreu;
    private Button bGuardar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afegir_restaurant);

        nomRest = findViewById(R.id.etNomRest);
        municipiRest = findViewById(R.id.etNomMuni);
        tlfRest = findViewById(R.id.etTlf);
        spPreu = findViewById(R.id.spPreu);
        bGuardar = findViewById(R.id.bGuardar);

        String[] opcions = {"Caro", "Normal", "Barato"};
        ArrayAdapter<String> adaptder1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opcions);
        spPreu.setAdapter(adaptder1);

    }

    public void Guardar(View view) {

        String seleccio = spPreu.getSelectedItem().toString();

        Intent paginaPrincipal = new Intent(getApplicationContext(), MainActivity.class);
        paginaPrincipal.putExtra("nom", nomRest.getText().toString());
        paginaPrincipal.putExtra("municipi", municipiRest.getText().toString());
        paginaPrincipal.putExtra("telefon", tlfRest.getText().toString());
        if (seleccio.equals("Caro")) {
            paginaPrincipal.putExtra("preu", "€€€");
        } else if (seleccio.equals("Normal")){
            paginaPrincipal.putExtra("preu", "€€");
        } else {
            paginaPrincipal.putExtra("preu", "€");
        }
        startActivity(paginaPrincipal);

    }
}