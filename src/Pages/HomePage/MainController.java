package Pages.HomePage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Scene;

import Pages.OpenScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class MainController implements Initializable {
    
    @FXML
    private Label label;

    @FXML
    private AnchorPane Skeleton;
    
    @FXML
    private BorderPane mainPane;
    
    @FXML
    private void keHalamanHome(ActionEvent event) {
        OpenScene object = new OpenScene();
        Pane halaman = object.getPane("Pages/PageMarket/ViewMarket");
        mainPane.setCenter(halaman);
    }
    
    @FXML
    private void keHalamanPeranku(ActionEvent event) {
        OpenScene object=new OpenScene();
        Pane halaman=object.getPane("Pages/PagePeran/ViewPeran");
        mainPane.setCenter(halaman);
    }
    
    @FXML
    private void keHalamanMateriDanBerita(ActionEvent event) {
        OpenScene object=new OpenScene();
        Pane halaman=object.getPane("Pages/PageMateridanBerita/ViewMateriBerita");
        mainPane.setCenter(halaman);
    }

    @FXML
    private void keHalamanEcoPay(ActionEvent event) {
        OpenScene object=new OpenScene();
        Pane halaman=object.getPane("Pages/PageEcoPay/ViewEcoPay");
        mainPane.setCenter(halaman);
    }
    
    @FXML
    private void keHalamanTransaksi(ActionEvent event) {
        OpenScene object=new OpenScene();

        Pane halaman=object.getPane("Pages/PageTransaksi/ViewTransaksi");
        mainPane.setCenter(halaman);
    }

    @FXML
    private void keHalamanAkun(ActionEvent event) {
        OpenScene object=new OpenScene();
        Pane halaman=object.getPane("Pages/PageAkun/ViewAkun");

        // Mendapatkan stage saat ini
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Mengubah scene dengan halaman yang baru
        Scene scene = new Scene(halaman);
        currentStage.setScene(scene);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}