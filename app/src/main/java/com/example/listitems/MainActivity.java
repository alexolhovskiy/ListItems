package com.example.listitems;

import static android.graphics.Color.rgb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Item> items;
    ItemAdapter itemAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items=new ArrayList<>();
        items.add(new Item(1,"Sasha",100,"#000000"));
        items.add(new Item(2,"Masha",400,"#0f0f0f"));
        items.add(new Item(3,"Pasha",500,"#ffffff"));
        setItemRecycler(items);
    }

    private void setItemRecycler(ArrayList<Item>items){
        //RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recyclerView=findViewById(R.id.recycler);
        //recyclerView.setLayoutManager(layoutManager);
        itemAdapter=new ItemAdapter(this,items);
        //recyclerView.setAdapter(itemAdapter);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setAdapter(itemAdapter);
    }
}