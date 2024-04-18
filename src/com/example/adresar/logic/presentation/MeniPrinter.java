package com.example.adresar.logic.presentation;

public class MeniPrinter {

    public static void printMain() {
        System.out.println("""
                    Akcije:
                          [1] Prikazi sve kontakte
                          [2] Dodaj novi kontakt
                          [3] Azuriraj postojeci kontakt
                          [4] Obrisi postojeci kontakt
                          [5] Pronadji kontakt za kriterijum
                          [6] Izlaz iz programa
                     Vas izbor: """);
    }
}
