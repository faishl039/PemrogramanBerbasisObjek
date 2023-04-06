package com.modul1;

public class Mahasiswa {
    java.util.Scanner input = new java.util.Scanner(System.in);

    private String Nama;
    private String NIM;
    private String Pass;

    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public String getNama(){
        return Nama;
    }

    public void setNIM(String NIM){
        if(NIM.length() !=15){
            System.out.println("NIM Harus Berjumlah 15 Digit!");
            System.out.println("Masukkan Kembali NIM Anda Sesuai dg Ketentuan!");
            System.out.print("NIM : ");
            NIM = input.nextLine();
            this.NIM = NIM;
        }
    }
    public String getNIM(){
        return NIM;
    }

    public void setPass(String Pass){
        if(Pass.length() <=8){
            System.out.println("Password Minimal Berisi 8 Karakter!");
            System.out.println("Masukkan Kembali Password sesuai dg Ketentuan!");
            System.out.print("Password : ");
            Pass = input.nextLine();
            this.Pass = Pass;
        }
    }
    public String getPass(){
        return Pass;
    }

    public void daftar(){
        System.out.println("=========");
        System.out.println("Silahkan Lengkapi Data Anda!");
        System.out.print("Nama : ");
        Nama = input.nextLine();
        setNama(Nama);

        System.out.print("NIM : ");
        NIM = input.nextLine();
        setNIM(NIM);

        System.out.print("Password : ");
        Pass = input.nextLine();
        setPass(Pass);

        System.out.println("=========");
        System.out.println("Selamat, " + getNama() + ", Datamu Berhasil Dibuat!");
        System.out.println("Berikut adalah Username dan Password Kamu :");
        System.out.println("Username : " +getNIM());
        System.out.println("Password : " +getPass());
        System.out.println("=========");
    }

}
