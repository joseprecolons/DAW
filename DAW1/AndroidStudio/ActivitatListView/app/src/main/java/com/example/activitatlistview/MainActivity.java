package com.example.activitatlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;
    private String videojuegos[] = {"Pokémon: Let's Go, Pikachu!", "Xenoblade Chronicles 2",
            "Super Mario Party", "Luigi's Mansion 3", "Super Smash Bros. Ultimate", "Animal Crossing: New Horizons",
            "Narita Boy", "The Plane Effect", "Turrican Flashback", "Redout: Space Assault"};
    private String videojuegosOrdenat[] = {"Pokémon: Let's Go, Pikachu!", "Xenoblade Chronicles 2",
            "Super Mario Party", "Luigi's Mansion 3", "Super Smash Bros. Ultimate", "Animal Crossing: New Horizons",
            "Narita Boy", "The Plane Effect", "Turrican Flashback", "Redout: Space Assault"};
    private Spinner sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        lv1 = findViewById(R.id.lv1);
        sp1 = findViewById(R.id.spinner);

        String[] opcions = {"Ordenar", "Sin Ordenar"};
        ArrayAdapter <String> adaptder2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opcions);
        sp1.setAdapter(adaptder2);

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_juegos, videojuegos);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent paginaDesc = new Intent(getApplicationContext(), DescActivity.class);
                paginaDesc.putExtra("nom", lv1.getItemAtPosition(position).toString());
                paginaDesc.putExtra("position", position);
                startActivity(paginaDesc);
            }
        });
    }

    public void Orden(View view) {
        lv1 = findViewById(R.id.lv1);

        String seleccio = sp1.getSelectedItem().toString();
            if (seleccio.equals("Sin Ordenar")) {
                ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_juegos, videojuegos);
                lv1.setAdapter(adapter);
            } else {
                Arrays.sort(videojuegosOrdenat);
                ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_juegos, videojuegosOrdenat);
                lv1.setAdapter(adapter);
            }
    }
}