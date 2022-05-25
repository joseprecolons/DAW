package com.example.sqlito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etCodigo, etNombre, etPrecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCodigo = findViewById(R.id.etCodigo);
        etNombre = findViewById(R.id.etNombre);
        etPrecio = findViewById(R.id.etPrecio);
    }

    public void nuevoProducto(View view) {
        AdminSQLiteOpenHelper conexionDB = new AdminSQLiteOpenHelper(this, "SQLitoDB", null, 1);
        SQLiteDatabase db = conexionDB.getWritableDatabase();

        String codigoR = etCodigo.getText().toString();
        String nombreR = etNombre.getText().toString();
        String precioR = etPrecio.getText().toString();

        if (!codigoR.isEmpty() && !nombreR.isEmpty() && !precioR.isEmpty()) {

            ContentValues registro = new ContentValues();
            registro.put("codigo", codigoR);
            registro.put("nombre", nombreR);
            registro.put("precio", precioR);

            db.insert("productos", null, registro);

            etCodigo.setText("");
            etNombre.setText("");
            etPrecio.setText("");

            Toast.makeText(this, "L'insert en la base de dades s'ha completat", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
        }

        db.close();
        conexionDB.close();
    }

    public void buscarProducto(View view) {
        AdminSQLiteOpenHelper conexionDB = new AdminSQLiteOpenHelper(this, "SQLitoDB", null, 1);
        SQLiteDatabase db = conexionDB.getWritableDatabase();

        String codigoR = etCodigo.getText().toString();

        if (!codigoR.isEmpty()) {

            Cursor registros = db.rawQuery("SELECT nombre, precio FROM productos WHERE codigo = " + codigoR, null);

            if (registros.moveToFirst()) {
                etNombre.setText(registros.getString(0));
                etPrecio.setText(registros.getString(1));
            } else {
                Toast.makeText(this, "No se ha encontrado el producto", Toast.LENGTH_SHORT).show();
            }

            db.close();
            conexionDB.close();
        }
    }

    public void modificarProducto(View view) {
        AdminSQLiteOpenHelper conexionDB = new AdminSQLiteOpenHelper(this, "SQLitoDB", null, 1);
        SQLiteDatabase db = conexionDB.getWritableDatabase();

        String codigoR = etCodigo.getText().toString();
        String nombreR = etNombre.getText().toString();
        String precioR = etPrecio.getText().toString();

        if (!codigoR.isEmpty() && !nombreR.isEmpty() && !precioR.isEmpty()) {

            ContentValues registro = new ContentValues();
            registro.put("codigo", codigoR);
            registro.put("nombre", nombreR);
            registro.put("precio", precioR);

            int numRegistros = db.update("productos", registro, "codigo=" + codigoR, null);

            if(numRegistros == 1) {
                etCodigo.setText("");
                etNombre.setText("");
                etPrecio.setText("");
                Toast.makeText(this, "Datos guardados correctamente", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Producto innexistente", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
        }

        db.close();
        conexionDB.close();
    }

    public void eliminarProducto(View view) {
        AdminSQLiteOpenHelper conexionDB = new AdminSQLiteOpenHelper(this, "SQLitoDB", null, 1);
        SQLiteDatabase db = conexionDB.getWritableDatabase();

        String codigoR = etCodigo.getText().toString();

        if (!codigoR.isEmpty()) {

            ContentValues registro = new ContentValues();
            registro.put("codigo", codigoR);

            int numRegistros = db.delete("productos", "codigo=" + codigoR, null);

            if(numRegistros == 1) {
                etCodigo.setText("");
                etNombre.setText("");
                etPrecio.setText("");
                Toast.makeText(this, "Producto eliminado correctamente", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Producto innexistente", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "Debes indicar el codigo", Toast.LENGTH_SHORT).show();
        }

        db.close();
        conexionDB.close();
    }

    public void verProductos(View view) {
        Intent obrirListadoProductos = new Intent(this, activity_listado.class);
        startActivity(obrirListadoProductos);
    }
}