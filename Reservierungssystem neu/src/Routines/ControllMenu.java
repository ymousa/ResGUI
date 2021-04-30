package Routines;

import Datenobjekte.Constans;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControllMenu extends Constans {

    public static int startMenu () throws IOException {
        is = new InputStreamReader(System.in);          //get User input
        br= new BufferedReader(is);
        System.out.println("1. Anmelden \t\t 2. Regestrieren \t\t 0. Beenden");
        System.out.print("Auswahl: ");
        return Integer.parseInt(br.readLine());
    }

    public static int mainMenu() throws IOException {
        is = new InputStreamReader(System.in);          //get User input
        br= new BufferedReader(is);
        System.out.println("1. meine Reservierungen \t\t 2. Raum reservieren");
        System.out.println("3. meine Profil \t\t 4. Reservierung löchen  ");
        System.out.println("0. Beenden");
        System.out.print("Auswahl: ");
        return Integer.parseInt(br.readLine());
    }
}
