package com.nyobaConstr;

public class MahasiswaDriver {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("2021", "faishal");

        mhs.setNama("Faishal", "Syahputra");
        mhs.setNama("Faishal", "akbar", "Syahputra");

        System.out.println("Saya mahasiswa dengan nim : " +mhs.getNim());
        System.out.println("Saya mahasiswa dengan first name : " +mhs.getNama());
        System.out.println("Saya mahasiswa dengan last name : ");
//        System.out.println("Nama saya : " +mhs.getNama());
//        System.out.println("Kelas saya : " +mhs.getKelas());
//        System.out.println("Jenis kelamin : " +mhs.getJenisKelamin());
    }

}
