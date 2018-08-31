package com.example.android.kenyaguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Gikonyo hannah on 30.04.2018.
 */

public class MFragmentPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> pages=new ArrayList<> ();
    ArrayList<String> titles=new ArrayList<> ();

    public MFragmentPagerAdapter(FragmentManager fm) {
        super (fm);}
    @Override
    public Fragment getItem( int position) {
        return pages.get (position);
    }

    @Override
    public int getCount()
    {
        return titles.size ();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return  titles.get(position).toString ();

    }
    public void addFragment(Fragment fragment,String title){
        pages.add (fragment);
        titles.add(title);
    }
}

