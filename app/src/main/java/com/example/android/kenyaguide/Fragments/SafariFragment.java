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

import static com.example.android.kenyaguide.R.drawable;
import static com.example.android.kenyaguide.R.id;
import static com.example.android.kenyaguide.R.layout;

/**
 * Created by Gikonyo hannah on 30.04.2018.
 */

public class SafariFragment extends Fragment{

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(layout.safari_fragment,null);
        RecyclerView recyclerView=(RecyclerView)view.findViewById (id.recyclerSafari);
        recyclerView.setLayoutManager (new LinearLayoutManager (this.getActivity ()));
        recyclerView.setAdapter (new RecyclerAdapter (this.getActivity (),getSafariAttractions()));
        return view;}
    private ArrayList<Attraction> getSafariAttractions() {
        ArrayList<Attraction> attractions = new ArrayList<> ();
        Attraction attraction=new Attraction ( drawable.safarimombasa,getString(R.string.karibukenya), getString(R.string.karibuKenyaDescription) + getString(R.string.karibuKenyaDescription1) + getString(R.string.KaribuKenyaDescription2));
        attractions.add (attraction);
        attraction=new Attraction ( drawable.kensans,getString(R.string.KaribuKenyaZanzibar),getString(R.string.karibuKenyaZanzibardDes) + getString(R.string.karibuKenyaZanzibarDes2) + getString(R.string.karibuKenyaZanzibarDes3));
        attractions.add (attraction);
        attraction=new Attraction ( drawable.keniadubai,getString(R.string.karibuKenyaDubai),getString(R.string.karibuKenyaDubai1) + getString(R.string.karibuKenyaDubaiDes2) + getString(R.string.karibuKenyaDubaiDes3) + " ");
        attractions.add (attraction);
        attraction=new Attraction ( drawable.wildkenya,getString(R.string.wildMombasa),getString(R.string.wildMombasaDes) + getString(R.string.wildMombasaDes2) + getString(R.string.wildMombasaDes3));
        attractions.add (attraction);
        return attractions;}

    }








