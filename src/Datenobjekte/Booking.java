package Datenobjekte;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Booking {
    private static ArrayList<Booking> lsBooking;
    private int iBookingNr = 0;
    private String sUser ="";
    private String sRoomNr="";
    private LocalDateTime checkin;
    private String sBookingName="";
    private int iDuration=0;
    private String sNots="";
    private DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;


    public Booking(String sBookingNr, String sUser, String sRoomNr, LocalDate lDate,      //for saving in list
                   String sBookingName, String sTime, String sDuration, String sNots){
        this.iBookingNr= Integer.parseInt(sBookingNr);
        this.sUser = sUser;
        this.sRoomNr= sRoomNr;
        this.checkin= getDateOfCheckin(lDate,sTime);                                          // foramte a checkin date from two strings
        this.sBookingName= sBookingName;
        this.iDuration= Integer.parseInt(sDuration);
        this.sNots= sNots;
    }

    public Booking(String sBookingNr, String sUser, String sRoomNr, String sDateTime,      //for saving in list
                   String sBookingName, String sDuration, String sNots){
        this.iBookingNr= Integer.parseInt(sBookingNr);
        this.sUser = sUser;
        this.sRoomNr= sRoomNr;
        this.checkin= getDateOfCheckin(sDateTime);                                          // foramte a checkin date from two strings
        this.sBookingName= sBookingName;
        this.iDuration= Integer.parseInt(sDuration);
        this.sNots= sNots;
    }

    /*public Booking(int iBookingNr, String sUserName, int iRoomNr, String sDate,            //for insert a Booking
                   String sBookingName, String sTime, float fDuration, String sNots){
        this.iBookingNr= iBookingNr;
        this.sUserName= sUserName;
        this.iRoomNr= iRoomNr;
        this.sDate= sDate;
        this.sBookingName= sBookingName;
        this.sTime= sTime;
        this.fDuration= fDuration;
        this.sNots= sNots;
    }*/

    public Booking() {}


    @Override
    public String toString() {
        return "Nr: " + iBookingNr +
                ", Name: " + sUser +
                ", RaumNr: " + sRoomNr +
                ", Datum: " + checkin +
                ", Veran.: " + sBookingName +
                ", Dauer: " + iDuration +
                ", Notizen: " + sNots;
    }

    public void setLsBooking(ArrayList<Booking> newList) {
        lsBooking = newList;
    }

    public static ArrayList<Booking> getLsBooking() {
        return lsBooking;
    }


    public LocalDateTime getDateOfCheckin(LocalDate lDate, String sTime) {               // for
        String sDateTime = lDate.toString() + "T" + sTime;
        LocalDateTime parsedDateTime = LocalDateTime.parse(sDateTime, formatter);
        return parsedDateTime;
    }

    public LocalDateTime getDateOfCheckin(String sDateTime) {
        LocalDateTime parsedDateTime = LocalDateTime.parse(sDateTime, formatter);
        return parsedDateTime;
    }

    public Date getDateOfCheckout(LocalDateTime checkin, int iDuration){
        Calendar cl = new GregorianCalendar();
        cl.set(checkin.getYear(),checkin.getMonthValue()-1, checkin.getDayOfMonth(),checkin.getHour(),checkin.getMinute(), 0);
        cl.add(Calendar.HOUR, iDuration);
        return cl.getTime();
    }

    public int getiBookingNr() {
        return iBookingNr;
    }

    public void setiBookingNr(int iBookingNr) {
        this.iBookingNr = iBookingNr;
    }

    public String getsUser() {
        return sUser;
    }

    public void setsUser(String sUser) {
        this.sUser = sUser;
    }

    public String getsRoomNr() {
        return sRoomNr;
    }

    public void setiRoomNr(String sRoomNr) {
        this.sRoomNr = sRoomNr;
    }

    public String getsBookingName() {
        return sBookingName;
    }

    public void setsBookingName(String sBookingName) {
        this.sBookingName = sBookingName;
    }

    public int getiDuration() {
        return iDuration;
    }

    public void setiDuration(int iDuration) {
        this.iDuration = iDuration;
    }

    public String getsNots() {
        return sNots;
    }

    public void setsNots(String sNots) {
        this.sNots = sNots;
    }

    public LocalDateTime getDateOfCheckin(){return checkin;}


    /*
* lsBooking hierher verschieben funktionen für den zugriff
* */

}
