package com.modul2;

public class konversiWaktuOOP {

    public int getMonthInSec(int month){
        return (month * 2592000);
    }
    public int getMonthInMinute(int month){
        return (month * 43200);
    }
    public int getMonthInHours(int month){
        return (month * 720);
    }
    public int getMonthInDay(int month){
        return (month * 30);
    }

    public void printMonthInSec(int month){
        System.out.println(month + " bulan setara dengan " + this.getMonthInSec(month) + " detik");
    }
    public void printMonthInMinute(int month){
        System.out.println(month + " bulan setara dengan " + this.getMonthInMinute(month) + " menit");
    }
    public void printMonthInHours(int month){
        System.out.println(month + " bulan setara dengan " + this.getMonthInHours(month) + " jam");
    }
    public void printMonthInDay(int month){
        System.out.println(month + " bulan setara dengan " + this.getMonthInDay(month) + " hari");
    }
}
