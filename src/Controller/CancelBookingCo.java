package Controller;

import Datenobjekte.Booking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static Datenobjekte.Constans.*;
import static Tools.BookingTools.*;
import static Tools.FileTools.wtiteFileBookings;


public class CancelBookingCo implements Initializable {

    @FXML
    private ChoiceBox<Booking> choiceBox;

    private ChoiceBox<Booking> emptyBox;

    @FXML
    private Label selectedBooking;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        showMyBooking(myUser);
        choiceBox.getItems().addAll(lsMyBooking);
        choiceBox.setOnAction(this::getBooking);
    }


    public void getBooking(ActionEvent event){                      //for choicBox:  myBooking get valueOf list: lsMyBooking
        myBooking= choiceBox.getValue();
        selectedBooking.setText(myBooking.toString());

    }


    @FXML
    void cancelClick(ActionEvent event) throws IOException {
        deleteBooking(myUser, myBooking);
        wtiteFileBookings();

        selectedBooking.setText("Die Reservierung wurde erfolgreich storniert!");
        System.out.println("cancel Booking succsess");// system.out entfernen
        choiceBox= emptyBox;                                                        //choiceBox get empty

        /*lsMyBooking.clear();                                                        //all list get empty
        lsBooking.clear();
        readFileBookings();                                                         //read BookingFile and save it in list
        wtiteFileBookings();*/                                                        //is for numbering the Bookings
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
