package com.example.act6_buscaminas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /* Array booleà de dues dimensions que representa el camp de mines.
    El valor true indicarà que en aquella casella hi ha una bomba. El valor
    false indicarà que en aquella casella no hi ha cap bomba */
    private boolean[][] campo = new boolean[12][10];
    private int contadorCasillas = 0;

    /* Variable que comptabilitza en nombre d'encerts de l'usuari, és a dir,
    nombre de caselles obertes sense morir. Quan aquesta variable arribi a 93
    significarà que l'usuari ha guanyat la partida */
    private int aciertos;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aciertos = 0;

        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo[i].length; j++) {
                campo[i][j] = false;
            }
        }

        for (int i = 0; i < 15; i++) {
            campo[(int)(Math.floor(Math.random()*(0-11+1)+11))][(int)(Math.floor(Math.random()*(0-8+1)+8))] = true;
        }

    }

    public void abrirCasilla(View view) {
        /* Variable que emmagatzema la posició de la casella oberta
        per l'usuari */
        String posicion;
        String aux;
        int bombes = 0;
        int fila, columna;
        /* Objecte de tipus TextView que quedarà associat al TextView
        corresponent a la casella oberta per l'usuari */
        TextView casilla;

        posicion = view.getTag().toString();
        casilla = findViewById(view.getId());

        aux = posicion.substring(0, 2);
        fila = Integer.parseInt(aux);

        aux = posicion.substring(3, 5);
        columna = Integer.parseInt(aux);

        if (campo[fila][columna]) {

            casilla.setBackgroundColor(Color.BLACK);
            casilla.setTextColor(Color.RED);
            casilla.setText("X");

            Intent lose = new Intent(getApplicationContext(), BoomActivity.class);
            startActivity(lose);

        } else {
            if (fila != 0 && columna != 0 && campo[fila - 1][columna - 1] == true) {
                bombes++;
            }
            if (fila != 0 && campo[fila - 1][columna] == true) {
                bombes++;
            }
            if (fila != 0 && columna != campo.length - 1 && campo[fila - 1][columna + 1] == true) {
                bombes++;
            }
            if (columna != 0 && campo[fila][columna - 1] == true) {
                bombes++;
            }
            if (columna != campo.length - 1 && campo[fila][columna + 1] == true) {
                bombes++;
            }
            if (columna != 0 && fila != campo.length - 1 && campo[fila + 1][columna - 1] == true) {
                bombes++;
            }
            if (fila != campo.length - 1 && campo[fila + 1][columna] == true) {
                bombes++;
            }
            if (fila != campo.length - 1 && columna != campo.length - 1 && campo[fila + 1][columna + 1] == true) {
                bombes++;
            }
            if (bombes == 0) {
                casilla.setBackgroundColor(Color.WHITE);
                casilla.setTextColor(Color.GREEN);
            } else if (bombes == 1 || bombes == 2) {
                casilla.setBackgroundColor(Color.WHITE);
                casilla.setTextColor(Color.BLUE);
            } else if (bombes >= 3) {
                casilla.setBackgroundColor(Color.WHITE);
                casilla.setTextColor(Color.RED);
            }
            casilla.setText(Integer.toString(bombes));
        }

        /* La següent línia s'ha d'eliminar (o comentar), simplement
        serveix perquè puguis veure com es rep la posició de la
        casella oberta per l'usuari */
        /*Toast.makeText(this, Integer.toString(fila) + "." + Integer.toString(columna) , Toast.LENGTH_SHORT).show();*/
        contadorCasillas++;
        if (contadorCasillas == 93) {
            Intent win = new Intent(getApplicationContext(), WinActivity.class);
            startActivity(win);
        }
    }

}
