package UseCase.Barang.BarangProdusen;

public class Produk {
    
    private String namaProduk;
    private Integer hargaProduk;
    private Integer stokProduk;
    private String ProdukId;

    public Produk (String namaProduk, Integer hargaProduk, Integer stokProduk, String ProdukId){
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.stokProduk = stokProduk;
        this.ProdukId = ProdukId;
    }

    public String getNamaProduk() {
        return this.namaProduk;
    }

    public Integer getHargaProduk() {
        return this.hargaProduk;
    }

    public Integer getStokProduk() {
        return this.stokProduk;
    }

    public String getProdukId() {
        return this.ProdukId;
    }

    public void setNamaProduk(String newNamaProduk) {
        this.namaProduk = newNamaProduk;
    }

    public void setHargaProduk(Integer newHargaProduk) {
        this.hargaProduk = newHargaProduk;
    }

    public void setStokProduk(Integer newStokProduk) {
        this.stokProduk = newStokProduk;
    }
    
    public void setProdukId(String newProdukId) {
        this.ProdukId = newProdukId;
    }
    
}
