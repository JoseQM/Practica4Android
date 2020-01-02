package com.example.practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    Button btnPrimo;
    Button btnAcierto;
    Button btnDesplazando;
    Button btnSelecciona;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrimo = findViewById(R.id.btnPrimo);
        btnAcierto = findViewById(R.id.btnAcierto);
        btnDesplazando = findViewById(R.id.btnDesplazando);
        btnSelecciona = findViewById(R.id.btnSelecciona);


        btnDesplazando.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent3 = new Intent (v.getContext(), DesplazandoImagenes.class);
                startActivity(intent3);
            }
        });

        btnSelecciona.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent4 = new Intent (v.getContext(), SeleccionaImagenes.class);
                startActivity(intent4);
            }
        });
    }

    public void abrirPrimos(View view)
    {
        Intent intent = new Intent (this, NumerosPrimos.class);
        startActivity(intent);
    }

    public void abrirAcierto(View view)
    {
        Intent intent2 = new Intent (this, JuegoDeAciertos.class);
        startActivity(intent2);
    }

}