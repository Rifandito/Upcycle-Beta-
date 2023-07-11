package Pages.PagePeran;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StagePeran extends Application {
    private static Stage stg;
    public static Scene scene;
    
    @Override
    public void start(Stage stage) throws Exception {
        stg = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/Pages/PagePeran/ViewPeran.fxml"));
        
        scene = new Scene(root);

        stage.setTitle("Upcycle");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}