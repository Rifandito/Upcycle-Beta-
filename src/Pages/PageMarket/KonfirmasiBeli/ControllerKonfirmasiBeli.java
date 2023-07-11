package Pages.PageMarket.KonfirmasiBeli;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.scene.Node;

import Pages.DataSaver;
import UseCase.Barang.BarangProdusen.Produk;
import UseCase.Barang.BarangProdusen.Hitung.hitungProduk;
import UseCase.Pengecek.PengecekProduk;
import UseCase.Pengecek.PengecekTransaksi;
import UseCase.Pengguna.Pengguna;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerKonfirmasiBeli implements Initializable{

    DataSaver dataSaver = new DataSaver();

    String lokasiDataProduk = "src\\Data\\DataProduk\\dataProduk.xml";
    String lokasiDataPengecekProduk = "src\\Data\\DataPengecek\\dataPengecekProduk.xml";
    String lokasiDataPengecekTransaksi = "src\\Data\\DataPengecek\\dataPengecekTransaksi.xml";

    ArrayList<PengecekTransaksi> KumpulanPengecekTransaksi = new ArrayList<>();
    ArrayList<PengecekProduk> KumpulanPengecekProduk = new ArrayList<>();
    ArrayList<Produk> KumpulanProduk = new ArrayList<>();
    hitungProduk hitungproduk = new hitungProduk();

    @FXML
    private Label namaProduk, harga, tidakSesuai;

    @FXML
    private TextField jumlahBeli;

    String NamaProduk;
    Integer HargaProduk;
    public Integer JumlahBeli;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        load();
    }

    @FXML
    private void beli(ActionEvent event){
        NamaProduk = namaProduk.getText();
        HargaProduk = Integer.valueOf(harga.getText());
        JumlahBeli = Integer.valueOf(jumlahBeli.getText());

        if (JumlahBeli < 1 || JumlahBeli > 10) {
            tidakSesuai.setText("Jumlah barang minimal 1 dan tidak boleh lebih dari 10");
        } else {

            //belum bisa update di Page barangnya
            for (Produk produk : KumpulanProduk) {
                if (KumpulanPengecekProduk.get(0).getidProduk().equals(produk.getProdukId())) {
                    produk.setStokProduk(hitungproduk.kurang(produk.getStokProduk(), JumlahBeli));
                    save();
                    break;
                }
            }

            //update ke tableView


            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();
        }
    }

    @FXML
    private void batal(ActionEvent event){
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    public void save(){
        //save data produk
        dataSaver.saveDataProduk(KumpulanProduk, lokasiDataProduk);
        load();
    }

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
                harga.setText(String.valueOf(produk.getHargaProduk()));
                
                break;
            }
        }
    }

    public Integer getJumlahBeli(){
        return this.JumlahBeli;
    }
}
