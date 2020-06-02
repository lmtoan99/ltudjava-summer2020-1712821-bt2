package pojo;

public class MonHoc {
    private String MaMon;
    private String TenMon;

    public MonHoc() {
    }

    public MonHoc(String maMon, String tenMon) {
        MaMon = maMon;
        TenMon = tenMon;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String maMon) {
        MaMon = maMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String tenMon) {
        TenMon = tenMon;
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "MaMon='" + MaMon + '\'' +
                ", TenMon='" + TenMon + '\'' +
                '}';
    }
}
