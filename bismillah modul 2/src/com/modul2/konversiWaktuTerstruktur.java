package com.modul2;

public class konversiWaktuTerstruktur {

    public static void main(String [] args){
        int bulan = 1;
        double detik;
        double menit;
        double jam;
        int hari;

        detik = bulan * 2592.000;
        menit = bulan * 43.200;
        jam = bulan * 720;
        hari = bulan * 30;

        System.out.println("Hasil Konversi Bulan");
        System.out.println(bulan + " Bulan = " + detik + " Detik");
        System.out.println(bulan + " Bulan = " + menit + " Menit");
        System.out.println(bulan + " Bulan = " + jam + " Jam");
        System.out.println(bulan + " Bulan = " + hari + " Hari");
    }

}
