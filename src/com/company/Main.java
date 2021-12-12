package com.company;

public class Main {
    public static void main(String[] args) {

        Gadgets gadgets = new Gadgets("Max","street.30",new Shope("Osh"),EnumColor.BLACK,2000);
        System.out.println(gadgets.getInfo());
        gadgets.print("Оригинал");


        System.out.println("---------------------");
         Notebook notebook = new Notebook("Texex","street.44",new Shope("Rio"),EnumColor.GOLD,60000,"Sss200","Samsung");
        System.out.println(notebook.getInfo());

        System.out.println("----------------");
        Notebook notebook1 = new Notebook("ZOV","street.123",new Shope("Bishkek"),EnumColor.SILVER,60000,"Mi notebook Pro","Xiaomi");
        System.out.println(notebook1.getInfo());



    }

}

