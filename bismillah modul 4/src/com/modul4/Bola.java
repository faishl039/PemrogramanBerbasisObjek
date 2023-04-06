package com.modul4;
import java.util.Scanner;

public class Bola extends bangunRuang{
    Scanner userInput = new Scanner(System.in);
    private int r;
    public void setR(int r) {
        this.r = r;
    }

    @Override
    void getLuasPermukaan() {
        line();
        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.print("Masukkan Jari-Jari : ");
        r = userInput.nextInt();
        setR(r);
        double hasil = phi*r*r;
        System.out.printf("Luas Permukaan Bola adalah : %.1f", hasil);
    }

    @Override
    void getVolume() {
        line();
        System.out.println("Menghitung Volume Bola");
        System.out.print("Masukkan Jari-Jari : ");
        r = userInput.nextInt();
        setR(r);
        double hasil = phi*r*r*r*4/3;
        System.out.printf("Volume Bola adalah : %.1f",hasil);
    }
}
