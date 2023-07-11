package UseCase.PoinEcoPay;

public class EcoPay {
    
    private Integer Saldo;
    private String alamatWallet;

    public EcoPay(Integer saldo, String alamatWallet){
        this.Saldo = saldo;
        this.alamatWallet = alamatWallet;
    }

    public Integer getSaldo(){
        return this.Saldo;
    }

    public String getAlamatWallet(){
        return this.alamatWallet;
    }

    public void setSaldo(Integer newSaldo){
        this.Saldo = newSaldo;
    }

    public void setAlamatWallet(String newAlamat){
        this.alamatWallet = newAlamat;
    }
}
