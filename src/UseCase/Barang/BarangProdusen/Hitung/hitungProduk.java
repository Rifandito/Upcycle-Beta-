package UseCase.Barang.BarangProdusen.Hitung;

public class hitungProduk {
    
    Integer hasil;

    public hitungProduk(){
    }

    public Integer kurang(Integer Stok, Integer dibeli){
        return hasil = Stok - dibeli; 
    }

    public Integer tambah(Integer Stok, Integer penambah){
        return hasil = Stok + penambah; 
    }
}
