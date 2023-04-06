package com.modul2;

public class cekNilaiKelulusan {
    java.util.Scanner input = new java.util.Scanner(System.in);
    private int nilaiProgdas;
    private int nilaiKalkulus;
    private int nilaiOrkom;
    private double hasil;

    public int getNilaiProgdas(){
        return nilaiProgdas;
    }
    public void setNilaiProgdas(int nilaiProgdas){
        this.nilaiProgdas = nilaiProgdas;
    }

    public int getNilaiKalkulus(){
        return nilaiKalkulus;
    }
    public void setNilaiKalkulus(int nilaiKalkulus){
        this.nilaiKalkulus = nilaiKalkulus;
    }

    public int getNilaiOrkom(){
        return nilaiOrkom;
    }
    public void setNilaiOrkom(int nilaiOrkom){
        this.nilaiOrkom = nilaiOrkom;
    }

    public void line(){
        System.out.println("==========");
    }

    public void hitungRata(){
        line();
        System.out.println("Masukkan Nilai Anda!");
        System.out.print("Progdas : ");
        nilaiProgdas = input.nextInt();
        setNilaiProgdas(nilaiProgdas);

        System.out.print("Kalkulus : ");
        nilaiKalkulus = input.nextInt();
        setNilaiKalkulus(nilaiKalkulus);

        System.out.print("Orkom : ");
        nilaiOrkom = input.nextInt();
        setNilaiOrkom(nilaiOrkom);

        hasil = (nilaiProgdas + nilaiKalkulus + nilaiOrkom)/3d;
    }

    public void cekNilai(){
        line();
        System.out.println("Nilai Anda");
        System.out.println("Progdas : " + getNilaiProgdas());
        System.out.println("Kalkulus : " + getNilaiKalkulus());
        System.out.println("Orkom : " + getNilaiOrkom());

        line();
        System.out.println("Rata - rata : " + hasil);
        line();
        if(hasil >70){
            System.out.println("Status : LULUS");
        }
        else{
            System.out.println("Status : GAGAL");
        }
        line();

    }

    public static void main(String[] args) {
	cekNilaiKelulusan modul2 = new cekNilaiKelulusan();
    modul2.hitungRata();
    modul2.cekNilai();
    }
}
