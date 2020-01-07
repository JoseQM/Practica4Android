package com.example.practica4;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CapitalesFrag extends Fragment {


    String[] arrayCapitales;
    ListView listView2;

    ArrayAdapter<String> listCapitalesAdapter;

    public CapitalesFrag()
    {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_capitales, container, false);

        arrayCapitales = getResources().getStringArray(R.array.capitales);
        listView2 = view.findViewById(R.id.listCapitales);

        listCapitalesAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                arrayCapitales
        );

        listView2.setAdapter(listCapitalesAdapter);

        // Inflate the layout for this fragment
        return view;
    }
}