package pojo;

import java.io.Serializable;

public class TkbLop implements Serializable {
    private int STT;
    private String MaLop;
    private String MaMon;
    private String PhongHoc;

    public TkbLop() {
    }

    public TkbLop(int STT, String maMon, String maLop, String phongHoc) {
        this.STT = STT;
        MaLop = maLop;
        MaMon = maMon;
        PhongHoc = phongHoc;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
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
                "STT=" + STT +
                ", MaLop='" + MaLop + '\'' +
                ", MaMon='" + MaMon + '\'' +
                ", PhongHoc='" + PhongHoc + '\'' +
                '}';
    }
}
