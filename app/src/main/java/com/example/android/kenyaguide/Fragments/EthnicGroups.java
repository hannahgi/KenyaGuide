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

public class EthnicGroups extends Fragment {
    @Nullable
    @Override


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate (R.layout.ethnic_fragment, null);
        RecyclerView recyclerView = (RecyclerView) view.findViewById (R.id.recyclerEthic);
        recyclerView.setLayoutManager (new LinearLayoutManager (this.getActivity ()));
        recyclerView.setAdapter (new RecyclerAdapter (this.getActivity (), getEthnicAttractions ()));
        return view;

    }

    private ArrayList<Attraction> getEthnicAttractions() {
        ArrayList<Attraction> attractions = new ArrayList<> ();
        Attraction attraction = new Attraction (R.drawable.masaipic, getString (R.string.masaiTribe), getString (R.string.Masai));
        attractions.add (attraction);
        attraction = new Attraction (R.drawable.kambapic, getString (R.string.kambaTribe), getString (R.string.kambaTribeDescription));
        attractions.add (attraction);
        attraction = new Attraction (R.drawable.kikuyupic, getString (R.string.kikuyuTribe), getString (R.string.KikuyuDescription));
        attractions.add (attraction);
        attraction = new Attraction (R.drawable.merupic, getString (R.string.meruTribe), getString (R.string.meruTribeDescription));
        attractions.add (attraction);
        attraction = new Attraction (R.drawable.kikuyupic, getString (R.string.turkanaTribe), getString (R.string.turkanaDescription));
        attractions.add (attraction);
        return attractions;
    }

}













