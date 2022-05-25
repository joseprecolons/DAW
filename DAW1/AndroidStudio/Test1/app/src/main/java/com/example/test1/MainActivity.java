package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etPrefijo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPrefijo = findViewById(R.id.etPrefijo);
    }

    public void ponTuTelefono(View View) {
        String movil;
        movil = "+34" + etPrefijo.getText().toString();

        etPrefijo.setText(movil);
    }
}