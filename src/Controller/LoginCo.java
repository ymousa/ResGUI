package Controller;

import Datenobjekte.Constans;
import Tools.LoginTool;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginCo extends Constans{


    @FXML
    private Label loginMessage;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    void  LogInClick(ActionEvent event) throws IOException {
        MainCo mc0 = new MainCo("logout");

        String sUsername = username.getText().toString();
        String sPassword = password.getText().toString();
        activeUser = LoginTool.verify(sUsername, sPassword);
        if (activeUser != null) {
            loginMessage.setText("Login succsess!");
            MainCo mainC = new MainCo(event, "../FXML/showBooking.fxml");
        } else {
            loginMessage.setText("Please try again...");
        }
    }

    @FXML
    void  goToSignIn(ActionEvent event) throws IOException {
        MainCo mainC= new MainCo(event ,"../FXML/SignIn.fxml");

    }



}
