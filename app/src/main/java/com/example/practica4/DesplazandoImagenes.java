package com.example.practica4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class DesplazandoImagenes extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desplazando_imagenes);

        ViewPager viewP = findViewById(R.id.viewPager);
        viewP.setAdapter(new ViewPagerDesplazandoImagenes(getSupportFragmentManager()));
    }
}