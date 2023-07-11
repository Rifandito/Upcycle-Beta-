package UseCase.Pengguna.Peran;

import UseCase.Pengguna.Pengguna;

public class Produsen extends Pengguna{

    private String NamaToko;
    private String Lokasi;

    public Produsen(String username, String password, String alamatWallet, String peran, String UserId, String namaToko, String lokasi) {
        super(username, password, alamatWallet, peran, UserId);
        this.NamaToko = namaToko;
        this.Lokasi = lokasi;
    }
    
    public String getNamaToko(){
        return this.NamaToko;
    }

    public void setNamaToko(String newNama) {
        this.NamaToko = newNama;
    }

    public String getLokasi(){
        return this.Lokasi;
    }

    public void setLokasi(String newLokasi) {
        this.Lokasi = newLokasi;
    }
}