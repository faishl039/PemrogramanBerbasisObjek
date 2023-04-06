package com.modul2;

public class menghitungKLBelahKetupat {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int inputMenu, sisi, diagonal1, diagonal2;
        System.out.println("Program Hitung Keliling dan Luas Belah Ketupat");
        System.out.println("1. Keliling\n2.Luas");
        System.out.print("Pilih : ");
        inputMenu = input.nextInt();

        switch (inputMenu) {
            case 1 -> {
                System.out.println("Menghitung Keliling Belah Ketupat");
                System.out.print("Masukkan Sisi Belah Ketupat : ");
                sisi = input.nextInt();
                System.out.println("Keliling = " + sisi * 4);

            }
            case 2 -> {
                System.out.println("Menghitung Luas Belah Ketupat");
                System.out.print("Masukkan Diagonal 1 : ");
                diagonal1 = input.nextInt();
                System.out.print("Masukkan Diagonal 2 : ");
                diagonal2 = input.nextInt();
                System.out.println("Luas = " + 0.5 * diagonal1 * diagonal2);

            }
        }
    }
}
