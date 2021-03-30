package com.company;
import java.io.IOException;

public class Main extends Datenbank{
    public static void main(String[] args) throws IOException {
        Profil newProfil = null;
        Login newLogin= null;
        String acc = "", accName = "";
        boolean loginSuccess= false;
        do {
            int auswahl1 = ControllerMenu.startMenu();
            switch (auswahl1) {                                                      //start-menu
                case 0:
                    System.exit(0);
                    break;
                case 1:

                    newLogin = new Login();
                    loginSuccess  =newLogin.vertifyLogin();
                    acc= newLogin.loginProfil[0];
                    System.out.println("");
                    break;
                case 2:
                    newProfil = new Profil();
                    newProfil.reg();
                    System.out.println("Bitte jetzt anmelden");
                    System.out.println("");
                    break;
                default:
                    System.out.println("ein Fehler ist aufgetreten");
                    System.out.println("Bitte geben Sie eine gültige Auswahl ein");
                    break;
            }
        } while (!loginSuccess);

        Reservierungen newRes = null;
        boolean existProfil= false;
        accName = Login.getName(acc);
        System.out.println("Wilkommen zurück "+accName);
        do {
            Reservierungen.resNummerieren();                            //alle Reservierungen nummerieren
            int auswahl2 = ControllerMenu.mainMenu();
            switch (auswahl2) {                                                      //main-menu
                case 0:
                    existProfil = true;
                    System.exit(0);
                    break;
                case 1:
                    //Reservierungen.showReservierungen();
                    System.out.println("");
                    newRes.showRes(null);
                    System.out.println("");
                    break;
                case 2:
//                    Reservierungen.showMyRes(accName, Reservierungen.counter());
                    newRes.showRes(accName);

                    System.out.println("");
                    break;
                case 3:
                    newRes = new Reservierungen();
                   newRes.neuReservieren(accName);
                    System.out.println("");
                    break;
                case 4:
                    newLogin.showProfil();
                    System.out.println("");
                    break;
                case 5:
                    Reservierungen.deleteRes(accName);
                    break;
                default:
                    System.out.println("ein Fehler ist aufgetreten");
                    System.out.println("Bitte geben Sie eine gültige Auswahl ein");
                    break;
            }

        }while(!existProfil);
    }


}
