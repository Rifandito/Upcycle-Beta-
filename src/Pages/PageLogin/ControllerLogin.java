package Pages.PageLogin;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Pages.DataSaver;
import Pages.OpenScene;
import UseCase.Pengecek.PengecekEcoPay;
import UseCase.Pengecek.PengecekPengguna;
import UseCase.Pengguna.Pengguna;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.Node;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ControllerLogin implements Initializable{

    DataSaver dataSaver = new DataSaver();

    String lokasiDataAkun = "src\\Data\\DataAkun\\dataAkun.xml";
    String lokasiDataPengecekPengguna = "src\\Data\\DataPengecek\\dataPengecekPengguna.xml";
    String lokasiDataPengecekEcoPay = "src\\Data\\DataPengecek\\dataPengecekEcoPay.xml";

    ArrayList<PengecekEcoPay> KumpulanPengecekEcoPay = new ArrayList<>();
    ArrayList<PengecekPengguna> KumpulanPengecekPengguna = new ArrayList<>();
    ArrayList<Pengguna> KumpulanPengguna = new ArrayList<>();

    public String inputUsername;
    public String inputPassword;
    
    @FXML
    private Button buttonLogin;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @FXML
    private void KlikLogin(ActionEvent event) throws IOException {
        inputUsername = username.getText();
        inputPassword = password.getText();

        boolean loginSuccess = false;
        
        for (Pengguna user : KumpulanPengguna) {
            if (user.getUsername().equals(inputUsername) && user.getPassword().equals(inputPassword)) {
                loginSuccess = true;

                KumpulanPengecekPengguna.get(0).setIdUser(user.getUserId());
                KumpulanPengecekEcoPay.get(0).setalamatWallet(user.getAlamatWallet());
                save();
                break;
            }
        }

        if (loginSuccess) {
            
            OpenScene object=new OpenScene();
            Pane halaman=object.getPane("Pages/HomePage/HalamanUtama");

            // Mendapatkan stage saat ini
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Mengubah scene dengan halaman yang baru
            Scene scene = new Scene(halaman);
            currentStage.setScene(scene);

        } else {
            wrongLogin.setText("Username atau password salah. Silakan coba lagi.");
        }
    }

    // Save data untuk semua atribut Pengguna
    private void save(){
        // Simpan data untuk setiap objek pengguna
        dataSaver.saveDataPengecekPengguna(KumpulanPengecekPengguna, lokasiDataPengecekPengguna);
        dataSaver.saveDataPengecekEcoPay(KumpulanPengecekEcoPay, lokasiDataPengecekEcoPay);
    }

    // Load data dari setiap tempat file
    private void load() throws IOException{
        // Load data untuk setiap objek pengguna
        KumpulanPengguna = dataSaver.loadDataPengguna(lokasiDataAkun);
        KumpulanPengecekPengguna = dataSaver.loadDataPengecekPengguna(lokasiDataPengecekPengguna);
        KumpulanPengecekEcoPay = dataSaver.loadDataPengecekEcoPay(lokasiDataPengecekEcoPay);
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Load data
        System.out.println("Current directory: " + System.getProperty("user.dir"));
        try {
            load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}