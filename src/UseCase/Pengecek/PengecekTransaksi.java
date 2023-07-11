package UseCase.Pengecek;

public class PengecekTransaksi {
    
    private String idTransaksi;

    public PengecekTransaksi (String idTransaksi){
        this.idTransaksi = idTransaksi;
    }

    public String getidTransaksi(){
        return this.idTransaksi;
    }

    public void setidTransaksi(String newidTransaksi){
        this.idTransaksi = newidTransaksi;
    }
}
