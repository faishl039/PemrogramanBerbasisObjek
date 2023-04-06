package com.modul5;
//import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class DinasPertanahanV2 {
//    boolean ulang = true;
    int i = 1;
    Scanner input = new Scanner(System.in);
    private String[] alamat = new String[6];
    private int[] panjangTanah = new int[6];
    private int[] luasTanah = new int[6];

    public String[] getAlamat() {
        return alamat;
    }

    public void setAlamat(String[] alamat) {
        this.alamat = alamat;
    }

    public int[] getPanjangTanah() {
        return panjangTanah;
    }

    public void setPanjangTanah(int[] panjangTanah) {
        this.panjangTanah = panjangTanah;
    }

    public int[] getLuasTanah() {
        return luasTanah;
    }

    public void setLuasTanah(int[] luasTanah) {
        this.luasTanah = luasTanah;
    }

    public void input() {
        System.out.println("Selamat Datang di Dinas Pertanahan");
        System.out.println("Silahkan Masukkan Data Tanah Anda!");
        do {
            try {
                FileWriter dataTanah = new FileWriter("Data Tanah.txt");
                BufferedWriter bufferDataTanah = new BufferedWriter(dataTanah);

                System.out.print("Alamat " + i + " : ");
                alamat[i] = input.nextLine();
                setAlamat(alamat);

                System.out.print("Panjang Tanah " + i + " : ");
                panjangTanah[i] = Integer.parseInt(input.nextLine());
                setPanjangTanah(panjangTanah);

                System.out.print("Luas Tanah " + i + " : ");
                luasTanah[i] = Integer.parseInt(input.nextLine());
                setLuasTanah(luasTanah);

                String toFile = String.format("%s, %s, %s\n", Arrays.toString(alamat), Arrays.toString(panjangTanah), Arrays.toString(luasTanah));
                bufferDataTanah.write(toFile);
                bufferDataTanah.close();

            } catch (Exception a) {
                a.printStackTrace();
                System.out.println("Mohon Masukkan Angka Pada Panjang & Luas Tanah!");
            }
            finally {
                System.out.println("Data tanah ke " +i+ " Telah Di Input!");
                i++;
            }
        }
        while (i<alamat.length);{
            System.out.println("Program Selesai, Maksimal Input 5 Alamat.\nTerimakasih!");
        }
    }
}