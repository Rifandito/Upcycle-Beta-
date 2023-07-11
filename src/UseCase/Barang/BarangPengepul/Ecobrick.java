package UseCase.Barang.BarangPengepul;

public class Ecobrick {
    
    private String jenisEcobrick;
    private Integer hargaEcobrick;
    private Integer stokEcobrick;

    public Ecobrick (String jenisEcobrick, Integer hargaEcobrick, Integer stokEcobrick){
        this.jenisEcobrick = jenisEcobrick;
        this.hargaEcobrick = hargaEcobrick;
        this.stokEcobrick = stokEcobrick;
    }

    public String getjenisEcobrick() {
        return this.jenisEcobrick;
    }

    public Integer getHargaEcobrick() {
        return this.hargaEcobrick;
    }

    public Integer getStokEcobrick() {
        return this.stokEcobrick;
    }

    public void setjenisEcobrick(String newjenisEcobrick) {
        this.jenisEcobrick = newjenisEcobrick;
    }

    public void setHargaEcobrick(Integer newHargaEcobrick) {
        this.hargaEcobrick = newHargaEcobrick;
    }

    public void setStokEcobrick(Integer newStokEcobrick) {
        this.stokEcobrick = newStokEcobrick;
    }
}
