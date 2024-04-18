package com.example.adresar.models;

public class Kontakt {
    private int id;
    private String ime;
    private String prezime;
    private String telefon;
    private String mail;

    public Kontakt(){}
    public Kontakt(int id,String ime, String prezime, String telefon, String imail) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.telefon = telefon;
        this.mail = imail;
    }
    public int getId() { return id; }
    public String getIme() { return ime; }
    public String getPrezime() { return prezime; }
    public String getTelefon() { return telefon; }
    public String getMail() { return mail; }
    public void setIme(String value) { ime = value; }
    public void setPrezime(String value) { prezime = value; }
    public void setTelefon(String value)  {telefon  = value; }
    public void setMail(String value) { mail = value; }

    public String listingString() {
        return String.format("[%d] %s %s\n", id, ime, prezime);
    }

    public String toString() {
        return String.format("""
                Ime: %s    Prezime: %s
                Mail: %s
                Telefon: %s
                -----------------\n""", ime, prezime, mail, telefon);
    }
}
