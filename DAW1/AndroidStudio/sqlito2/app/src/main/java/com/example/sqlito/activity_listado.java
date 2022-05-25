package com.example.sqlito;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class activity_listado extends AppCompatActivity {

    private ListView lvProductos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        lvProductos = findViewById(R.id.lvProductos);

        AdminSQLiteOpenHelper conexionDB = new AdminSQLiteOpenHelper(this, "SQLitoDB", null, 1);
        SQLiteDatabase db = conexionDB.getWritableDatabase();

        Cursor registros = db.rawQuery("SELECT nombre FROM productos", null);

        String[] productos = new String[registros.getCount()];

        while (registros.moveToNext()) {
            productos[registros.getPosition()] = registros.getString(0);
        }
        db.close();
        conexionDB.close();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, productos);
        lvProductos.setAdapter(adapter);
    }

}
