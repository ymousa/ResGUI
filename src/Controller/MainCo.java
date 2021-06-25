package Controller;

import Tools.FileTools;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainCo {


    public MainCo(ActionEvent event, String fxml) throws IOException {
        switchScene(event,fxml);
    }


    public static void firstMethod() throws IOException {
         FileTools.readFileUsers();
         FileTools.wtiteFileUsers();
         FileTools.readFileBookings();
         FileTools.wtiteFileBookings();
     }

     public  void switchScene(ActionEvent event, String fxml) throws IOException {
         Parent root= FXMLLoader.load(getClass().getResource(fxml));
         Scene scene = new Scene(root);
         Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
         window.setScene(scene);
         window.setTitle("Anmeldung");
         window.show();
     }
}
