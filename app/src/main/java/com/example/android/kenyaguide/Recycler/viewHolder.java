package com.example.android.kenyaguide.Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.kenyaguide.R;

/**
 * Created by Gikonyo hannah on 30.04.2018.
 */

public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    ImageView image;
    TextView name;
    TextView description;
    ItemClickListener itemClickListener;
    public viewHolder(View itemView) {
        super (itemView);
        image=itemView.findViewById (R.id.imageView);
        name=itemView.findViewById (R.id.name);
        description=itemView.findViewById (R.id.description);
        itemView.setOnClickListener (this);
    }
    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick (view,getLayoutPosition ());
    }
}
