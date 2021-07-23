import Controller.MainCo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        MainCo mC = new MainCo();
        Parent root = FXMLLoader.load(getClass().getResource("FXML/Login.fxml"));
        primaryStage.setTitle("ReservierungsSystem");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
        mC = new MainCo();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
