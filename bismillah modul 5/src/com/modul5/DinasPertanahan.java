package com.modul5;
import java.util.Scanner;

public class DinasPertanahan {
    Scanner input = new Scanner(System.in);
    public String[] alamat = new String[6];
    public int[] panjangTanah = new int[6];
    public int[] luasTanah = new int[6];

    public String[] getAlamat() {
        return alamat;
    }
    public void setAlamat(String[] alamat) {
        this.alamat = alamat;
    }

    public int[] getPanjangTanah() {
        return panjangTanah;
    }
    public void setLuasTanah(int[] luasTanah) {
        this.luasTanah = luasTanah;
    }

    public int[] getLuasTanah() {
        return luasTanah;
    }
    public void setPanjangTanah(int[] panjangTanah) {
        this.panjangTanah = panjangTanah;
    }

    public void input() {
//        String[] alamat = new String[6];
//        int[] panjangTanah = new int[6];
//        int[] luasTanah = new int[6];
//        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Selamat Datang di Dinas Pertanahan");
            System.out.println("Silahkan Masukkan Alamat Tanah Anda!");
//            System.out.println("Alamat : ");
//            alamat[] = input.nextLine();
            for (int i = 1; i<alamat.length; i++){
                System.out.print("Alamat " +i+ " : ");
                alamat[i] = input.nextLine();
                setAlamat(alamat);
                //input.nextLine();

                System.out.print("Panjang Tanah " +i+ " : ");
                panjangTanah[i] = Integer.parseInt(input.nextLine());
                setPanjangTanah(panjangTanah);

                System.out.print("Luas Tanah " +i+ " : ");
                luasTanah[i] = Integer.parseInt(input.nextLine());
                setLuasTanah(luasTanah);
            }
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Mohon Masukkan Angka!");
        }
    }
}
