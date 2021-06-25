package Datenobjekte;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Constans {
    public static File txtUsers = new File("src/Resources/txtUsers.txt");
    public static File txtBookings = new File("src/Resources/txtBookings.txt");

    public static User myUser= null;
    public static Booking myBooking= null;

    public static List<Booking> lsBooking= new ArrayList<Booking>();
    public static List<Booking> lsMyBooking= new ArrayList<Booking>();
    public static List<Booking> lsMyBooking1= new ArrayList<Booking>();

    public static BufferedReader br;
    public static BufferedWriter bw;
    public static InputStreamReader is;


    public static HashMap<String, User> hmUser= new HashMap<String, User>();
    public static HashMap<String, Booking> hmBooking= new HashMap<String, Booking>();



}