package UseCase.Transaksi;

public class Transaksi {
    
    private Integer noTransaksi;
    private String judulTransaksi;
    private String alatTukar;
    private String Status;
    private String idTransaksi;

    public Transaksi(Integer noTransaksi, String judulTransaksi, String alatTukar, String Status, String idTransaksi){
        this.noTransaksi = noTransaksi;
        this.judulTransaksi = judulTransaksi;
        this.alatTukar = alatTukar;
        this.Status = Status;
        this.idTransaksi = idTransaksi;
    }

    public Integer getnoTransaksi(){
        return this.noTransaksi;
    }

    public String getjudulTransaksi(){
        return this.judulTransaksi;
    }

    public String getalatTukar(){
        return this.alatTukar;
    }

    public String getStatus(){
        return this.Status;
    }

    public String getidTransaksi(){
        return this.idTransaksi;
    }

    public void setnoTransaksi(Integer newNomer){
        this.noTransaksi = newNomer;
    }

    public void setjudulTransaksi(String newJudul){
        this.judulTransaksi = newJudul;
    }

    public void setalatTukar(String newalatTukar){
        this.alatTukar = newalatTukar;
    }

    public void setStatus(String newStatus){
        this.Status = newStatus;
    }

    public void setidTransaksi(String newidTransaksi){
        this.idTransaksi = newidTransaksi;
    }

}