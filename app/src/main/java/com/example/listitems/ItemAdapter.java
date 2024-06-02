package com.example.listitems;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    Context context;//страница на которой будет список
    ArrayList<Item> items;//список обьектов

    public ItemAdapter(MainActivity mainActivity, ArrayList<Item> items) {
        this.context=mainActivity;
        this.items=items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {//дизайн элемента сюда
        View item= LayoutInflater.from(context).inflate(R.layout.item,parent,false);//указываем дизайн - файл с дизайном
        return new ItemViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {//что вставим в дизайн
        //holder.iv.setBackgroundColor(Color.parseColor(items.get(position).getColor()));
        holder.tv1.setText(items.get(position).getName());
        holder.tv2.setText(items.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static final class ItemViewHolder extends RecyclerView.ViewHolder{//с какими компонентами дизайна будем работать
        ImageView iv;
        TextView tv1;
        TextView tv2;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.imageView);
            tv1=itemView.findViewById(R.id.textView1);
            tv2=itemView.findViewById(R.id.textView2);
        }
    }
}
