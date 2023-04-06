package com.modul5;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DinasPertanahanV3 {
    int i = 0;
    String pilih;
    boolean ulang = true;
    Scanner input = new Scanner(System.in);
    //pendeklarasian array
    private String[] alamat = new String[5];
    private int[] panjangTanah = new int[5];
    private int[] luasTanah = new int[5];

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

    public void line(){
        System.out.println("===============");
    }

    public void menu(){
        System.out.println("===== Menu =====\n1. Input Data\n2. Lihat Data\n3. Keluar");
        System.out.print("Pilih Menu : ");
        int jawab = input.nextInt();
        switch (jawab){
            case 1 : input(); menu();
            case 2 : tampilkan(); menu();
            case 3 : System.exit(0);
        }
    }

    public void input() {
        Scanner inp = new Scanner(System.in);
        while (ulang){
            try {
                //filewriter untuk membuat dan menuliskan inputan kedlam file
                //buffered untuk menerima inputan berupa karakter atau string dari filewriter
                FileWriter dataTanah = new FileWriter("Data Tanah Warga.txt");
                BufferedWriter bufferDataTanah = new BufferedWriter(dataTanah);
                line();
                System.out.println("Silahkan Masukkan Data Tanah Anda!");
                System.out.print("Alamat : ");
                alamat[i] = inp.nextLine();
                setAlamat(alamat);

                System.out.print("Panjang Tanah : ");
                panjangTanah[i] = Integer.parseInt(inp.nextLine());
                setPanjangTanah(panjangTanah);

                System.out.print("Luas Tanah : ");
                luasTanah[i] = Integer.parseInt(inp.nextLine());
                setLuasTanah(luasTanah);

                String toFile = String.format("Alamat         : %s-\nPanjang Tanah  : %s-\nLuas Tanah     : %s", Arrays.toString(alamat), Arrays.toString(panjangTanah), Arrays.toString(luasTanah));
                bufferDataTanah.write(toFile);
                bufferDataTanah.close();

                i++;
            }
            catch (ArrayIndexOutOfBoundsException a){
                System.err.println("Maksimal Data Telah Terpenuhi!");
                a.printStackTrace();
            }
            catch (Exception a){
                System.err.println("Mohon Masukkan Angka Pada Panjang & Luas Tanah!");
                a.printStackTrace();
            }
            finally {
                line();
                System.out.print("Tambah Data Tanah Lagi? (iya/tidak) : ");
                pilih = inp.nextLine();
                if (pilih.equalsIgnoreCase("tidak")){
                    ulang = false;
                }
            }
            System.out.println("Data Berhasil Di Input!");
        }
    }

    public void tampilkan(){
        try {
            FileReader bacaDataTanah = new FileReader("Data Tanah Warga.txt");
            BufferedReader bufferBacaData = new BufferedReader(bacaDataTanah);
            String tampil = bufferBacaData.readLine();
            //jika tampil masih ada nilainya, perulangan akan terus berulang
            //delim digunakan untuk mengilangkan karakter tertentu yg ada di file
            // sehingga saat ditampilkan melalui reader tidak muncul
            line();
            while (tampil != null){
                StringTokenizer tokenBaca = new StringTokenizer(tampil, "-");
                System.out.print(tokenBaca.nextToken());
                System.out.print("\n");
                tampil = bufferBacaData.readLine();
            }
            bufferBacaData.close();
            bacaDataTanah.close();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            line();
            System.out.println("Program Telah Selesai\nTerimakasih!");
            line();
        }

    }
}
