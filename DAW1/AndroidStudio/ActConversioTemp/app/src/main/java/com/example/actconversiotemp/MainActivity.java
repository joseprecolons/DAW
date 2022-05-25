package com.example.actconversiotemp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView Celsius;
    private TextView Conversio;
    private TextView ConversioSimbol;
    private TextView Buttonlock;
    private boolean Block;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Celsius = findViewById(R.id.tvCelsius);
        Conversio = findViewById(R.id.tvConversio);
        ConversioSimbol = findViewById(R.id.tvConversioSimbol);
        Buttonlock = findViewById(R.id.lock);
        Block = false;
    }

    public void ctok(View view) {

        if (Block == false) {
            Double conversioK;
            String simbol;

            conversioK = Double.parseDouble(Celsius.getText().toString());
            conversioK = (conversioK + 273.15);
            Conversio.setText(conversioK.toString());

            simbol = "K";
            ConversioSimbol.setText(simbol);
        }
    }

    public void ctof(View view) {

        if (Block == false) {
            Double conversioF;
            String simbol;

            conversioF = Double.parseDouble(Celsius.getText().toString());
            conversioF = ((conversioF * 9) / 5) + 32;
            Conversio.setText(conversioF.toString());

            simbol = "ºF";
            ConversioSimbol.setText(simbol);
        }
    }

    public void bborrar(View view) {

        if (Block == false) {
            String borrar = Celsius.getText().toString().trim();

            if (borrar.length() != 0) {
                borrar = borrar.substring(0, borrar.length() - 1);

                Celsius.setText(borrar);
            }
        }
    }

    public void bpunt(View view) {

        if (Block == false) {
            String valor;

            valor = Celsius.getText().toString();
            valor = valor + ".";

            Celsius.setText(valor);
        }
    }

    public void b0(View view) {

        if(Block ==false) {
        String valor;

        valor = Celsius.getText().toString();
        valor = valor + "0";

        Celsius.setText(valor);
    }
}

    public void b1 (View view) {

        if (Block == false) {
            String valor;

            valor = Celsius.getText().toString();
            valor = valor + "1";

            Celsius.setText(valor);
        }
    }

    public void b2 (View view) {

        if (Block == false) {
            String valor;

            valor = Celsius.getText().toString();
            valor = valor + "2";

            Celsius.setText(valor);
        }
    }

    public void b3 (View view) {

        if (Block == false) {
            String valor;

            valor = Celsius.getText().toString();
            valor = valor + "3";

            Celsius.setText(valor);
        }
    }

    public void b4 (View view) {

        if (Block == false) {
            String valor;

            valor = Celsius.getText().toString();
            valor = valor + "4";

            Celsius.setText(valor);
        }
    }
    public void b5 (View view) {

        if (Block == false) {
            String valor;

            valor = Celsius.getText().toString();
            valor = valor + "5";

            Celsius.setText(valor);
        }
    }

    public void b6 (View view) {

        if (Block == false) {
            String valor;

            valor = Celsius.getText().toString();
            valor = valor + "6";

            Celsius.setText(valor);
        }
    }

    public void b7 (View view) {

        if (Block == false) {
            String valor;

            valor = Celsius.getText().toString();
            valor = valor + "7";

            Celsius.setText(valor);
        }
    }

    public void b8 (View view) {

        if (Block == false) {
            String valor;

            valor = Celsius.getText().toString();
            valor = valor + "8";

            Celsius.setText(valor);
        }
    }

    public void b9 (View view) {

        if (Block == false) {
            String valor;

            valor = Celsius.getText().toString();
            valor = valor + "9";

            Celsius.setText(valor);
        }
    }

    public void bloquear (View view) {
        String textbutton;
        if (Block == false) {
            Block = true;
            textbutton = "unlock";
            Buttonlock.setText(textbutton);
        } else {
            Block = false;
            textbutton = "lock";
            Buttonlock.setText(textbutton);
        }

    }

}