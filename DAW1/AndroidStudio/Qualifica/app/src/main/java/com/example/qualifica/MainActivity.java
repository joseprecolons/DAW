package com.example.qualifica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lv1;

    private String alumnos[] = {"Nicolás Queroso", "Rubén Fermizo", "Susana Oria",
            "Jorge Nitales", "Helen Chufe", "Inés Queleto", "Enrique Cido", "Francisco Jones",
            "Lola Mento", "Josechu Letón"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1 = findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_alumnes, alumnos);
        lv1.setAdapter(adapter);


        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent NotasActivity = new Intent(getApplicationContext(), NotasActivity.class);
                NotasActivity.putExtra("nom", lv1.getItemAtPosition(position).toString());
                NotasActivity.putExtra("position", position);
                startActivity(NotasActivity);
            }
        });
    }
}