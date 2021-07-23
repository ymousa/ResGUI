package Controller;

import Datenobjekte.Booking;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.IOException;

import static Datenobjekte.Booking.getLsBooking;


public class ShowBookingCo {


    @FXML
    private TextArea nr;

    @FXML
    private TextArea name;

    @FXML
    private TextArea datum;

    @FXML
    private TextArea veranstaltung;

    @FXML
    private TextArea dauer;

    @FXML
    private TextArea notizen;

    void tableProperties(){
        nr.clear();
        name.clear();
        datum.clear();
        veranstaltung.clear();
        dauer.clear();
        notizen.clear();

        nr.setWrapText(true);
        nr.setEditable(false);
        name.setWrapText(true);
        name.setEditable(false);
        datum.setWrapText(true);
        datum.setEditable(false);
        veranstaltung.setWrapText(true);
        veranstaltung.setEditable(false);
        dauer.setWrapText(true);
        dauer.setEditable(false);
        notizen.setWrapText(true);
        notizen.setEditable(false);

    }                       //first clear,  unable to edit, wrap text

    void setTable(){
        tableProperties();
        for (Booking booking : getLsBooking()) {
            nr.appendText(booking.getiBookingNr() + "\n");
            name.appendText(booking.getsUser() + "\n");
            datum.appendText(booking.getDateOfCheckin() + "\n");
            veranstaltung.appendText(booking.getsBookingName() + "\n");
            dauer.appendText(booking.getiDuration() + "\n");
            notizen.appendText(booking.getsNots() + "\n");
        }
    }                               // st text in table

    @FXML
    void updateResClick(ActionEvent event) {
        setTable();
    }

    @FXML
    void deleteToolClick(ActionEvent event) throws IOException {
        MainCo mainC= new MainCo(event ,"../FXML/CancelBooking.fxml");
    }

    @FXML
    void logoutClick(ActionEvent event) throws IOException {
        MainCo mainC= new MainCo(event ,"../FXML/LogIn.fxml");

    }

    @FXML
    void bookingToolClick(ActionEvent event) throws IOException {
        MainCo mainC= new MainCo(event ,"../FXML/bookingTool.fxml");
    }


}
