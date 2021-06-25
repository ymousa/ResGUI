package Tools;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Datenobjekte.*;

public class BookingTools extends Constans {

    public static void showMyBooking(User searchingUser) {
        lsMyBooking= new ArrayList<Booking>();
        for (Booking booking : lsBooking) {
            if (booking.getsUser().equals(searchingUser.getsName())) {
                lsMyBooking.add(booking);
            }
        }
    }

    /*public static void insertBooking(User user) throws IOException{
        Booking newbooking= new Booking();
        is = new InputStreamReader(System.in);          //get Booking input: set all input in a newBooking
        br= new BufferedReader(is);

        newbooking.setiBookingNr(getLastBooking()+1);
        newbooking.setsUserName(user.getsName());
        System.out.print("Raumnummer: ");
        newbooking.setiRoomNr(br.readLine());
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
    }*/

    public static void deleteBooking(User searchedUser,Booking selectedBooking) throws IOException {

        for (int i = 0; i < lsBooking.size(); i++) {
            if (lsBooking.get(i) == (selectedBooking) && lsBooking.get(i).getsUser().equals(searchedUser.getsName())) {
                lsBooking.remove(lsBooking.get(i));
            }
        }
    }

    public static int getLastBooking(){
        int n= lsBooking.size()-1;
        return lsBooking.get(n).getiBookingNr();
    }

}
