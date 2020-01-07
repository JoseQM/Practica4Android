package com.example.practica4;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PaisesFrag extends Fragment
{

    String[] arrayPaises;
    String[] arrayCapitales;
    ListView listView;

    String pais = "";

    ArrayAdapter<String> listPaisesAdapter;

    //JuegoDeAciertos juego;


    //fragmentListenerPaises fragmentListenerCountry;


    public PaisesFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_paises, container, false);

        arrayPaises = getResources().getStringArray(R.array.paises);
        arrayCapitales = getResources().getStringArray(R.array.capitales);
        listView = view.findViewById(R.id.listPaises);

        listPaisesAdapter = new ArrayAdapter<String>(
                getActivity().getApplicationContext(),
                android.R.layout.simple_list_item_1,
                arrayPaises
        );

        listView.setAdapter(listPaisesAdapter);

        // Inflate the layout for this fragment
        return view;
    }
}