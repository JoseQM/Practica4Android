package com.example.practica4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class JuegoDeAciertos extends AppCompatActivity
{

    PaisesFrag paises;
    CapitalesFrag capitales;

    TextView txtPais;
    TextView txtCapital;

    ListView lista;
    ListView lista2;

    Fragment country;
    Fragment capital;

    String[] arrayPaises;
    String[] arrayCapitales;

    Button btnComprobar;

    Fragment fragCorrecto;
    Fragment fragError;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_de_aciertos);

        paises = new PaisesFrag();
        capitales= new CapitalesFrag();

        txtPais = findViewById(R.id.txtPais);
        txtCapital = findViewById(R.id.txtCapital);

        arrayPaises = getResources().getStringArray(R.array.paises);
        arrayCapitales = getResources().getStringArray(R.array.capitales);

        country = (Fragment)getSupportFragmentManager().findFragmentById(R.id.fragment);
        capital = (Fragment)getSupportFragmentManager().findFragmentById(R.id.fragment2);

        lista = country.getActivity().findViewById(R.id.listPaises);
        lista2 = capital.getActivity().findViewById(R.id.listCapitales);

        btnComprobar = findViewById(R.id.btnCheck);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

                String pais = "";

                Toast.makeText(JuegoDeAciertos.this, "Pais Seleccionado", Toast.LENGTH_SHORT).show();

                switch (position)
                {
                    case 0:
                        pais = arrayPaises[0];
                        break;

                    case 1:
                        pais = arrayPaises[1];
                        break;

                    case 2:
                        pais = arrayPaises[2];
                        break;

                    case 3:
                        pais = arrayPaises[3];
                        break;

                    case 4:
                        pais = arrayPaises[4];
                        break;

                    case 5:
                        pais = arrayPaises[5];
                        break;

                    case 6:
                        pais = arrayPaises[6];
                        break;

                    case 7:
                        pais = arrayPaises[7];
                        break;

                    case 8:
                        pais = arrayPaises[8];
                        break;
                }
                txtPais.setText(pais);
            }
        });


        lista2.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {

                String capital = "";

                Toast.makeText(JuegoDeAciertos.this, "Capital Seleccionada", Toast.LENGTH_SHORT).show();

                switch (position)
                {
                    case 0:
                        capital = arrayCapitales[0];
                        break;

                    case 1:
                        capital = arrayCapitales[1];
                        break;

                    case 2:
                        capital = arrayCapitales[2];
                        break;

                    case 3:
                        capital = arrayCapitales[3];
                        break;

                    case 4:
                        capital = arrayCapitales[4];
                        break;

                    case 5:
                        capital = arrayCapitales[5];
                        break;

                    case 6:
                        capital = arrayCapitales[6];
                        break;

                    case 7:
                        capital = arrayCapitales[7];
                        break;

                    case 8:
                        capital = arrayCapitales[8];
                        break;
                }
                txtCapital.setText(capital);
            }
        });

        btnComprobar.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                String paisito = txtPais.getText().toString();
                String capitalio = txtCapital.getText().toString();

                int posicionPais = lista.getSelectedItemPosition();
                int posicionCapital = lista2.getSelectedItemPosition();

                //Toast.makeText(JuegoDeAciertos.this, "QUE NO", Toast.LENGTH_SHORT).show();

                if (paisito.equals(getString(R.string.españa)) && capitalio.equals(getString(R.string.madrid)))
                {
                    fragCorrecto = new FragmentCorrecto();
                    FragmentTransaction transacction1 = getSupportFragmentManager().beginTransaction();
                    transacction1.add(R.id.container, fragCorrecto);
                    transacction1.commit();
                }
                else if (paisito.equals(getString(R.string.portugal)) && capitalio.equals(getString(R.string.lisboa)))
                {
                    fragCorrecto = new FragmentCorrecto();
                    FragmentTransaction transacction2 = getSupportFragmentManager().beginTransaction();
                    transacction2.add(R.id.container, fragCorrecto);
                    transacction2.commit();
                }
                else if (paisito.equals(getString(R.string.francia)) && capitalio.equals(getString(R.string.paris)))
                {
                    fragCorrecto = new FragmentCorrecto();
                    FragmentTransaction transacction3 = getSupportFragmentManager().beginTransaction();
                    transacction3.add(R.id.container, fragCorrecto);
                    transacction3.commit();
                }
                else if (paisito.equals(getString(R.string.italia)) && capitalio.equals(getString(R.string.roma)))
                {
                    fragCorrecto = new FragmentCorrecto();
                    FragmentTransaction transacction4 = getSupportFragmentManager().beginTransaction();
                    transacction4.add(R.id.container, fragCorrecto);
                    transacction4.commit();
                }
                else if (paisito.equals(getString(R.string.holanda)) && capitalio.equals(getString(R.string.amsterdam)))
                {
                    fragCorrecto = new FragmentCorrecto();
                    FragmentTransaction transacction5 = getSupportFragmentManager().beginTransaction();
                    transacction5.add(R.id.container, fragCorrecto);
                    transacction5.commit();
                }
                else if (paisito.equals(getString(R.string.alemania)) && capitalio.equals(getString(R.string.berlin)))
                {
                    fragCorrecto = new FragmentCorrecto();
                    FragmentTransaction transacction6 = getSupportFragmentManager().beginTransaction();
                    transacction6.add(R.id.container, fragCorrecto);
                    transacction6.commit();
                }
                else if (paisito.equals(getString(R.string.noruega)) && capitalio.equals(getString(R.string.oslo)))
                {
                    fragCorrecto = new FragmentCorrecto();
                    FragmentTransaction transacction7 = getSupportFragmentManager().beginTransaction();
                    transacction7.add(R.id.container, fragCorrecto);
                    transacction7.commit();
                }
                else if (paisito.equals(getString(R.string.colombia)) && capitalio.equals(getString(R.string.bogota)))
                {
                    fragCorrecto = new FragmentCorrecto();
                    FragmentTransaction transacction8 = getSupportFragmentManager().beginTransaction();
                    transacction8.add(R.id.container, fragCorrecto);
                    transacction8.commit();
                }
                else if (paisito.equals(getString(R.string.peru)) && capitalio.equals(getString(R.string.lima)))
                {
                    fragCorrecto = new FragmentCorrecto();
                    FragmentTransaction transacction9 = getSupportFragmentManager().beginTransaction();
                    transacction9.add(R.id.container, fragCorrecto);
                    transacction9.commit();
                }
                else
                    {
                        fragError = new FragmentoError();
                        FragmentTransaction transacctionX = getSupportFragmentManager().beginTransaction();
                        transacctionX.add(R.id.container, fragError);
                        transacctionX.commit();
                    }
            }
        });
    }
}