package com.company;

import java.util.Random;

public class Gadgets extends Store {
    private EnumColor color;

    private int price ;
    private String EnumColor;

    public Gadgets(String store, String address, EnumColor color,  int price) {
        super(store, address);
        this.color = color;

        this.price = price;
    }


    public com.company.EnumColor getColor() {
        return color;
    }



    public int getPrice() {
        return price;
    }

    public String getEnumColor() {
        return EnumColor;
    }





    final  public   void  print(String job){
        System.out.println(job);
    }

    public String getInfo(){
        return  "Gadgets Color:" + color +
                "\nStore name::" + getStore()+
                "\nStore address:" + getAddress() +
                "\nPrice:" + price;

    }


}
