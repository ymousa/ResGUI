package com.company;

import java.io.IOException;
import java.util.Scanner;

public class ControllerMenu {
    private static Scanner stringInput;

    public static int startMenu () throws IOException {
        System.out.println("1. Anmelden \t\t 2. Regestrieren \t\t 0. Beenden");
        System.out.print("Auswahl: ");
        int auswahlStart = Integer.parseInt(Datenbank.brf.readLine());
        return auswahlStart;
    }

    public static int mainMenu() throws IOException {
        System.out.println("1. Alle Reservierungen \t\t 2. meine Reservierungen");
        System.out.println("3. Raum reservieren \t\t 4. meine Profil ");
        System.out.println("5. Reservierung löchen  \t\t  0. Beenden");
        System.out.print("Auswahl: ");
        int auswahlMain = Integer.parseInt(Datenbank.brf.readLine());
        return auswahlMain;
    }
    public static String stringInput(){
        stringInput = new Scanner(System.in);
        String input= stringInput.next();
        return input;
    }
    public static int inputInt()throws IOException{
        int inputInt = Integer.parseInt(Datenbank.brf.readLine());
        return  inputInt;
    }

}
