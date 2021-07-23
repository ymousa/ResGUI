package Tools;


import Datenobjekte.Booking;
import Datenobjekte.User;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;


public class FileTools extends User {
    public File txtUsers = new File("Resources/txtUsers.txt");
    public File txtBookings = new File("Resources/txtBookings.txt");
    public static HashMap<String, User> hmUser = new HashMap<String, User>();
    public BufferedReader br;
    public BufferedWriter bw;

    public FileTools() throws IOException {
        readFileUsers();
        readFileBookings();
    }

    public void readFileBookings() throws IOException {
        br = new BufferedReader(new FileReader(txtBookings));
        ArrayList<Booking> allBookings = new ArrayList<Booking>();
        String sLine = null;
        while ((sLine = br.readLine()) != null) {      //data von txtBookings auslesen und in der hmBooking speichern
            String[] sBookingData = sLine.split(";");
            allBookings.add(new Booking(sBookingData[0], sBookingData[1],
                    sBookingData[2], sBookingData[3],
                    sBookingData[4], sBookingData[5],
                    sBookingData[6]));
        }
        br.close();
        br.close();

        setLsBooking(allBookings);
    }

    public void readFileUsers() throws IOException {
        br = new BufferedReader(new FileReader(txtUsers));
        String sLine = null;
        while ((sLine = br.readLine()) != null) {      //data von txtUsers.txt auslesen und in der Liste User speichern
            String[] sUserData = sLine.split(";");
            hmUser.put(sUserData[1], new User(sUserData[0], sUserData[1], sUserData[2]));
        }
        br.close();
        br.close();
    }

    public void wtiteFileBookings() throws IOException {
        FileWriter fw = new FileWriter(txtBookings, false);
        bw = new BufferedWriter(fw);
        String sep = ";";
        int i = 0;
        for (Booking booking : getLsBooking()) {
            i++;
            String outPutText = i + sep + booking.getsUser() +
                    sep + booking.getsRoomNr() + sep + booking.getDateOfCheckin() +
                    sep + booking.getsBookingName() +
                    sep + booking.getiDuration() + sep + booking.getsNots();
            bw.write(outPutText);
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }

    public void wtiteFileUsers() throws IOException {
        FileWriter fw = new FileWriter(txtUsers, false);
        bw = new BufferedWriter(fw);
        String sep = ";";
        for (String key : hmUser.keySet()) {
            String outPutText = hmUser.get(key).getsName() + sep + hmUser.get(key).getsUsername() +
                    sep + hmUser.get(key).getsPass();
            bw.write(outPutText);
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }

   /* public static void printBookings() throws IOException {
        for(int i=0; i<lsBooking.size(); i++){
            System.out.println(lsBooking.get(i));
            i++;
        }
    }

    public static void printUsers() throws IOException {

        hmUser.forEach((key, User) -> {
            System.out.println(User.toString());
        });
    }*/
}
