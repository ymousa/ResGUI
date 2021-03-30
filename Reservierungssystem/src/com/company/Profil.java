package com.company;

import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class Profil extends Datenbank{
    private  static Scanner scanLogin;
    private  String[] profil= {"vorname", "nachname", "email", "pass"};

    public void reg() throws IOException {
        System.out.print("Vorname: ");
        profil[0] = brf.readLine();
        System.out.print("Nachname: ");
        profil[1] = brf.readLine();
        System.out.print("Email: ");
        profil[2] = brf.readLine();
        System.out.print("Pass: ");
        profil[3] = brf.readLine();
        try {
            FileWriter fw = new FileWriter(profils, true); // in Datei (Profils) Schreiben
            fw.write(profil[0]);
            fw.write(";");
            fw.write(profil[1]);
            fw.write(";");
            fw.write(profil[2]);
            fw.write(";");
            fw.write(profil[3]);
            fw.write(System.getProperty("line.separator"));
            fw.flush();
            fw.close();

            FileWriter fwLoginDaten = new FileWriter(loginDaten, true); // in Datei (LoginDaten) Schreiben
            fwLoginDaten.write(profil[2]);
            fwLoginDaten.write(";");
            fwLoginDaten.write(profil[3]);
            fwLoginDaten.write(System.getProperty("line.separator"));
            fwLoginDaten.flush();
            fwLoginDaten.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
