package com.example.android.kenyaguide.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.kenyaguide.R;
import com.example.android.kenyaguide.Recycler.Attraction;
import com.example.android.kenyaguide.Recycler.RecyclerAdapter;

import java.util.ArrayList;

/**
 * Created by Gikonyo hannah on 30.04.2018.
 */

public class HotelsFragment extends Fragment {

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate (R.layout.hotels_fragment, null);
        RecyclerView recyclerView = (RecyclerView) view.findViewById (R.id.recyclerHotels);
        recyclerView.setLayoutManager (new LinearLayoutManager (this.getActivity ()));
        recyclerView.setAdapter (new RecyclerAdapter (this.getActivity (), getHotelsAttractions ()));
        return view;
    }


    private ArrayList<Attraction> getHotelsAttractions() {
        ArrayList<Attraction> attractions = new ArrayList<> ();
        Attraction attraction = new Attraction (R.drawable.sarova, getString (R.string.sarovaSternleyHotel), getString (R.string.sarovaStanleyWebsite));
        attractions.add (attraction);
        attraction = new Attraction (R.drawable.hilto, getString (R.string.hiltonHotel), getString (R.string.hiltonHotelDescription));
        attractions.add (attraction);
        attraction = new Attraction (R.drawable.emerald, getString (R.string.emeraldHotel), getString (R.string.emeraldDescription));
        attractions.add (attraction);
        attraction = new Attraction (R.drawable.salahotel, getString (R.string.salamaHotel), getString (R.string.salamaHotelDescription));
        attractions.add (attraction);
        attraction = new Attraction (R.drawable.turkana, getString (R.string.turkanaHotels), getString (R.string.turkanaHotelDescription));
        attractions.add (attraction);
        return attractions;
    }

}







