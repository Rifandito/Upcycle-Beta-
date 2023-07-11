package UseCase.Pengguna;

import java.io.FileNotFoundException;

import java.util.ArrayList;

import Pages.DataSaver;
import UseCase.Pengguna.Peran.Penyetor;
import UseCase.Pengguna.Peran.Pengepul;
import UseCase.Pengguna.Peran.Produsen;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {

         
        DataSaver dataSaver = new DataSaver();

        String lokasiDataAkun = "src\\Data\\DataAkun\\dataAkun.xml";

        ArrayList<Pengguna> KumpulanPengguna = new ArrayList<>();

        KumpulanPengguna.add(new Pengguna("Rambo", "1", "abc", "Pengguna Umum", "1"));
        KumpulanPengguna.add(new Penyetor("Ucup", "1", "bac", "Penyetor", "2", 0));
        KumpulanPengguna.add(new Pengepul("Doni", "1", "kal", "Pengepul", "3", "Lokakarya", "Semarang"));
        KumpulanPengguna.add(new Produsen("Iding", "1", "osl", "Produsen", "4", "Toko Kita", "Jakarta"));
        

        // Simpan data untuk setiap objek pengguna
        dataSaver.saveDataPengguna(KumpulanPengguna, lokasiDataAkun);

        // Load data 
        KumpulanPengguna = dataSaver.loadDataPengguna(lokasiDataAkun);

        if (!KumpulanPengguna.isEmpty()) {
            KumpulanPengguna.get(0).getUsername();
        } else {
            System.out.println("Data Pengguna kosong atau tidak tersedia.");
        }
        
    }
}