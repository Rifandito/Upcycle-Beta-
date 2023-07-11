package UseCase.PoinEcoPay;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import Pages.DataSaver;

public class TestEcoPay {
    public static void main(String[] args) throws FileNotFoundException {
        
        DataSaver dataSaver = new DataSaver();

        String lokasiDataEcopay = "src\\Data\\DataEcoPay\\dataEcoPay.xml";

        ArrayList<EcoPay> KumpulanEcopay = new ArrayList<>();

        KumpulanEcopay.add(new EcoPay(10000, "abc"));
        KumpulanEcopay.add(new EcoPay(10000, "bac"));
        KumpulanEcopay.add(new EcoPay(10000, "kal"));
        KumpulanEcopay.add(new EcoPay(10000, "osl"));
        

        // Simpan data untuk setiap objek pengguna
        dataSaver.saveDataEcoPay(KumpulanEcopay, lokasiDataEcopay);

        // Load data 
        KumpulanEcopay = dataSaver.loadDataEcoPay(lokasiDataEcopay);

        if (!KumpulanEcopay.isEmpty()) {
            KumpulanEcopay.get(0).getSaldo();
        } else {
            System.out.println("Data Pengguna kosong atau tidak tersedia.");
        }

        
    }
}
