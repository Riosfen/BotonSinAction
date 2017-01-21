package com.example.samo_.botonsinaction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mas, menos;
    private TextView contador;
    private int cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cont = 0;
        menos = (Button) findViewById(R.id.button_menos);
        mas = (Button) findViewById(R.id.button_mas);
        contador = (TextView) findViewById(R.id.textView_contador);

        contador.setText(String.valueOf(cont));

    }

    // no olvidarse de poner en el xml el onclick que se llame igual que el metodo de abajo
    public void pulsarBoton(View view){

        switch(view.getId()){
            case R.id.button_mas:
                cont++;
                contador.setText(String.valueOf(cont));
                break;
            case R.id.button_menos:
                cont--;
                contador.setText(String.valueOf(cont));
                break;
        }

    }

}
