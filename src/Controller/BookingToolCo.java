package Controller;

import Datenobjekte.Booking;
import Tools.FileTools;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.time.LocalDate;


import static Tools.BookingTools.getLastBooking;

public class BookingToolCo extends LoginCo {


    @FXML
    private TextField raumNr;

    @FXML
    private DatePicker datum;

    @FXML
    private TextField veranstaltung;

    @FXML
    private TextField uhrzeit;

    @FXML
    private TextField dauer;

    @FXML
    private TextField notizen;


    void clearAllTextfield(){
        raumNr.clear();
        datum.setValue(null);
        veranstaltung.clear();
        uhrzeit.clear();
        dauer.clear();
        notizen.clear();
    }

    LocalDate getDateFromDatePicker (){
        return datum.getValue();
    }

    @FXML
    void bookClick() throws IOException {
        String nrR= String.valueOf(getLastBooking()+1);
        Booking newBooking = new Booking(nrR, myUser.getsName(), raumNr.getText(), getDateFromDatePicker(),
                veranstaltung.getText(), uhrzeit.getText(), dauer.getText(), notizen.getText());
        if(uhrzeit.getText()!=null){
            lsBooking.add(newBooking);
            FileTools.wtiteFileBookings();
            System.out.println("add new Booking success!");
        }
        clearAllTextfield();

    }

    @FXML
    void showBookingClick(ActionEvent event) throws IOException {
        MainCo mainC= new MainCo(event ,"../FXML/showBooking.fxml");
    }

    @FXML
    void bookingToolClick(ActionEvent event) throws IOException {
        MainCo mainC= new MainCo(event ,"../FXML/bookingTool.fxml");
    }

    @FXML
    void deleteToolClick(ActionEvent event) throws IOException {
        MainCo mainC= new MainCo(event ,"../FXML/CancelBooking.fxml");
    }

    @FXML
    void logoutClick(ActionEvent event) throws IOException {
        MainCo mainC= new MainCo(event ,"../FXML/LogIn.fxml");

    }

}
