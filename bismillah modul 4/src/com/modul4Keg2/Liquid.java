package com.modul4Keg2;

public class Liquid {
    private String name;
    private String flavour;
    private int size;
    private String price;
    Distributor distri;

    public Liquid(String name, String flavour, int size, String price, Distributor distri){
        this.name = name;
        this.flavour = flavour;
        this.size = size;
        this.price = price;
        this.distri = distri;
    }

    public String getName() {
        return name;
    }
    public String getFlavour() {
        return flavour;
    }
    public int getSize() {
        return size;
    }
    public String getPrice() {
        return price;
    }
    public Distributor getDistri() {
        return distri;
    }

}
