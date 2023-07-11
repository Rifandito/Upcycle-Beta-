package UseCase.Barang.BarangProdusen.Hitung;

public class hitungHargaProduk {
    
    Integer hasil;

    public hitungHargaProduk(){
    }

    public Integer kurang(Integer saldo, Integer harga){
        return hasil = saldo - harga; 
    }

    public Integer tambah(Integer saldo, Integer penambah){
        return hasil = saldo + penambah; 
    }
}
