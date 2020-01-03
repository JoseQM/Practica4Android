package com.example.practica4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.TextView;

public class JuegoDeAciertos extends AppCompatActivity
{

    PaisesFrag paises;
    CapitalesFrag capitales;

    TextView txtSelec;

    FragmentManager supportFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_de_aciertos);

        paises = new PaisesFrag();
        capitales= new CapitalesFrag();

        txtSelec = findViewById(R.id.txtSelected);

    }
}