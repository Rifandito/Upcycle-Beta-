package Pages.PageTransaksi;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Pages.DataSaver;
import Pages.PageMarket.KonfirmasiBeli.ControllerKonfirmasiBeli;
import UseCase.Barang.BarangProdusen.Produk;
import UseCase.Pengecek.PengecekProduk;
import UseCase.Pengecek.PengecekTransaksi;
import UseCase.Transaksi.Transaksi;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class ControllerTransaksi implements Initializable{

    DataSaver dataSaver = new DataSaver();

    String lokasiDataProduk = "src\\Data\\DataProduk\\dataProduk.xml";
    String lokasiDataPengecekProduk = "src\\Data\\DataPengecek\\dataPengecekProduk.xml";
    String lokasiDataPengecekTransaksi = "src\\Data\\DataPengecek\\dataPengecekTransaksi.xml";

    ArrayList<PengecekTransaksi> KumpulanPengecekTransaksi = new ArrayList<>();
    ArrayList<PengecekProduk> KumpulanPengecekProduk = new ArrayList<>();
    ArrayList<Produk> KumpulanProduk = new ArrayList<>();

    //ControllerKonfirmasiBeli konfirmasiBeli = new ControllerKonfirmasiBeli();
    
    @FXML
    private BorderPane HalamanUtamaTransaksi, HalamanDetailTransaksi;

    @FXML
    private Label labelEror;

    @FXML
    private Label namaProduk, hargaProduk, jumlahPembelian, STATUStransaksi;

    //Tabel
    @FXML
    private TableView<Transaksi> tabelTransaksi;

    //Kolom
    @FXML
    private TableColumn<Transaksi, Integer> NoTransaksi;

    @FXML
    private TableColumn<Transaksi, String> JudulTransaksi;

    @FXML
    private TableColumn<Transaksi, String> AlatTukar;

    // @FXML
    // private TableColumn<Transaksi, String> IDTransaksi;

    @FXML
    private TableColumn<Transaksi, String> StatusTransaksi;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        NoTransaksi.setCellValueFactory(new PropertyValueFactory<Transaksi, Integer>("noTransaksi"));
        JudulTransaksi.setCellValueFactory(new PropertyValueFactory<Transaksi, String>("judulTransaksi"));
        AlatTukar.setCellValueFactory(new PropertyValueFactory<Transaksi, String>("alatTukar"));
        StatusTransaksi.setCellValueFactory(new PropertyValueFactory<Transaksi, String>("Status"));
        //IDTransaksi.setCellValueFactory(new PropertyValueFactory<Transaksi, String>("idTransaksi"));
    }

    @FXML
    private void keHalamanDetailTransaksi(ActionEvent event) {
        
        Transaksi selectedTransaksi = tabelTransaksi.getSelectionModel().getSelectedItem();
        if (selectedTransaksi != null) {
            // Mendapatkan ID transaksi yang dipilih
            String idTransaksi = selectedTransaksi.getidTransaksi();

            // Panggil method untuk menampilkan halaman detail transaksi sesuai dengan ID
            

            // Pindah ke halaman detail transaksi dengan menggunakan data yang dipilih
            HalamanUtamaTransaksi.setVisible(false);
            HalamanDetailTransaksi.setVisible(true);
        } else {
            // Tampilkan pesan error jika tidak ada data yang dipilih
            labelEror.setText("Pilih transaksi terlebih dahulu");
        }
        
    }

    // Method untuk menampilkan halaman detail transaksi dengan ID yang sesuai
    

    public void load(){
        // Load data untuk setiap objek produk
        KumpulanProduk = dataSaver.loadDataProduk(lokasiDataProduk);
        KumpulanPengecekProduk = dataSaver.loadDataPengecekProduk(lokasiDataPengecekProduk);
        KumpulanPengecekTransaksi = dataSaver.loadDataPengecekTransaksi(lokasiDataPengecekTransaksi);

        System.out.println("Jumlah produk: " + KumpulanProduk.size());
        System.out.println("Id Produk saat ini: " + KumpulanPengecekProduk.get(0).getidProduk());
        System.out.println("Id Transaksi: " + KumpulanPengecekTransaksi.get(0).getidTransaksi());

        if (KumpulanPengecekProduk != null && KumpulanPengecekProduk.get(0).getidProduk() != null) {
            for (Produk produk : KumpulanProduk) {
                if (KumpulanPengecekProduk.get(0).getidProduk().equals(produk.getProdukId())) {
                    displayDetail(produk.getProdukId());
                    break;
                }
            }
        } else {
            System.out.println("gagal load");
        }
    }

    public void displayDetail(String ID){
        for (Produk produk : KumpulanProduk) {
            if (ID.equals(produk.getProdukId())) {
                namaProduk.setText(produk.getNamaProduk());
                hargaProduk.setText(String.valueOf(produk.getHargaProduk()));
                //jumlahPembelian.setText(String.valueOf(konfirmasiBeli.getJumlahBeli()));
                
                break;
            }
        }
    }

    @FXML
    private void keHalamanTransaksi(ActionEvent event) {
        HalamanUtamaTransaksi.setVisible(true);
        HalamanDetailTransaksi.setVisible(false);
    }

    
}