package com.rsbprojects.entities;

public class Product {
    private long id;
    private String name;
    private double price;
    private MyStore stores;

    public Product(long id, String name, double price, MyStore stores){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stores = stores;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setStores(MyStore stores){
        this.stores = stores;
    }
    
    public MyStore getStores(){
        return stores;
    }
}
