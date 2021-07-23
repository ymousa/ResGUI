package Datenobjekte;


import java.io.IOException;
import java.util.ArrayList;

public class User extends Booking {
    private String sName = "";
    private String sUsername = "";
    private String sPass = "";
    public Booking myBooking = null;
    public ArrayList<Booking> lsMyBooking = null;


    public User() {
    }

    public User(String sName, String sUsername, String sPass) {
        this.sName = sName;
        this.sUsername = sUsername;
        this.sPass = sPass;
    }


   /* @Override
    public String toString() {
        return
                "sName='" + sName + '\'' +
                ", sUsername='" + sUsername + '\'' +
                ", sPass='" + sPass + '\''
                ;
    }*/

    /*public Booking getMyBooking() {
        List<Booking>  lsMyBooking = new ArrayList<Booking>();
        for (Booking booking : lsBooking) {
            if (booking.getsUser().equals(activeUser.getsName())) {
                lsMyBooking.add(booking);
            }
        }
        return myBooking;
    }*/

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsUsername() {
        return sUsername;
    }

    public void setsUsername(String sEmail) {
        this.sUsername = sEmail;
    }

    public String getsPass() {
        return sPass;
    }

    public void setsPass(String sPass) {
        this.sPass = sPass;
    }

    public Booking getMyBooking() {
        return myBooking;
    }

    public void setMyBooking(Booking newMyBooking) {
        myBooking = newMyBooking;
    }

    public ArrayList<Booking> getLsMyBooking() {
        return lsMyBooking;
    }

    public void setLsMyBooking(ArrayList<Booking> newList) {
        lsMyBooking = newList;
    }


    public void showMyBooking(User searchingUser) {
        setLsMyBooking(new ArrayList<Booking>());
        for (Booking booking : getLsBooking()) {
            if (booking.getsUser().equals(searchingUser.getsName())) {
                lsMyBooking.add(booking);
            }
        }
    }


    public void deleteBooking(User searchedUser, Booking selectedBooking) throws IOException {

        for (int i = 0; i < getLsBooking().size(); i++) {
            if (getLsBooking().get(i) == (selectedBooking) && getLsBooking().get(i).getsUser().equals(searchedUser.getsName())) {
                getLsBooking().remove(getLsBooking().get(i));
            }
        }
    }

    public int getLastBooking() {
        int n = getLsBooking().size() - 1;
        return getLsBooking().get(n).getiBookingNr();
    }



    /*
     * funktionen für myBooking und lsmyBooking sowie memeber hinzufügen
     * */
}
