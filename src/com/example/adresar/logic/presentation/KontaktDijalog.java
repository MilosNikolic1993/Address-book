package com.example.adresar.logic.presentation;

import com.example.adresar.globals.Input;
import com.example.adresar.globals.KontaktID;
import com.example.adresar.models.Kontakt;

public class KontaktDijalog {

    public static Kontakt noviKOntakt() {
        String ime = InputDijalog.readString("Unesite ime: ");
        String prezime = InputDijalog.readString("Unesite prezime: ");
        String mail = InputDijalog.readString("Unesite mail: ");
        String telefon = InputDijalog.readString("Unesite telefon: ");
        Kontakt k = new Kontakt(KontaktID.trenutni++,ime, prezime, mail, telefon);
        return k;
    }
    public static void azurirajKontakt(Kontakt k) {
        String ime = InputDijalog.readString("Unesite ime(Enter za preskok) : ");
        String prezime = InputDijalog.readString("Unesite prezime(Enter za preskok) : ");
        String mail = InputDijalog.readString("Unesite mail(Enter za preskok) : ");
        String telefon = InputDijalog.readString("Unesite telefon (Enter za preskok): ");
        if(!ime.trim().equals("")) {
            k.setIme(ime);
        }
        if (!prezime.trim().equals("")) {
            k.setPrezime(prezime);
        }
        if (!mail.trim().equals("")) {
            k.setMail(mail);
        }
        if (!telefon.trim().equals("")) {
            k.setTelefon(telefon);
        }
    }
}
