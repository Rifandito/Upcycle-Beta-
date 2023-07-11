package UseCase.Pengguna.Peran;

import UseCase.Pengguna.Pengguna;

public class Pengepul extends Pengguna{

    private String NamaPengepulan;
    private String Lokasi;

    public Pengepul(String username, String password, String alamatWallet, String peran, String UserId, String namaPengepulan, String lokasi) {
        super(username, password, alamatWallet, peran, UserId);
        this.NamaPengepulan = namaPengepulan;
        this.Lokasi = lokasi;
    }
    
    public String getNamaPengepulan(){
        return this.NamaPengepulan;
    }

    public void setNamaPengepulan(String newNamaPengepulan) {
        this.NamaPengepulan = newNamaPengepulan;
    }

    public String getLokasi(){
        return this.Lokasi;
    }

    public void setLokasi(String newLokasi) {
        this.Lokasi = newLokasi;
    }

}