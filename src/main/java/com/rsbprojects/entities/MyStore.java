package com.rsbprojects.entities;

public class MyStore {
    private Long id;
    private String name;

    public MyStore(){
        this.id = id;
        this.name = name;
    }
    
    public MyStore(long l, String string) {
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
