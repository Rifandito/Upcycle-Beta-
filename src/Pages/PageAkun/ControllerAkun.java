package Pages.PageAkun;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Pages.DataSaver;
import Pages.OpenScene;

import UseCase.Pengecek.PengecekPengguna;
import UseCase.Pengguna.Pengguna;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.Node;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class ControllerAkun implements Initializable {

    DataSaver dataSaver = new DataSaver();

    String lokasiDataAkun = "src\\Data\\DataAkun\\dataAkun.xml";
    String lokasiDataPengecekPengguna = "src\\Data\\DataPengecek\\dataPengecekPengguna.xml";

    ArrayList<PengecekPengguna> KumpulanPengecekPengguna = new ArrayList<>();

    ArrayList<Pengguna> KumpulanPengguna = new ArrayList<>();

    @FXML
    private AnchorPane rootAnchorUtama;

    @FXML
    private BorderPane rootBorderUtama;

    @FXML
    private Label LabelUsernameAkun, LabelPasswordAkun, LabelWalletAkun, LabelPeranAkun;

    @FXML
    private ImageView logo;
    
    //ke halaman utama
    @FXML
    private void keHalamanUtama(ActionEvent event) {
        OpenScene object=new OpenScene();
        Pane halaman=object.getPane("Pages/HomePage/HalamanUtama");

        // Mendapatkan stage saat ini
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Mengubah scene dengan halaman yang baru
        Scene scene = new Scene(halaman);
        currentStage.setScene(scene);
    }

    @FXML
    private void logout(ActionEvent event){
        
        OpenScene object=new OpenScene();
        Pane halaman=object.getPane("Pages/PageLogin/ViewLogin");

        // Mendapatkan stage saat ini
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Mengubah scene dengan halaman yang baru
        Scene scene = new Scene(halaman);
        currentStage.setScene(scene);

    }

    // Load data dari setiap tempat file
    public void load() throws IOException{
        
        KumpulanPengguna = dataSaver.loadDataPengguna(lokasiDataAkun);
        KumpulanPengecekPengguna = dataSaver.loadDataPengecekPengguna(lokasiDataPengecekPengguna);
        System.out.println("Jumlah pengguna: " + KumpulanPengguna.size());

        if (KumpulanPengecekPengguna != null && KumpulanPengecekPengguna.get(0).getIdUser() != null) {
            for (Pengguna pengguna : KumpulanPengguna) {
                if (KumpulanPengecekPengguna.get(0).getIdUser().equals(pengguna.getUserId())) {
                    displayName(pengguna.getUserId());
                    break;
                }
            }
        } else {
            System.out.println("gagal load");
        }
        
    }

    public void displayName(String userID){
        for (Pengguna pengguna : KumpulanPengguna) {
            if (userID.equals(pengguna.getUserId())) {
                LabelUsernameAkun.setText(pengguna.getUsername());
                LabelPasswordAkun.setText(pengguna.getPassword());
                LabelWalletAkun.setText(pengguna.getAlamatWallet());
                LabelPeranAkun.setText(pengguna.getPeran());
                break;
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // Load data
        System.out.println("Current directory: " + System.getProperty("user.dir"));
        try {
            load();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}