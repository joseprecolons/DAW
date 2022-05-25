package com.example.uf2_ac3persistnciadedadesambsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNom;
    private ListView lvProductes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNom = findViewById(R.id.etNom);
        lvProductes = findViewById(R.id.lvProductes);

        AdminSQLiteOpenHelper conexionDB = new AdminSQLiteOpenHelper(this, "SQLiteDB", null, 1);
        SQLiteDatabase db = conexionDB.getWritableDatabase();

        Cursor registros = db.rawQuery("SELECT nombre FROM productos", null);

        String[] productos = new String[registros.getCount()];

        while (registros.moveToNext()) {
            productos[registros.getPosition()] = registros.getString(0);
        }
        db.close();
        conexionDB.close();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, productos);
        lvProductes.setAdapter(adapter);
    }

    public void buscarProducte(View view) {
        AdminSQLiteOpenHelper conexionDB = new AdminSQLiteOpenHelper(this, "SQLiteDB", null, 1);
        SQLiteDatabase db = conexionDB.getWritableDatabase();

        String nomR = etNom.getText().toString();

        if (!nomR.isEmpty()) {

            Cursor registros = db.rawQuery("SELECT nombre FROM productos WHERE nombre = " + nomR, null);

            String[] productos = new String[registros.getCount()];

            while (registros.moveToNext()) {
                productos[registros.getPosition()] = registros.getString(0);
            }

            db.close();
            conexionDB.close();

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, productos);
            lvProductes.setAdapter(adapter);
        }
    }

    public void afegirProductes(View view) {
        Intent obrirAfegirProductes = new Intent(this, Activity_addProducte.class);
        startActivity(obrirAfegirProductes);
    }
}