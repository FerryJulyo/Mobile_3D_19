package com.ferry.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ferry.recyclerview.R;
import com.ferry.recyclerview.DataHero;

import java.util.ArrayList;
import java.util.List;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.HeroViewHolder> {
    private List<DataHero> listHero = new ArrayList<>();

    public HeroAdapter(List<DataHero>listHero){
        this.listHero=listHero;
    }

    private OnUnsClickListener listener;

    public interface OnUnsClickListener {
        public void onClick(View view, int position);
    }

    public void setListener(OnUnsClickListener listener){
        this.listener=listener;
    }

    @NonNull
    @Override
    public HeroViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vh = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.activity_hero,viewGroup,false);
        HeroViewHolder viewHolder = new HeroViewHolder(vh);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HeroViewHolder HeroViewHolder, int i) {
        DataHero item=listHero.get(i);
        HeroViewHolder.namaHero.setText(item.getnamaHero());
        HeroViewHolder.gbrHero.setImageResource(item.getImage());

    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }

    public void filterList(List<DataHero> filteredList){
        listHero = filteredList;
        notifyDataSetChanged();
    }

    public class HeroViewHolder extends RecyclerView.ViewHolder{
        public ImageView gbrHero;
        public TextView namaHero;

        public HeroViewHolder(@NonNull View itemView){
            super(itemView);
            gbrHero=itemView.findViewById(R.id.gbrHero);
            namaHero=itemView.findViewById(R.id.namaHero);

            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    listener.onClick(v, getAdapterPosition());
                }
            });
        }
    }



    //void setFilter(ArrayList<DataHero>filterList){
    //listHero.addAll(filterList);
    // notifyDataSetChanged();
    // }
}