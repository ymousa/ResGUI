package Datenobjekte;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Constans {
    public static File txtUsers = new File("Resources/txtUsers.txt");
    public static File txtBookings = new File("Resources/txtBookings.txt");

    public static User myUser = null;  /*activeUser besser*/
    public static Booking myBooking = null; /* in den User ziehen nicht static*/

    public static List<Booking> lsBooking = new ArrayList<Booking>(); /* in Booking ziehen nicht static*/
    public static List<Booking> lsMyBooking = new ArrayList<Booking>(); /* in den User ziehen nicht static*/

    public static BufferedReader br;  /* warum hier einführen ?*/
    public static BufferedWriter bw; /* warum hier einführen ?*/
    public static InputStreamReader is; /* warum hier einführen ?*/


    public static HashMap<String, User> hmUser= new HashMap<String, User>(); /*Klasse anlegen die map dort hinzufügen und hier ein static objekt dieser klasse anlegen*/



}