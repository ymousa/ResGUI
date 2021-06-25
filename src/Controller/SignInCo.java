package Controller;

import Tools.FileTools;
import Tools.LoginTool;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;


public class SignInCo {



    @FXML
    private TextField vorname;

    @FXML
    private TextField nachname;

    @FXML
    private TextField username;

    @FXML
    private PasswordField newpass;

    @FXML
    void SignInClick(ActionEvent event) throws IOException {
        LoginTool.newAccount(vorname.getText(), username.getText(), newpass.getText());
        System.out.println("add new Account succsess");
        FileTools.wtiteFileUsers();
        FileTools.readFileUsers();
        MainCo mainC= new MainCo(event ,"../FXML/LogIn.fxml");
    }

    @FXML
    void goBack(ActionEvent event) throws IOException {
        MainCo mainC= new MainCo(event ,"../FXML/LogIn.fxml");
    }


}
