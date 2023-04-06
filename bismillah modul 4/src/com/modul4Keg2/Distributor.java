package com.modul4Keg2;

public class Distributor {
    private String name;
    private String place;
    private String call;

    public Distributor(String name,String place, String call){
        this.name = name;
        this.place = place;
        this.call = call;
    }

    public String getName() {
        return name;
    }
    public String getPlace() {
        return place;
    }
    public String getCall() {
        return call;
    }

}
