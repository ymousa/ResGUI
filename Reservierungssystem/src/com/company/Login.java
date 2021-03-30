package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Login extends Datenbank{
    private  static Scanner scanLogin;
    public  String[] loginProfil= { "email", "pass"};


    public boolean vertifyLogin() { // ma steht für Mitarbeiter
        boolean found = false;
        try {
            System.out.print("Email: ");
            loginProfil[0] = brf.readLine();
            System.out.print("Pass: ");
            loginProfil[1] = brf.readLine();
            scanLogin = new Scanner(loginDaten);
            scanLogin.useDelimiter("[;\n]");
            while (scanLogin.hasNext() && !found) {
                String tempEmail = scanLogin.next();
                String tempPass = scanLogin.next();
                if (loginProfil[0].trim().equals(tempEmail.trim()) && loginProfil[1].trim().equals(tempPass.trim())) {
                    found = true;
                }
            }
            if(!found){
                    System.out.println("kein Treffer. Nochmal anmelden!");
                    System.out.println("");
            }
            scanLogin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return found;
    }

    public  void showProfil(){
        boolean found= false;
        try {
            scanLogin = new Scanner (profils);
            scanLogin.useDelimiter("[;\n]");

            while(scanLogin.hasNext() && !found){
                String[] tempProfil= {"vorname", "nachname", "email", "pass"};
                tempProfil[0]= scanLogin.next();
                tempProfil[1]= scanLogin.next();
                tempProfil[2]= scanLogin.next();
                tempProfil[3]= scanLogin.next();

                if(loginProfil[0].trim().equals(tempProfil[2].trim())){
                    found = true;
                    System.out.println("Vorname: \t"+ tempProfil[0]);
                    System.out.println("Nachname: \t"+ tempProfil[1]);
                    System.out.println("E-Mail: \t"+ tempProfil[2]);
                    System.out.println("Pass: \t"+ tempProfil[3]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        scanLogin.close();
    }

    public static String getName(String suchEmail){
        boolean found= false;
        String accName ="";
        try {
            scanLogin = new Scanner (profils);
            scanLogin.useDelimiter("[;\n]");

            while(scanLogin.hasNext() && !found){
                String[] tempProfil= {"vorname", "nachname", "email", "pass"};
                tempProfil[0]= scanLogin.next();
                tempProfil[1]= scanLogin.next();
                tempProfil[2]= scanLogin.next();
                tempProfil[3]= scanLogin.next();

                if(suchEmail.trim().equals(tempProfil[2].trim())){
                    found = true;
                    accName=tempProfil[0];
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        scanLogin.close();

        return accName;
    }

}
