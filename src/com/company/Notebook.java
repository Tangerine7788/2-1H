package com.company;

public final class Notebook extends Gadgets {
    private String name;
    private String manufacturer;

    public Notebook(String store, String address, com.company.EnumColor color, int price, String name, String manufacturer) {
        super(store, address, color, price);
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }


    @Override
    public String getInfo() {
        return super.getInfo() + "\nNotebook Name:"+name+
                "\nManufacturer:"+ manufacturer ;
    }
}