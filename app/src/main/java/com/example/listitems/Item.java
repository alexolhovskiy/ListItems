package com.example.listitems;

import android.os.Build;

public class Item {
    private int id;
    private String name;
    private int price;
    private String color;

    public Item(int id,String name,int price,String color){
        this.id=id;
        this.name=name;
        this.price=price;
        this.color=color;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
