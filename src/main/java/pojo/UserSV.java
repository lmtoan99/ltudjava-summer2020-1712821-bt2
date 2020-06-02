package pojo;

public class UserSV {
    private String MSSV;
    private String Password;

    public UserSV() {
    }

    public UserSV(String MSSV, String password) {
        this.MSSV = MSSV;
        Password = password;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "UserSV{" +
                "MSSV='" + MSSV + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
