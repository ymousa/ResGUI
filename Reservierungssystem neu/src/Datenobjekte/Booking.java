package Datenobjekte;


public class Booking {
    private int iBookingNr=0;
    private String sUserName="";
    private int iRoomNr=0;
    private String sDate="";
    private String sBookingName="";
    private String sTime="";
    private float fDuration=0f;
    private String sNots="";


    public Booking(String sBookingNr, String sUserName, String sRoomNr, String sDate,      //for saving in list
                   String sBookingName, String sTime, String sDuration, String sNots){
        this.iBookingNr= Integer.parseInt(sBookingNr);
        this.sUserName= sUserName;
        this.iRoomNr= Integer.parseInt(sRoomNr);
        this.sDate= sDate;
        this.sBookingName= sBookingName;
        this.sTime= sTime;
        this.fDuration= Float.parseFloat(sDuration);
        this.sNots= sNots;
    }

    public Booking(int iBookingNr, String sUserName, int iRoomNr, String sDate,            //for insert a Booking
                   String sBookingName, String sTime, float fDuration, String sNots){
        this.iBookingNr= iBookingNr;
        this.sUserName= sUserName;
        this.iRoomNr= iRoomNr;
        this.sDate= sDate;
        this.sBookingName= sBookingName;
        this.sTime= sTime;
        this.fDuration= fDuration;
        this.sNots= sNots;
    }

    public Booking() {}


    @Override
    public String toString() {
        return "Booking{" +
                "iBookingNr=" + iBookingNr +
                ", sUserName='" + sUserName + '\'' +
                ", iRoomNr=" + iRoomNr +
                ", sDate=" + sDate +
                ", sBookingName='" + sBookingName + '\'' +
                ", sTime=" + sTime +
                ", fDuration=" + fDuration +
                ", sNots='" + sNots + '\'' +
                '}';
    }

    public int getiBookingNr() {
        return iBookingNr;
    }

    public void setiBookingNr(int iBookingNr) {
        this.iBookingNr = iBookingNr;
    }

    public String getsUserName() {
        return sUserName;
    }

    public void setsUserName(String sUserName) {
        this.sUserName = sUserName;
    }

    public int getiRoomNr() {
        return iRoomNr;
    }

    public void setiRoomNr(int iRoomNr) {
        this.iRoomNr = iRoomNr;
    }

    public String getsBookingName() {
        return sBookingName;
    }

    public void setsBookingName(String sBookingName) {
        this.sBookingName = sBookingName;
    }

    public float getfDuration() {
        return fDuration;
    }

    public void setfDuration(float fDuration) {
        this.fDuration = fDuration;
    }

    public String getsNots() {
        return sNots;
    }

    public void setsNots(String sNots) {
        this.sNots = sNots;
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }

    public String getsTime() {
        return sTime;
    }

    public void setsTime(String sTime) {
        this.sTime = sTime;
    }
}
