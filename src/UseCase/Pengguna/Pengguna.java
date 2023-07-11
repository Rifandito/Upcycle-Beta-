package UseCase.Pengguna;

public class Pengguna {

    private String username, password, alamatWallet, peran, UserId;

    public Pengguna(String username, String password, String alamatWallet, String peran, String UserId) {
        this.username = username;
        this.password = password;
        this.alamatWallet = alamatWallet;
        this.peran = peran;
        this.UserId = UserId;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getAlamatWallet() {
        return this.alamatWallet;
    }

    public String getUserId() {
        return this.UserId;
    }

    public String getPeran() {
        return this.peran;
    }

    public void setUsername(String newUser) {
        this.username = newUser;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public void setPeran(String newPeran) {
        this.peran = newPeran;
    }

    public void toPtring(){
        System.out.println("login: "+this.getUsername());
        System.out.println("pass: "+this.getPassword());
    }
}