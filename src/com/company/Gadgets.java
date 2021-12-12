package com.company;

import java.util.Random;

public class Gadgets extends Store {
    private EnumColor color;

    private int price ;


    public Gadgets(String store, String address, Shope shope, com.company.EnumColor color, int price) {
        super(store, address, shope);
        this.color = color;
        this.price = price;

    }

    public EnumColor getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }







    final  public   void  print(String job){
        System.out.println(job);
    }

    public String getInfo(){
        return  "Gadgets Color:" + getColor() +
                "\nStore name::" + getStore()+
                "\nStore address:" + getAddress() +
                "\nPrice:" + getPrice() +
                "\nTown: " + getShope().getTown() ;

    }


}
