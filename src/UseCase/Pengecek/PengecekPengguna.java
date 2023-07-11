package UseCase.Pengecek;

public class PengecekPengguna {
    
    private String idUser;

    public PengecekPengguna (String idUser){
        this.idUser = idUser;
    }

    public String getIdUser(){
        return this.idUser;
    }

    public void setIdUser(String newID){
        this.idUser = newID;
    }
}
