package Pages.PageEcoPay;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Pages.DataSaver;
import UseCase.Pengecek.PengecekEcoPay;
import UseCase.Pengguna.Pengguna;
import UseCase.PoinEcoPay.EcoPay;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ControllerEcoPay implements Initializable{
    
    @FXML
    private Label tempatSaldo;

    DataSaver dataSaver = new DataSaver();

    String lokasiDataPengecekEcoPay = "src\\Data\\DataPengecek\\dataPengecekEcoPay.xml";
    String lokasiDataEcopay = "src\\Data\\DataEcoPay\\dataEcoPay.xml";

    ArrayList<EcoPay> KumpulanEcopay = new ArrayList<>();
    ArrayList<PengecekEcoPay> KumpulanPengecekEcoPay = new ArrayList<>();

    // Load data dari setiap tempat file
    public void load() throws IOException{
        
        KumpulanEcopay = dataSaver.loadDataEcoPay(lokasiDataEcopay);
        KumpulanPengecekEcoPay = dataSaver.loadDataPengecekEcoPay(lokasiDataPengecekEcoPay);
        System.out.println("Jumlah pengguna: " + KumpulanEcopay.size());

        if (KumpulanPengecekEcoPay != null && KumpulanPengecekEcoPay.get(0).getalamatWallet() != null) {
            for (EcoPay ecopay : KumpulanEcopay) {
                if (KumpulanPengecekEcoPay.get(0).getalamatWallet().equals(ecopay.getAlamatWallet())) {
                    displaySaldo(ecopay.getSaldo());
                    break;
                }
            }
        } else {
            System.out.println("gagal load");
        }
        
    }

    public void displaySaldo(Integer saldo){
        for (EcoPay ecopay : KumpulanEcopay) {
            if (saldo.equals(ecopay.getSaldo())) {
                tempatSaldo.setText(String.valueOf(saldo));
                break;
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            load();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}