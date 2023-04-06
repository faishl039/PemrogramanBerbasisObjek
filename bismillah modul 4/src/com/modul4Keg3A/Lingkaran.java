package com.modul4Keg3A;

import java.util.Scanner;

public class Lingkaran implements BangunDatar{
    double phi;
    int jari;
    Scanner input = new Scanner(System.in);

    public void setPhi(double phi) {
        this.phi = phi;
    }
    public void setJari(int jari) {
        this.jari = jari;
    }

    @Override
    public double luas() {
        System.out.println("Menghitung luas lingkaran");
        System.out.print("Masukkan Phi : ");
        phi = input.nextDouble();
        setPhi(phi);
        System.out.print("Masukkan jari-jari : ");
        jari = input.nextInt();
        setJari(jari);
        double hasilLuas = phi*jari*jari;
        System.out.printf("Luas : %.1f",hasilLuas);
        return hasilLuas;
    }

    @Override
    public double keliling() {
        System.out.println("\n\nMenghitung keliling lingkaran");
        System.out.print("Masukkan phi : ");
        phi = input.nextDouble();
        setPhi(phi);
        System.out.print("Masukkan jari-jari : ");
        jari = input.nextInt();
        setJari(jari);
        double hasilKeliling = 2*phi*jari;
        System.out.printf("Luas : %.1f",hasilKeliling);
        return hasilKeliling;
    }

    void volume(){
        System.out.println("\n\nMenghitung volume lingkaran");
        System.out.print("Masukkan phi : ");
        phi = input.nextDouble();
        setPhi(phi);
        System.out.print("Masukkan jari-jari : ");
        jari = input.nextInt();
        setJari(jari);
        double hasilVolume = phi*jari*jari;
        System.out.printf("Keliling : %.1f",hasilVolume);
    }
}