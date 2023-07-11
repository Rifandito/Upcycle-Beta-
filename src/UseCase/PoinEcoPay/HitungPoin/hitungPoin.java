package UseCase.PoinEcoPay.HitungPoin;

public class hitungPoin {
    
    Integer hasil;

    public hitungPoin(){
    }

    public Integer kurang(Integer saldo, Integer harga){
        return hasil = saldo - harga; 
    }

    public Integer tambah(Integer saldo, Integer penambah){
        return hasil = saldo + penambah; 
    }
    // public static void main(String[] args) {
    //     int a = 10;
    //     int b = 2;
    //     int sil;
    //     hitungPoin hitung = new hitungPoin();

    //     sil = hitung.kurang(a, b);

    //     System.out.println(sil);
    // }
}
