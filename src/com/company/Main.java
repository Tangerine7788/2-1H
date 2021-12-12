package com.company;

public class Main {
    public static void main(String[] args) {
        Gadgets gadgets = new Gadgets("Max","street.30",EnumColor.GOLD,40000);
        System.out.println(gadgets.getInfo());
        gadgets.print("Оригинал");


        System.out.println("---------------------");
         Notebook notebook = new Notebook("HHD","street.44",EnumColor.BLACK,50000,"SSS200","SAMSUNG");
        System.out.println(notebook.getInfo());

        System.out.println("----------------");
        Notebook notebook1 = new Notebook("ZOV","street.123",EnumColor.SILVER,60000,"Mi notebook Pro","Xiaomi");
        System.out.println(notebook1.getInfo());



    }

}

