package controler.entityObject;

public class User {
    private String idUser;
    private String passWord;
    private String fullName;

    
    
    public User() {
    }
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getIdUser() {
        return idUser;
    }
    public String getPassWord() {
        return passWord;
    }
    public String getFullName() {
        return fullName;
    }
}
