package com.modul2;

public class konversiWaktuOOPMain {
    public static void main(String[] args) {
        konversiWaktuOOP bulan = new konversiWaktuOOP();
        int[] bul = new int[4];

        bul[0] = 1;
        bul[1] = bulan.getMonthInMinute(1);
        bul[2] = bulan.getMonthInHours(1);
        bul[3] = bulan.getMonthInDay(1);

        bulan.printMonthInSec(bul[0]);
        bulan.printMonthInMinute(bul[1]);
        bulan.printMonthInHours(bul[2]);
        bulan.printMonthInDay(bul[3]);
    }
}
