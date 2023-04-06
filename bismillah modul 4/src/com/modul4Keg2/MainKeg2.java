package com.modul4Keg2;

public class MainKeg2 {
    public static void main(String[] args) {
        Distributor dstr = new Distributor("Steve Distribution","Surabaya","08113040023");
        Liquid lqd = new Liquid("Snack Houze","Soft Cookies with Vanilla Ice Cream",60,"130.000", dstr);
        System.out.println("Liquid "+lqd.getName()+" with flavour "+lqd.getFlavour()+", available in "+lqd.getSize()+" ml. \nSelling for "+lqd.getPrice()+
                ".\nDistributed by "+dstr.getName()+" at "+dstr.getPlace()+". \nCall Center : "+dstr.getCall());

    }
}
