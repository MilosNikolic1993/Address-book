package com.example.adresar.logic.business;

import com.example.adresar.models.Kontakt;

import java.util.ArrayList;

public class KontaktFilter {
    public static ArrayList<Kontakt> pretrgaImePrezime(ArrayList<Kontakt> kontakti, String fraza) {
        ArrayList<Kontakt> filtered_kontakti = new ArrayList();
        for (Kontakt k : kontakti) {
            if (k.getIme().toUpperCase().startsWith(fraza.toUpperCase()) || k.getPrezime().toUpperCase().startsWith(fraza.toUpperCase())) {
                filtered_kontakti.add(k);
            }
        }

        return filtered_kontakti;
    }

    public static Kontakt pretragaZaId(ArrayList<Kontakt> kontakti, int id) {
        Kontakt nadjen = null;
        for (Kontakt k : kontakti) {
            if (k.getId() == id) {
                nadjen = k;
                break;
            }
        }
        return nadjen;
    }
}
