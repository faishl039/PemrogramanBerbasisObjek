package com.modul3Child;

import com.modul3.Hewan;

public class hewanChildBedaPackage2 extends Hewan {
    public void tampilkanSuper() {
        System.out.println("Termasuk kedalam kelompok : " + super.kelompok);
    }

    public void hcbpCons(String d) {
        System.out.println("namanya : " + d);
    }

    public void hcbpCons(String d, int e) {
        System.out.println("namanya : " + d + ", kupingnya : " + e);
    }

    public void hcbpCons(String d, int e, double f) {
        System.out.println("namanya : " + d + ", kupingnya : " + e + ", beratnya : " + f + " kg");
    }
}
