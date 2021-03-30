package com.company;

import java.io.*;

public class Datenbank {
    public static File loginDaten = new File("src/com/company/resources/loginDaten.txt");
    public static File profils = new File("src/com/company/resources/profils.txt");
    public static File reservierungen = new File("src/com/company/resources/reservierungen.txt");
    public static File resBearbeitung= new File("src/com/company/resources/resBearbeitung.txt");
 /*   public static File loginDaten = new File("C://Users//A113927409//Desktop//loginDaten.txt");
    public static File profils = new File("C://Users//A113927409//Desktop//profils.txt");
    public static File reservierungen = new File("C://Users//A113927409//Desktop//reservierungen.txt");
    public static File resBearbeitung= new File("C://Users//A113927409//Desktop//resBearbeitung.txt");*/
    public static BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));



}