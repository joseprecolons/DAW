package com.example.porzzioni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.etEmail);
        password = findViewById(R.id.etPassw);
    }

    public void bEntrar(View view) {

        String mail = email.getText().toString();
        String passw = password.getText().toString();

        if (mail.equals("usuario@email.com") && passw.equals("user1234") ) {
            Intent login = new Intent(getApplicationContext(), PersonalizarActivity.class);
            startActivity(login);
        } else {
            Toast toast = Toast.makeText(this, "Les dades son incorrectes", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}