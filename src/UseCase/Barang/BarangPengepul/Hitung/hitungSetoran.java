package UseCase.Barang.BarangPengepul.Hitung;

public class hitungSetoran {
    
    Integer hasil;

    public hitungSetoran(){
    }

    public Integer kurang(Integer saldo, Integer harga){
        return hasil = saldo - harga; 
    }

    public Integer tambah(Integer saldo, Integer penambah){
        return hasil = saldo + penambah; 
    }
}
