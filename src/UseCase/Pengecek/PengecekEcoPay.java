package UseCase.Pengecek;

public class PengecekEcoPay {
    
    private String alamatWallet;

    public PengecekEcoPay (String alamatWallet){
        
        this.alamatWallet = alamatWallet;
    }

    public String getalamatWallet(){
        return this.alamatWallet;
    }

    public void setalamatWallet(String newalamatWallet){
        this.alamatWallet = newalamatWallet;
    }
}
