package com.example.act8_myrestaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lv1;
    private ImageButton b1;

    private List<List<String>> ArrListRestaurants = new ArrayList<List<String>>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1 = findViewById(R.id.lv1);
        b1 = findViewById(R.id.bAfegir);
        List<String> arrayRestaurants = new ArrayList<String>();

        ArrListRestaurants.add(new ArrayList<String>());
        ArrListRestaurants.get(0).add("Bar Manolo");
        ArrListRestaurants.get(0).add("Mataró");
        ArrListRestaurants.get(0).add("937991122");
        ArrListRestaurants.get(0).add("€€");

        ArrListRestaurants.add(new ArrayList<String>());
        ArrListRestaurants.get(1).add("Bar Manolo2");
        ArrListRestaurants.get(1).add("Mataró");
        ArrListRestaurants.get(1).add("937992233");
        ArrListRestaurants.get(1).add("€€€");

        ArrListRestaurants.add(new ArrayList<String>());
        ArrListRestaurants.get(2).add("Bar Manolo3");
        ArrListRestaurants.get(2).add("Mataró");
        ArrListRestaurants.get(2).add("937993344");
        ArrListRestaurants.get(2).add("€");

        String afegirNom;
        String afegirMunicipi;
        String afegirTlf;
        String afegirPreu;

        afegirNom = getIntent().getStringExtra("nom");
        afegirMunicipi = getIntent().getStringExtra("municipi");
        afegirTlf = getIntent().getStringExtra("telefon");
        afegirPreu = getIntent().getStringExtra("preu");

        if (afegirNom != null) {
            int posicioArray = ArrListRestaurants.size();
            ArrListRestaurants.add(new ArrayList<String>());
            ArrListRestaurants.get(posicioArray).add(afegirNom);
            ArrListRestaurants.get(posicioArray).add(afegirMunicipi);
            ArrListRestaurants.get(posicioArray).add(afegirTlf);
            ArrListRestaurants.get(posicioArray).add(afegirPreu);
        }

        for (int i = 0; i < ArrListRestaurants.size(); i++) {
                arrayRestaurants.add(ArrListRestaurants.get(i).get(0) + "(" + ArrListRestaurants.get(i).get(1) + ") - "
                        + ArrListRestaurants.get(i).get(2) + "(" + ArrListRestaurants.get(i).get(3) + ")");
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_restaurants, arrayRestaurants);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dialPhoneNumber("545435435");
            }
        });
    }

    public void Afegir(View view) {
        Intent formRest = new Intent(getApplicationContext(), AfegirRestaurant.class);
        startActivity(formRest);
    }

    public void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}