package com.company;

import Routines.ControllMenu;
import Routines.Login;
import Tools.BookingTools;
import Datenobjekte.Constans;
import Tools.FileTools;

import java.io.IOException;

public class Main extends Constans{

    public static void main(String[] args) throws IOException {
        FileTools.readFileUsers();
        FileTools.wtiteFileUsers();
        FileTools.readFileBookings();
        FileTools.wtiteFileBookings();
        int iUserMenuIput;
        //StartMenu
        do{
            iUserMenuIput=ControllMenu.startMenu();
            switch (iUserMenuIput) {
                case 1 -> myUser = Login.verfiyUser();
                case 2 -> {
                    myUser = Login.newAccount();
                    FileTools.wtiteFileUsers();
                    FileTools.readFileUsers();
                }
                case 3 -> System.out.println("e");
                case 0 -> System.exit(0);
                default -> System.out.println("Eingabe nicht erkannt!");
            }
        }while(myUser==null);
        System.out.println();
        //MainMenu
        do{
            iUserMenuIput=ControllMenu.mainMenu();
            switch (iUserMenuIput) {
                case 1 -> BookingTools.showBooking(myUser);
                case 2 -> {
                    System.out.println();
                    BookingTools.insertBooking(myUser);
                    FileTools.wtiteFileBookings();
                }
                case 3 -> System.out.println(myUser.toString());
                case 4 -> {
                    System.out.println();
                    BookingTools.deleteBooking(myUser);
                    FileTools.wtiteFileBookings();
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Eingabe nicht erkannt!");
            }
        }while(true);
    }
}
