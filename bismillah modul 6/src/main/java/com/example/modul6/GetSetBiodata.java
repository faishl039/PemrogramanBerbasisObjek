package com.example.modul6;

import javafx.beans.property.SimpleStringProperty;

public class GetSetBiodata {
    private SimpleStringProperty mdNama;
    private SimpleStringProperty mdNim;
    private SimpleStringProperty mdEmail;
    private SimpleStringProperty mdFak;
    private SimpleStringProperty mdJur;
    private SimpleStringProperty mdAlamat;
    private SimpleStringProperty mdKota;

    public GetSetBiodata(String mdNama, String mdNim, String mdEmail, String mdFak, String mdJur, String mdAlamat, String mdKota) {
        this.mdNama = new SimpleStringProperty(mdNama);
        this.mdNim = new SimpleStringProperty(mdNim);
        this.mdEmail = new SimpleStringProperty(mdEmail);
        this.mdFak = new SimpleStringProperty(mdFak);
        this.mdJur = new SimpleStringProperty(mdJur);
        this.mdAlamat = new SimpleStringProperty(mdAlamat);
        this.mdKota = new SimpleStringProperty(mdKota);
    }

    public String getMdNama() {
        return mdNama.get();
    }
    public String getMdNim() {
        return mdNim.get();
    }
    public String getMdEmail() {
        return mdEmail.get();
    }
    public String getMdFak() {
        return mdFak.get();
    }
    public String getMdJur() {
        return mdJur.get();
    }
    public String getMdAlamat() {
        return mdAlamat.get();
    }
    public String getMdKota() {
        return mdKota.get();
    }

    public void setMdNama(String mdNama) {
        this.mdNama.set(mdNama);
    }
    public void setMdNim(String mdNim) {
        this.mdNim.set(mdNim);
    }
    public void setMdEmail(String mdEmail) {
        this.mdEmail.set(mdEmail);
    }
    public void setMdFak(String mdFak) {
        this.mdFak.set(mdFak);
    }
    public void setMdJur(String mdJur) {
        this.mdJur.set(mdJur);
    }
    public void setMdAlamat(String mdAlamat) {
        this.mdAlamat.set(mdAlamat);
    }
    public void setMdKota(String mdKota) {
        this.mdKota.set(mdKota);
    }
}
