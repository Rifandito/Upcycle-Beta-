package Pages.PageMarket.KonfirmasiBeli;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class StageKonfirmasiBeli extends Application {

    private static Stage stg;
    
    @Override
    public void start(Stage stage) throws Exception {
        stg = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/Pages/PageMarket/KonfirmasiBeli/ViewKonfirmasiBeli.fxml"));
        
        Scene scene = new Scene(root);

        stage.setTitle("Konfirmasi Pembelian");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}