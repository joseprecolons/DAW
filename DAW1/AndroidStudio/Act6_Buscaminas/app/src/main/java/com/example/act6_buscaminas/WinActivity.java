package com.example.act6_buscaminas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class WinActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Toast.makeText(this,"QUE INTENTAS MAQUINILLA, CHUPALA!" , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
    }

    public void bNewGame(View view) {
        Intent NewGame = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(NewGame);
    }
}