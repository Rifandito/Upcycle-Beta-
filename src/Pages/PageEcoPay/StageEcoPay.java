package Pages.PageEcoPay;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StageEcoPay extends Application {

    private static Stage stg;
    
    @Override
    public void start(Stage stage) throws Exception {
        stg = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/Pages/PageEcoPay/ViewEcoPay.fxml"));
        
        Scene scene = new Scene(root);

        //scene.getStylesheets().add(getClass().getResource("tampilan.css").toExternalForm());

        stage.setTitle("Upcycle");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}