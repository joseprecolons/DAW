package com.example.provapractica1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    private EditText etGuardarFichero;
    private EditText etLeerFichero;
    private EditText etGuardarPreferences;
    private EditText etLeerPreferences;
    private EditText etGuardarBaseDatosCodigo;
    private EditText etGuardarBaseDatosNombre;
    private EditText etLeerBaseDatosNombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etGuardarFichero = findViewById(R.id.etGuardarFichero);
        etLeerFichero = findViewById(R.id.etLeerFichero);
        etGuardarPreferences = findViewById(R.id.etGuardarPreferences);
        etLeerPreferences = findViewById(R.id.etLeerPreferences);
        etGuardarBaseDatosCodigo = findViewById(R.id.etGuardarBaseDatosCodigo);
        etGuardarBaseDatosNombre = findViewById(R.id.etGuardarBaseDatosNombre);
        etLeerBaseDatosNombre = findViewById(R.id.etLeerBaseDatosNombre);

    }

    public void guardarFichero(View view) {

        try {
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput("test.txt", Activity.MODE_PRIVATE));
            archivo.write(etGuardarFichero.getText().toString());
            archivo.flush();
            archivo.close();
        } catch (IOException e) {

        }
        Toast.makeText(this, "Tarea guardada", Toast.LENGTH_SHORT).show();
    }

    public void leerFicher(View view) {

        String[] archivos = fileList();

        if(ArchivoExiste(archivos, "test.txt")) {
            try {
                InputStreamReader archivo = new InputStreamReader(openFileInput("test.txt"));
                BufferedReader br = new BufferedReader(archivo);
                String linea = br.readLine();
                String fileFull = "";

                while (linea != null) {
                    fileFull += linea + "\n";
                    linea = br.readLine();
                }
                etLeerFichero.setText(fileFull);
                br.close();
                archivo.close();
            } catch (IOException e) {

            }
        }
    }

    private boolean ArchivoExiste (String [] archivos, String nArchivo) {
        for (int i = 0; i < archivos.length; i++) {
            if(nArchivo.equals(archivos[i])) {
                return true;
            }
        }
        return false;
    }

    public void guardarPreferencia(View view) {
        SharedPreferences tareasImportantes = getSharedPreferences("pref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = tareasImportantes.edit();
        editor.putString("Pref", etGuardarPreferences.getText().toString());
        editor.commit();
    }

    public void leerPreferencia(View view) {
        SharedPreferences preferences = getSharedPreferences("pref", Context.MODE_PRIVATE);
        etLeerPreferences.setText(preferences.getString("Pref", ""));
    }

    public void guardarBaseDeDatos(View view) {
        AdminSQLiteOpenHelper conexionDB = new AdminSQLiteOpenHelper(this, "sqlitedb", null, 1);
        SQLiteDatabase db = conexionDB.getWritableDatabase();

        String codigoR = etGuardarBaseDatosCodigo.getText().toString();
        String nombreR = etGuardarBaseDatosNombre.getText().toString();

        if (!codigoR.isEmpty() && !nombreR.isEmpty()) {

            ContentValues registro = new ContentValues();
            registro.put("codigo", codigoR);
            registro.put("nombre", nombreR);

            db.insert("productos", null, registro);

            etGuardarBaseDatosCodigo.setText("");
            etGuardarBaseDatosNombre.setText("");

            Toast.makeText(this, "L'insert en la base de dades s'ha completat", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show();
        }

        db.close();
        conexionDB.close();
    }

    public void leerBaseDeDatos(View view) {
        AdminSQLiteOpenHelper conexionDB = new AdminSQLiteOpenHelper(this, "sqlitedb", null, 1);
        SQLiteDatabase db = conexionDB.getWritableDatabase();

        String codigoR = etGuardarBaseDatosCodigo.getText().toString();

        if (!codigoR.isEmpty()) {

            Cursor registros = db.rawQuery("SELECT nombre FROM productos WHERE codigo = " + codigoR, null);

            if (registros.moveToFirst()) {
                etLeerBaseDatosNombre.setText(registros.getString(0));
            } else {
                Toast.makeText(this, "No se ha encontrado el producto", Toast.LENGTH_SHORT).show();
            }

            db.close();
            conexionDB.close();
        }
    }


}