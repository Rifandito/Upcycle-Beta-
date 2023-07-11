package UseCase.Pengguna.Peran;

import UseCase.Pengguna.Pengguna;

public class Penyetor extends Pengguna{

    private Integer JumlahSetoran;

    public Penyetor(String username, String password, String alamatWallet, String peran, String UserId, Integer jumlahSetoran) {
        super(username, password, alamatWallet, peran, UserId);
        this.JumlahSetoran = jumlahSetoran;
    }
    
    public Integer getJumlahSetoran(){
        return this.JumlahSetoran;
    }

    public void setJumlahSetoran(Integer newSetoran) {
        this.JumlahSetoran = newSetoran;
    }
}