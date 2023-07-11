package Pages.PageAkun;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StageAkun extends Application {
    private static Stage stg;
    public static Scene scene;
    
    @Override
    public void start(Stage stage) throws Exception {
        stg = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/Pages/PageAkun/ViewAkun.fxml"));
        
        scene = new Scene(root);

        stage.setTitle("Upcycle");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}