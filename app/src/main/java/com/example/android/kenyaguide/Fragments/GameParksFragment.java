package com.example.android.kenyaguide.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.kenyaguide.R;
import com.example.android.kenyaguide.Recycler.Attraction;
import com.example.android.kenyaguide.Recycler.RecyclerAdapter;

import java.util.ArrayList;

import static com.example.android.kenyaguide.R.drawable;
import static com.example.android.kenyaguide.R.id;
import static com.example.android.kenyaguide.R.layout;

/**
 * Created by Gikonyo hannah on 30.04.2018.
 */

public class GameParksFragment extends android.support.v4.app.Fragment {
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate (layout.gameparks_fragment, null);
        RecyclerView recyclerView = view.findViewById (id.recyclerGameParks);
        recyclerView.setLayoutManager (new LinearLayoutManager (this.getActivity ()));
        recyclerView.setAdapter (new RecyclerAdapter (this.getActivity (), getGameParksAttractions ()));
        return view;

    }

    private ArrayList<Attraction> getGameParksAttractions() {
        ArrayList<Attraction> attractions = new ArrayList<> ();
        Attraction attraction = new Attraction (drawable.masaimara, getString(R.string.masaiMaraGamePark),getString(R.string.masaiMaraDescription));
        attractions.add (attraction);
        attraction = new Attraction (drawable.abepic,getString(R.string.abedareGameReserve), getString(R.string.abedareDescription));
        attractions.add (attraction);
        attraction = new Attraction (drawable.nairobinatpark,getString(R.string.nairobiNationalPark), getString(R.string.nairobiNationalParkDescription));
        attractions.add (attraction);
        attraction = new Attraction (drawable.merunatpark, getString(R.string.meruNationalGamePark), getString(R.string.meruNationalParkDes)  + getString(R.string.meruNationalParkDes2) + getString(R.string.meruNationalParkDes3) + getString(R.string.meruNationalParkDes4) + getString(R.string.MeruNationalParkDes5) + getString(R.string.meruNationalParkDes6));
        attractions.add (attraction);
        return attractions;
    }


}




















