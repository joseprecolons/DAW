package com.example.activitat2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText text1;
    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);

    }

    public void afegirTasca(View view) {
        String tasca;
        String llistatTasques;

        tasca = text1.getText().toString();
        llistatTasques = text2.getText().toString();

        llistatTasques = llistatTasques + "\n" + tasca;

        text2.setText(llistatTasques);

        text1.setText("");
    }
}
