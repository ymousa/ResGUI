package Tools;

import Datenobjekte.Booking;
import Datenobjekte.Constans;
import Datenobjekte.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookingTools extends Constans {

    public static void showBooking(User searchingUser) {
        for (int i=0; i<lsBooking.size(); i++) {
            if (lsBooking.get(i).getsUserName().equals(searchingUser.getsName())) {
                System.out.println(lsBooking.get(i));
            }
        }
    }

    public static void insertBooking(User user) throws IOException{
        Booking newbooking= new Booking();
        is = new InputStreamReader(System.in);          //get Booking input: set all input in a newBooking
        br= new BufferedReader(is);

        newbooking.setiBookingNr(getLastBooking()+1);
        newbooking.setsUserName(user.getsName());
        System.out.print("Raumnummer: ");
        newbooking.setiRoomNr(Integer.parseInt(br.readLine()));
        System.out.print("Datum(Jahr-Monat-Tag): ");
        newbooking.setsDate(br.readLine());
        System.out.print("Veranstaltung: ");
        newbooking.setsBookingName(br.readLine());
        System.out.print("Uhrzeit(Stunde:Minute): ");
        newbooking.setsTime(br.readLine());
        System.out.print("Dauer: ");
        newbooking.setfDuration(Float.parseFloat(br.readLine()));
        System.out.print("Notizen: ");
        newbooking.setsNots(br.readLine());

        lsBooking.add(newbooking);
    }

    public static void deleteBooking(User searchedUser) throws IOException {
        showBooking(searchedUser);
        is = new InputStreamReader(System.in);          //get User input: nr of Booking
        br = new BufferedReader(is);
        System.out.print("Reservieungsnummer: ");
        int iSearchedBooking = Integer.parseInt(br.readLine());
        for (int i = 0; i < lsBooking.size(); i++) {
            if (lsBooking.get(i).getiBookingNr() == (iSearchedBooking)) {
                lsBooking.remove(lsBooking.get(i));
            }
        }
    }

    public static int getLastBooking(){
        int n= lsBooking.size()-1;
        return lsBooking.get(n).getiBookingNr();
    }

}
