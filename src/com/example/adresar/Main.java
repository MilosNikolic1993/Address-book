package com.example.adresar;
import com.example.adresar.globals.Input;
import com.example.adresar.globals.KontaktID;
import com.example.adresar.logic.business.KontaktFilter;
import com.example.adresar.logic.presentation.InputDijalog;
import com.example.adresar.logic.presentation.KontaktDijalog;
import com.example.adresar.logic.presentation.KontaktPrinter;
import com.example.adresar.logic.presentation.MeniPrinter;
import com.example.adresar.models.Kontakt;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Kontakt koja predstavlja kontakt osobe.
         * Od informacija nam sadrzi ime,prezime,broj telefona i mail.
         * Broj telefon i mail su opcioni ali mora se bar jedan od njih proslediti
         * Od funkcialnosti aplikacija ima:
         * 1.Dodam novi kontakt
         * 2.Da vidim sve kontakte
         * 3.Mogu trazim kontakte po ime,prezime(ne mora pun podatak)
         * 4.Mogu da azuriram kontakt
         * 5.Mogu da obrisem kontakt
         * Interaktivna aplikacija sa unapred definisnim kontktima
         **/
        ArrayList<Kontakt> kontakti = new ArrayList();
        // Za testiranje predefinisani kontakti
        kontakti.add(new Kontakt(KontaktID.trenutni,"Petar", "Petrovic", "+381641234567", "petar@example.com"));
        KontaktID.trenutni++;
        kontakti.add(new Kontakt(KontaktID.trenutni,"Ana", "Markovic", "+381631234567", "ana@example.com"));
        KontaktID.trenutni++;
        kontakti.add(new Kontakt(KontaktID.trenutni,"Jelena", "Petrovic", "+3816412344467", "jelena@example.com"));
        KontaktID.trenutni++;
        kontakti.add(new Kontakt(KontaktID.trenutni,"Marko", "Markovic", "+381651234567", "marko@example.com"));
        KontaktID.trenutni++;
        kontakti.add(new Kontakt(KontaktID.trenutni,"Milos", "Milosevic", "+381621234567", "milos@example.com"));
        KontaktID.trenutni++;

        System.out.println("===== ADRESAR ====");
        while(true) {
            MeniPrinter.printMain();
            String izbor = Input.in.nextLine();

            if(izbor.equals("1")) {
                System.out.println("[Ispis Kontakata]");
                KontaktPrinter.print(kontakti);
            } else if(izbor.equals("2")) {
                System.out.println("[Novi Kontakt]");
                Kontakt k = KontaktDijalog.noviKOntakt();
                kontakti.add(k);
                System.out.println("Kontakt je uspesno dodat!");
            } else if(izbor.equals("3")) {
                System.out.println("[Azuriranje Kontakta]");
                KontaktPrinter.printList(kontakti);
                int id = InputDijalog.readInt("Unesite kontakt koji zelite azurirati: ");
               Kontakt nadjen = KontaktFilter.pretragaZaId(kontakti,id);
                if (nadjen == null) {
                    System.err.println("Ne postoji kontakt sa ID: " + id);
                }else {
                    KontaktDijalog.azurirajKontakt(nadjen);
                    System.out.println("Kontakt je azuriran!");
                }
            } else if(izbor.equals("4")) {
                System.out.println("[Brisanje Kontakta]");
                KontaktPrinter.printList(kontakti);
                int id = InputDijalog.readInt("Unesite kontakt koji zelite da obrisete: ");
                Kontakt nadjen = KontaktFilter.pretragaZaId(kontakti,id);
                if (nadjen == null) {
                    System.err.println("Ne postoji kontakt sa ID: " + id);
                }else{
                    kontakti.remove(nadjen);
                    System.out.println("Kontakt je uspesno obrisan!");
                }
            } else if(izbor.equals("5")) {
                System.out.println("[Pretraga Kontakta]");
                String fraza = InputDijalog.readString("Unesite ime ili prezime (ne mora biti puno): ");
                ArrayList<Kontakt> rezultat = KontaktFilter.pretrgaImePrezime(kontakti, fraza);
                if (rezultat.size() == 0) {
                    System.err.println("Nema kontakta za unos: " + fraza);
                }else{
                    KontaktPrinter.print(rezultat);
                }
            } else if(izbor.equals("6")) {
                System.out.println("Hvala na koriscenju aplikacije. Program ce sada zavrsiti.");
                break;
            } else {
                System.err.println("Molimo Vas izaberite jednu od opcija 1 - 6.");
            }
        }
    }
}