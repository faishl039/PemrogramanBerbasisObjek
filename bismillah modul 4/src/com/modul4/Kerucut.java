package com.modul4;
import java.util.Scanner;

public class Kerucut extends bangunRuang{
    Scanner userInput = new Scanner(System.in);
    private int r;
    private int s;
    private int t;
    public void setr(int r) {
        this.r = r;
    }
    public void sets(int s) {
        this.s = s;
    }
    public void setT(int t) {
        this.t = t;
    }

    @Override
    void getLuasPermukaan() {
        line();
        System.out.println("Menghitung Luas Permukaan Kerucut");
        System.out.print("Masukkan Jari-Jari : ");
        r = userInput.nextInt();
        setr(r);
        System.out.print("Masukkan Garis Pelukis Kerucut : ");
        s = userInput.nextInt();
        sets(s);
        double hasil = phi *r*(r+s);
        System.out.printf("Maka Luas Permukaan Kerucut adalah : %.1f",hasil);
    }

    @Override
    void getVolume() {
        line();
        System.out.println("Menghitung Volume Kerucut");
        System.out.print("Masukkan Jari-Jari : ");
        r = userInput.nextInt();
        setr(r);
        System.out.print("Masukkan Tinggi : ");
        t = userInput.nextInt();
        setT(t);
        double hasil = phi*r*r*t*1/3;
        System.out.printf("Maka Volume Kerucut adalah : %.1f",hasil);
    }
}
