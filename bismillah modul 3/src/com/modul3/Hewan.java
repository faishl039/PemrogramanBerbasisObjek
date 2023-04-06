package com.modul3;

public class Hewan{
    public String kelompok = "Mamalia";
    int jmlhKaki = 4;
    public void tampilkan(){
        System.out.println("\nHewan berkelompok " +this.kelompok);
        System.out.println("Kakinya " +this.jmlhKaki);
    }
}

class Mamalia1 extends Hewan{
    void tampil1(){
//        Mamalia1 mama1 = new Mamalia1();
//        System.out.println("\ntermasuk hewan : " +mama1.kelompok);
//        System.out.println("memiliki kaki : " +mama1.jmlhKaki);
        System.out.println("Itu Kucing, berwarna oren");
    }
}

class Mamalia2 extends Hewan{
    void tampil2(){
        System.out.println("Itu Sapi, berwarna hitam putih");
    }
}

class Mamalia3 extends Hewan{
    void tampil3(){
        System.out.println("Itu Kuda, berwarna coklat");
    }
}

