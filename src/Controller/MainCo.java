package Controller;

import Tools.FileTools;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainCo extends FileTools {

    public MainCo() throws IOException {
        firstMethod();
    }

    public MainCo(String logout) throws IOException {
        wtiteFileUsers();
        wtiteFileBookings();
    }


    public MainCo(ActionEvent event, String fxml) throws IOException {
        switchScene(event, fxml);
    }


    public void firstMethod() throws IOException {
        readFileUsers();
        wtiteFileUsers();
        readFileBookings();
        wtiteFileBookings();
    }

    public void switchScene(ActionEvent event, String fxml) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxml));
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setTitle("Anmeldung");
        window.show();
    }
}
