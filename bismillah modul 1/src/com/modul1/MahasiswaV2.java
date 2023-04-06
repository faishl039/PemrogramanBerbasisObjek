package com.modul1;
import java.util.Scanner;

public class MahasiswaV2 {
    Scanner userInput = new Scanner(System.in);
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
            System.out.println("Masukkan Kembali NIM Anda Sesuai dg Ketentuan : ");
            NIM = userInput.nextLine();
            setNIM(NIM);
        }
    }
    public String getNIM(){
        return NIM;
    }

    public void setPass(String Pass){
        if(Pass.length() <=8){
            System.out.println("Password Minimal Berisi 8 Karakter!");
            System.out.println("Masukkan Kembali Password sesuai dg Ketentuan : ");
            Pass = userInput.nextLine();
            setPass(Pass);
        }
    }
    public String getPass(){
        return Pass;
    }

    public void daftar() {
        System.out.println("Silahkan Masukkan Data Anda!");
        System.out.println("Nama : ");
        Nama = userInput.nextLine();
        setNama(Nama);

        System.out.println("NIM : ");
        NIM = userInput.nextLine();
        setNIM(NIM);

        System.out.println("Password : ");
        Pass = userInput.nextLine();
        setPass(Pass);

        System.out.println("=========");
        System.out.println("Selamat " + getNama() +", Pendaftaran Sukses!");
        System.out.println("Berikut adalah NIM dan Password Anda : " +getNIM() + "-" +getPass());
    }

    public class main {
        public static void main(String[] args){
            Mahasiswa modul1 = new Mahasiswa();
            modul1.daftar();
        }
    }
}