package com.example.android.kenyaguide.Recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.android.kenyaguide.R;

import java.util.ArrayList;

/**
 * Created by Gikonyo hannah on 30.04.2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<viewHolder> {
    Context context;
    ArrayList<Attraction> attractions ;

    public RecyclerAdapter(Context context, ArrayList<Attraction> attractions) {
        this.context = context;
        this.attractions = attractions;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        View v= LayoutInflater.from (parent.getContext ()).inflate (R.layout.custom_xml,null);
        viewHolder holder=new viewHolder (v);
        return holder;
    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {
        holder.image.setImageResource (attractions.get (position).getImage ());
        holder.name.setText (attractions.get (position).getName ());
        holder.description.setText (attractions.get (position).getDescription ());
        holder.setItemClickListener (new ItemClickListener () {
            @Override
            public void onItemClick(View view, int pos) {
                Toast.makeText (context, attractions.get (pos).getName (), Toast.LENGTH_SHORT);
            }
        });

    }
        @Override
        public int getItemCount() {

            return attractions.size ();



    }

}
