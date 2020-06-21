package pojo;

import java.io.Serializable;

public class TkbLop implements Serializable {
    private String MaLop;
    private String MaMon;
    private String PhongHoc;

    public TkbLop() {
    }

    public TkbLop(String MaLop, String MaMon) {
        this.MaLop = MaLop;
        this.MaMon = MaMon;
    }

    public TkbLop(String maMon, String maLop, String phongHoc) {
        MaLop = maLop;
        MaMon = maMon;
        PhongHoc = phongHoc;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String maLop) {
        MaLop = maLop;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String maMon) {
        MaMon = maMon;
    }

    public String getPhongHoc() {
        return PhongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        PhongHoc = phongHoc;
    }

    @Override
    public String toString() {
        return "TkbLop{" +
                "MaLop='" + MaLop + '\'' +
                ", MaMon='" + MaMon + '\'' +
                ", PhongHoc='" + PhongHoc + '\'' +
                '}';
    }
}
