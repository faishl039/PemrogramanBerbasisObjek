package com.nyobaConstr;

public class Mahasiswa {
    private String nim;
    private String nama;
//    private char namaLast;
    private String kelas;
    private String jenisKelamin;

    public Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
////        this.kelas = kelas;
////        this.jenisKelamin = jenisKelamin;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNama(String namaDepan, String namaBelakang){
        this.nama = namaDepan + " " + namaBelakang;
    }
    public void setNama(String namaDepan, String namaTengah, String namaBelakang){
        this.nama = namaDepan + " " + namaTengah + " " + namaBelakang;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
}
