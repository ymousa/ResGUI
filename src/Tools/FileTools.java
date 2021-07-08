package Tools;


import Datenobjekte.Booking;
import Datenobjekte.Constans;
import Datenobjekte.User;

import java.io.*;


public class FileTools extends Constans {

    public FileTools() throws IOException {
        readFileUsers();
        readFileBookings();
    }

    public static void readFileBookings()throws IOException {
        br = new BufferedReader(new FileReader(Constans.txtBookings));
        String sLine = null;
        while((sLine = br.readLine()) != null ){      //data von txtBookings auslesen und in der hmBooking speichern
            String[] sBookingData = sLine.split(";");
            lsBooking.add(new Booking(sBookingData[0], sBookingData[1],
                    sBookingData[2], sBookingData[3],
                    sBookingData[4], sBookingData[5],
                    sBookingData[6]));
        }
        br.close();
        br.close();
    }

    public static void readFileUsers()throws IOException{
        br = new BufferedReader(new FileReader(txtUsers));
        String sLine = null;
        while((sLine = br.readLine()) != null ){      //data von txtUsers.txt auslesen und in der Liste User speichern
            String[] sUserData = sLine.split(";");
            hmUser.put(sUserData[1],new User(sUserData[0], sUserData[1], sUserData[2]));
        }
        br.close();
        br.close();
    }

    public static void wtiteFileBookings()throws IOException{
        FileWriter fw= new FileWriter(txtBookings, false);
        bw= new BufferedWriter(fw);
        String sep= ";";
        int i=0;
        for (Booking booking:lsBooking){
            i++;
            String outPutText= i +sep+ booking.getsUser() +
                    sep+ booking.getsRoomNr() +sep+ booking.getDateOfCheckin() +
                    sep+ booking.getsBookingName() +
                    sep+ booking.getiDuration() +sep+ booking.getsNots();
            bw.write(outPutText);
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }

    public static void wtiteFileUsers() throws IOException {
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

    public static void printBookings() throws IOException {
        for(int i=0; i<lsBooking.size(); i++){
            System.out.println(lsBooking.get(i));
            i++;
        }
    }

    public static void printUsers() throws IOException {

        hmUser.forEach((key, User) -> {
            System.out.println(User.toString());
        });
    }
}
