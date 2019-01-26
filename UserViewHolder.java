package com.example.shikh.travel.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shikh.travel.Interface.ItemClickListener;
import com.example.shikh.travel.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView txtDestinationName;
    public ImageView imageView;

    private ItemClickListener itemClickListener;

    public MenuViewHolder(View itemView){
        super(itemView);

        txtDestinationName = (TextView)itemView.findViewById(R.id.destination_name);
        imageView = (ImageView)itemView.findViewById(R.id.destination_image);

        itemView.setOnClickListener(this);
        }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener =itemClickListener;
    }

    @Override

    public void onClick(View view){
        itemClickListener.onClick(view,getAdapterPosition(),false);

    }
}


