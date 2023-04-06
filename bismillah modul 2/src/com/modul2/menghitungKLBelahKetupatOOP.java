package com.modul2;

public class menghitungKLBelahKetupatOOP {
    java.util.Scanner input = new java.util.Scanner(System.in);
    private int sisi;
    private int diagonal1 , diagonal2;

    public int getSisi(){
        return sisi;
    }
    public void setSisi(int sisi){
        this.sisi = sisi;
    }

    public int getDiagonal1(){
        return diagonal1;
    }
    public void setDiagonal1(int diagonal1){
        this.diagonal1 = diagonal1;
    }

    public int getDiagonal2(){
        return diagonal2;
    }
    public void setDiagonal2(int diagonal2){
        this.diagonal2 = diagonal2;
    }

    public void line(){
        System.out.println("==========");
    }

    public void hitungKeliling(){
        System.out.println("Menghitung Keliling Belah Ketupat");
        line();
        System.out.print("Masukkan Nilai Sisi : ");
        sisi = input.nextInt();
        setSisi(sisi);
        line();
        System.out.println("Sisi Belah Ketupat = " + getSisi());
        System.out.println("Keliling Belah Ketupat = " + 4*sisi);
    }

    public void hitungLuas(){
        System.out.println("Menghitung Luas Belah Ketupat");
        line();
        System.out.print("Masukkan Diagonal 1 : ");
        diagonal1 = input.nextInt();
        setDiagonal1(diagonal1);
        System.out.print("Masukkan Diagonal 2 : ");
        diagonal2 = input.nextInt();
        setDiagonal2(diagonal2);
        line();
        System.out.println("Diagonal 1 = " +getDiagonal1());
        System.out.println("Diagonal 2 = " + getDiagonal2());
        System.out.println("Luas Belah Ketupat = " + 0.5*diagonal1*diagonal2);
    }

    public void menu(){
        line();
        System.out.println("Program Menghitung Keliling dan Luas Belah Ketupat");
        line();
        System.out.println("Menu\n1. Keliling\n2. Luas\n3. Keluar");
        line();
        System.out.print("Pilih : ");
        int inputMenu = input.nextInt();
        line();
        if(inputMenu ==1){
            hitungKeliling();
            menu();
        }
        else if(inputMenu ==2){
            hitungLuas();
            menu();
        }
        else{
            System.out.println("Program Selesai");
        }
    }

    public static void main(String[] args) {
        menghitungKLBelahKetupatOOP modul2 = new menghitungKLBelahKetupatOOP();
        modul2.menu();
    }
}
