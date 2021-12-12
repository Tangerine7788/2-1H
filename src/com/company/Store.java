package com.company;

public abstract class Store {
    private String store;
    private String address;
    private  Shope shope ;



    public Store(String store, String address , Shope shope) {
        this.store = store;
        this.address = address;
        this.shope = shope ;
    }

    public String getStore() {
        return store;
    }

    public String getAddress() {
        return address;
    }

    public Shope getShope() {
        return shope;
    }
    }











