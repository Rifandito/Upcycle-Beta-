package UseCase.Barang.BarangProdusen;

import java.util.ArrayList;

import Pages.DataSaver;

public class TestProduk {
    
    public static void main(String[] args) {
        
        DataSaver dataSaver = new DataSaver();

        String lokasiDataProduk = "src\\Data\\DataProduk\\dataProduk.xml";

        ArrayList<Produk> KumpulanProduk = new ArrayList<>();

        KumpulanProduk.add(new Produk("Bangku Biru Ecobrick", 40000, 200, "1"));
        KumpulanProduk.add(new Produk("Meja Merah Putih Ecobrick", 80000, 200, "2"));
        KumpulanProduk.add(new Produk("Meja Warna-warni Ecobrick", 30000, 200, "3"));
        KumpulanProduk.add(new Produk("Kursi Orange Ecobrick", 50000, 200, "4"));
        KumpulanProduk.add(new Produk("Bangku Kotak-kotak Ecobrick", 75000, 200, "5"));
        KumpulanProduk.add(new Produk("Pot Ecobrick", 35000, 200, "6"));
        KumpulanProduk.add(new Produk("Sofa Ecobrick", 150000, 200, "7"));
        KumpulanProduk.add(new Produk("Meja Dekorasi Ecobrick", 90000, 200, "8"));

        // Simpan data untuk setiap objek pengguna
        dataSaver.saveDataProduk(KumpulanProduk, lokasiDataProduk);

        // Load data 
        KumpulanProduk = dataSaver.loadDataProduk(lokasiDataProduk);

        if (!KumpulanProduk.isEmpty()) {
            KumpulanProduk.get(0).getProdukId();
        } else {
            System.out.println("Data Pengguna kosong atau tidak tersedia.");
        }
    }
}
