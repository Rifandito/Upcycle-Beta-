package UseCase.Pengecek;

public class PengecekProduk {
    
    private String idProduk;

    public PengecekProduk (String idProduk){
        this.idProduk = idProduk;
    }

    public String getidProduk(){
        return this.idProduk;
    }

    public void setidProduk(String newidProduk){
        this.idProduk = newidProduk;
    }
}
