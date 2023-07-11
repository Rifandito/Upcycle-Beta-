package UseCase.Transaksi;

import java.util.ArrayList;

import Pages.DataSaver;

public class TestTransaksi {
    
    public static void main(String[] args) {
        
        DataSaver dataSaver = new DataSaver();

        String lokasiDataTransaksi = "src\\Data\\DataTransaksi\\dataTransaksi.xml";

        ArrayList<Transaksi> KumpulanTransaksi = new ArrayList<>();

        KumpulanTransaksi.add(new Transaksi(1, "Beli Ecobrick", "Ecopay", "Berhasil", "1"));

        // Simpan data untuk setiap objek pengguna
        dataSaver.saveDataTransaksi(KumpulanTransaksi, lokasiDataTransaksi);

        // Load data 
        KumpulanTransaksi = dataSaver.loadDataTransaksi(lokasiDataTransaksi);

        if (!KumpulanTransaksi.isEmpty()) {
            KumpulanTransaksi.get(0).getnoTransaksi();
        } else {
            System.out.println("Data Pengguna kosong atau tidak tersedia.");
        }
    }
}
