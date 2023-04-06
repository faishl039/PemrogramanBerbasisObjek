package com.modul3Child;

import com.modul3.Hewan;

//ov constructor
public class hewanChildBedaPackage1 extends Hewan {
    public void hcbpCons(String a){
        System.out.println("namanya : " +a);
    }
    public void hcbpCons(String a, int b){
        System.out.println("namanya : " +a+ ", matanya : " +b);
    }
    public void hcbpCons(String a, int b, double c){
        System.out.println("namanya : " +a+ ", matanya : " +b+ ", beratnya : " +c+ " kg");
    }

    //super
    public void tampilkanSuper(){
        System.out.println("Termasuk kedalam kelompok : " +super.kelompok);
    }
}

