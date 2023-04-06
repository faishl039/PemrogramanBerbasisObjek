package com.modul4;
import java.lang.Math;

public abstract class bangunRuang {
    void line(){
        System.out.println("\n==========");
    }
    final double phi = Math.PI;
    abstract void getLuasPermukaan();
    abstract void getVolume();
}
