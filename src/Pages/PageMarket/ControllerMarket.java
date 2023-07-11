package Pages.PageMarket;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Pages.DataSaver;
import Pages.OpenScene;
import UseCase.Barang.BarangProdusen.Produk;
import UseCase.Pengecek.PengecekProduk;
import UseCase.Pengguna.Pengguna;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class ControllerMarket implements Initializable{

    DataSaver dataSaver = new DataSaver();

    String lokasiDataProduk = "src\\Data\\DataProduk\\dataProduk.xml";
    String lokasiDataPengecekProduk = "src\\Data\\DataPengecek\\dataPengecekProduk.xml";

    ArrayList<PengecekProduk> KumpulanPengecekProduk = new ArrayList<>();
    ArrayList<Produk> KumpulanProduk = new ArrayList<>();

    @FXML
    private Label Judul1, Judul2, Judul3, Judul4, Judul5, Judul6, Judul7, Judul8;

    @FXML
    private Label harga1, harga2, harga3, harga4, harga5, harga6, harga7, harga8;

    @FXML
    private Label Stok1, Stok2, Stok3, Stok4, Stok5, Stok6, Stok7, Stok8;

    @FXML
    private Button beli1, beli2, beli3, beli4, beli5, beli6, beli7, beli8;

    @FXML
    private BorderPane HalamanProduk1, HalamanProduk2, HalamanProduk3, HalamanProduk4, HalamanProduk5, HalamanProduk6, HalamanProduk7, HalamanProduk8;

    @FXML
    private ScrollPane HalamanMarketUtama;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void kehalamanProduk(ActionEvent event){
        Button button = (Button) event.getSource();
        String buttonId = button.getId();

        switch (buttonId) {
            case "buttonProduk1":
                HalamanProduk1.setVisible(true);
                HalamanMarketUtama.setVisible(false);
                HalamanProduk2.setVisible(false);
                HalamanProduk3.setVisible(false);
                HalamanProduk4.setVisible(false);
                HalamanProduk5.setVisible(false);
                HalamanProduk6.setVisible(false);
                HalamanProduk7.setVisible(false);
                HalamanProduk8.setVisible(false);

                KumpulanPengecekProduk.get(0).setidProduk("1");
                save();
                break;
            case "buttonProduk2":
                HalamanProduk2.setVisible(true);
                HalamanMarketUtama.setVisible(false);
                HalamanProduk1.setVisible(false);
                HalamanProduk3.setVisible(false);
                HalamanProduk4.setVisible(false);
                HalamanProduk5.setVisible(false);
                HalamanProduk6.setVisible(false);
                HalamanProduk7.setVisible(false);
                HalamanProduk8.setVisible(false);

                KumpulanPengecekProduk.get(0).setidProduk("2");
                save();
                break;
            case "buttonProduk3":
                HalamanProduk3.setVisible(true);
                HalamanMarketUtama.setVisible(false);
                HalamanProduk2.setVisible(false);
                HalamanProduk1.setVisible(false);
                HalamanProduk4.setVisible(false);
                HalamanProduk5.setVisible(false);
                HalamanProduk6.setVisible(false);
                HalamanProduk7.setVisible(false);
                HalamanProduk8.setVisible(false);

                KumpulanPengecekProduk.get(0).setidProduk("3");
                save();
                break;
            case "buttonProduk4":
                HalamanProduk4.setVisible(true);
                HalamanMarketUtama.setVisible(false);
                HalamanProduk2.setVisible(false);
                HalamanProduk3.setVisible(false);
                HalamanProduk1.setVisible(false);
                HalamanProduk5.setVisible(false);
                HalamanProduk6.setVisible(false);
                HalamanProduk7.setVisible(false);
                HalamanProduk8.setVisible(false);

                KumpulanPengecekProduk.get(0).setidProduk("4");
                save();
                break;
            case "buttonProduk5":
                HalamanProduk5.setVisible(true);
                HalamanMarketUtama.setVisible(false);
                HalamanProduk2.setVisible(false);
                HalamanProduk3.setVisible(false);
                HalamanProduk4.setVisible(false);
                HalamanProduk1.setVisible(false);
                HalamanProduk6.setVisible(false);
                HalamanProduk7.setVisible(false);
                HalamanProduk8.setVisible(false);

                KumpulanPengecekProduk.get(0).setidProduk("5");
                save();
                break;
            case "buttonProduk6":
                HalamanProduk6.setVisible(true);
                HalamanMarketUtama.setVisible(false);
                HalamanProduk2.setVisible(false);
                HalamanProduk3.setVisible(false);
                HalamanProduk4.setVisible(false);
                HalamanProduk5.setVisible(false);
                HalamanProduk1.setVisible(false);
                HalamanProduk7.setVisible(false);
                HalamanProduk8.setVisible(false);

                KumpulanPengecekProduk.get(0).setidProduk("6");
                save();
                break;
            case "buttonProduk7":
                HalamanProduk7.setVisible(true);
                HalamanMarketUtama.setVisible(false);
                HalamanProduk2.setVisible(false);
                HalamanProduk3.setVisible(false);
                HalamanProduk4.setVisible(false);
                HalamanProduk5.setVisible(false);
                HalamanProduk6.setVisible(false);
                HalamanProduk1.setVisible(false);
                HalamanProduk8.setVisible(false);

                KumpulanPengecekProduk.get(0).setidProduk("7");
                save();
                break;
            case "buttonProduk8":
                HalamanProduk8.setVisible(true);
                HalamanMarketUtama.setVisible(false);
                HalamanProduk2.setVisible(false);
                HalamanProduk3.setVisible(false);
                HalamanProduk4.setVisible(false);
                HalamanProduk5.setVisible(false);
                HalamanProduk6.setVisible(false);
                HalamanProduk7.setVisible(false);
                HalamanProduk1.setVisible(false);

                KumpulanPengecekProduk.get(0).setidProduk("8");
                save();
                break;
            default:
                HalamanMarketUtama.setVisible(true);
                HalamanProduk1.setVisible(false);
                HalamanProduk2.setVisible(false);
                HalamanProduk3.setVisible(false);
                HalamanProduk4.setVisible(false);
                HalamanProduk5.setVisible(false);
                HalamanProduk6.setVisible(false);
                HalamanProduk7.setVisible(false);
                HalamanProduk8.setVisible(false);
                break;
        }
    }

    @FXML
    public void kehalamanMarket(ActionEvent event){
        
        HalamanMarketUtama.setVisible(true);
        HalamanProduk1.setVisible(false);
        HalamanProduk2.setVisible(false);
        HalamanProduk3.setVisible(false);
        HalamanProduk4.setVisible(false);
        HalamanProduk5.setVisible(false);
        HalamanProduk6.setVisible(false);
        HalamanProduk7.setVisible(false);
        HalamanProduk8.setVisible(false);
    }

    @FXML
    public void beliBarang(ActionEvent event) throws IOException{
        
        root = FXMLLoader.load(getClass().getResource("/Pages/PageMarket/KonfirmasiBeli/ViewKonfirmasiBeli.fxml"));
        
        stage = new Stage();
        scene = new Scene(root);

        stage.setTitle("Konfirmasi Pembelian");
        stage.setScene(scene);
        stage.show();
    }

    private void save(){
        //save data
        dataSaver.saveDataPengecekProduk(KumpulanPengecekProduk, lokasiDataPengecekProduk);
        load();
    }
    private void load(){
        // Load data untuk setiap objek produk
        KumpulanProduk = dataSaver.loadDataProduk(lokasiDataProduk);
        KumpulanPengecekProduk = dataSaver.loadDataPengecekProduk(lokasiDataPengecekProduk);
        System.out.println("Jumlah produk: " + KumpulanProduk.size());

        // Menampilkan data produk pada masing-masing halaman
        displayNamaProduk();
        displayHargaProduk();
        displayStokProduk();
        
    }

    public void displayNamaProduk() {
        ArrayList<Label> judulLabels = new ArrayList<>();
        judulLabels.add(Judul1);
        judulLabels.add(Judul2);
        judulLabels.add(Judul3);
        judulLabels.add(Judul4);
        judulLabels.add(Judul5);
        judulLabels.add(Judul6);
        judulLabels.add(Judul7);
        judulLabels.add(Judul8);
    
        for (int i = 0; i < KumpulanProduk.size(); i++) {
            if (i < judulLabels.size()) {
                judulLabels.get(i).setText(KumpulanProduk.get(i).getNamaProduk());
            }
        }
    }
    
    public void displayHargaProduk() {
        ArrayList<Label> hargaLabels = new ArrayList<>();
        hargaLabels.add(harga1);
        hargaLabels.add(harga2);
        hargaLabels.add(harga3);
        hargaLabels.add(harga4);
        hargaLabels.add(harga5);
        hargaLabels.add(harga6);
        hargaLabels.add(harga7);
        hargaLabels.add(harga8);
    
        for (int i = 0; i < KumpulanProduk.size(); i++) {
            if (i < hargaLabels.size()) {
                hargaLabels.get(i).setText(KumpulanProduk.get(i).getHargaProduk().toString());
            }
        }
    }

    public void displayStokProduk() {
        ArrayList<Label> StokLabels = new ArrayList<>();
        StokLabels.add(Stok1);
        StokLabels.add(Stok2);
        StokLabels.add(Stok3);
        StokLabels.add(Stok4);
        StokLabels.add(Stok5);
        StokLabels.add(Stok6);
        StokLabels.add(Stok7);
        StokLabels.add(Stok8);
    
        for (int i = 0; i < KumpulanProduk.size(); i++) {
            if (i < StokLabels.size()) {
                StokLabels.get(i).setText(KumpulanProduk.get(i).getStokProduk().toString());
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        load();
    }
}
