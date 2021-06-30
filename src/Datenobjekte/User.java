package Datenobjekte;


public class User {
    private String sName="";
    private String sUsername="";
    private String sPass="";

    public User(){}

    public User(String sName, String sUsername, String sPass){
        this.sName= sName;
        this.sUsername= sUsername;
        this.sPass= sPass;
    }


    @Override
    public String toString() {
        return
                "sName='" + sName + '\'' +
                ", sUsername='" + sUsername + '\'' +
                ", sPass='" + sPass + '\''
                ;
    }

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

/*
* funktionen für myBooking und lsmyBooking sowie memeber hinzufügen
* */
}
