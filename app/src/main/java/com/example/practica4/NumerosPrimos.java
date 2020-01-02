package com.example.practica4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumerosPrimos extends AppCompatActivity
{

    Button btnCalcular;
    EditText txtNumero;
    TextView txtResultado;

    int primo;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_primos);

        btnCalcular = findViewById(R.id.btnCalcular);
        txtNumero = findViewById(R.id.txtNumero);
        txtResultado = findViewById(R.id.txtResultadoPrimo);


        btnCalcular.setOnClickListener(new Button.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                primo = Integer.parseInt(txtNumero.getText().toString());
                contador = 0;


                for (int i = 1; i <= primo; i++)
                    if ((primo % i) == 0)
                    {
                        contador++;
                    }

                if (contador <= 2)
                {
                    txtResultado.setText("El número es primo");
                }
                else
                    {
                        txtResultado.setText("El número no es primo");
                    }
            }
        });
    };
}