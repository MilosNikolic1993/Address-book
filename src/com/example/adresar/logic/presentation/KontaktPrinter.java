package com.example.adresar.logic.presentation;

import com.example.adresar.models.Kontakt;

import java.util.ArrayList;

public class KontaktPrinter {

    public static void print (ArrayList<Kontakt> kontakti) {
        for(Kontakt kontakt : kontakti) {
            System.out.println(kontakt);
        }
    }

    public static void printList(ArrayList<Kontakt> kontakti) {
        for(Kontakt kontakt : kontakti) {
            System.out.print(kontakt.listingString());
        }
    }
}
