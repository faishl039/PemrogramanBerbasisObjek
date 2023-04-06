package com.modul3;

//import com.modul3Child.hewanChildBedaPackage;
import com.modul3Child.hewanChildBedaPackage1;
import com.modul3Child.hewanChildBedaPackage2;

public class Driver extends Hewan{
    public static void main(String[] args) {
        Hewan animal = new Hewan();
//        animal.tampilkan();
        System.out.println("ini adalah kelompok hewan " +animal.kelompok);
        System.out.println("dengan jumlah kaki " +animal.jmlhKaki);

        Mamalia1 mm1 = new Mamalia1();
//        mm1.tampilkan();
        System.out.println("ini adalah kelompok hewan " +mm1.kelompok);
        System.out.println("dengan jumlah kaki " +mm1.jmlhKaki);
        mm1.tampil1();

        Mamalia2 mm2 = new Mamalia2();
//        mm2.tampilkan();
        System.out.println("\nini adalah kelompok hewan " +mm2.kelompok);
        System.out.println("dengan jumlah kaki " +mm2.jmlhKaki);
        mm2.tampil2();

        Mamalia3 mm3 = new Mamalia3();
//        mm3.tampilkan();
        System.out.println("\nini adalah kelompok hewan " +mm3.kelompok);
        System.out.println("dengan jumlah kaki " +mm3.jmlhKaki);
        mm3.tampil3();

        hewanChildBedaPackage1 hcbp = new hewanChildBedaPackage1();
        //isA
        hcbp.tampilkan();
        //super
        hcbp.tampilkanSuper();
        //constructor
        hcbp.hcbpCons("gajah");
        hcbp.hcbpCons("gajah", 2);
        hcbp.hcbpCons("gajah", 2, 352.6);

        hewanChildBedaPackage2 hcbp2 = new hewanChildBedaPackage2();
        hcbp2.tampilkan();
        hcbp2.tampilkanSuper();
        hcbp2.hcbpCons("singa");
        hcbp2.hcbpCons("singa", 2);
        hcbp2.hcbpCons("singa", 2, 80.6);

    }
}
