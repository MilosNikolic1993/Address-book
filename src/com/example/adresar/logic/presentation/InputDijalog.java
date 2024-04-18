package com.example.adresar.logic.presentation;

import com.example.adresar.globals.Input;

public class InputDijalog {
    public static String readString( String poruka) {
        System.out.print(poruka);
        return Input.in.nextLine();
    }
    public static int readInt(String poruka) {
        System.out.print(poruka);
        return Integer.parseInt(Input.in.nextLine());
    }
}
