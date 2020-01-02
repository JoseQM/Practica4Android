package com.example.practica4;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class ViewPagerDesplazandoImagenes  extends FragmentPagerAdapter
{

    public ViewPagerDesplazandoImagenes(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return  new FragmentoPerro();

            case 1:
                return new FragmentoPerro2();
        }
        return null;
    }

    @Override
    public int getCount()
    {
        return 2;
    }
}