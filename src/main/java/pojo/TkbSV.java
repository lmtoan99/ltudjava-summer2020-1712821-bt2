package pojo;

import java.io.Serializable;

public class TkbSV implements Serializable {
    private String MSSV;
    private String MaMon;
    private String MaLop;
    private float DiemGK;
    private float DiemCK;
    private float DiemKhac;
    private float DiemTong;

    public TkbSV() {
        this.DiemCK = 0;
        this.DiemGK = 0;
        this.DiemKhac = 0;
        this.DiemTong = 0;
    }

    public TkbSV(String MSSV, String maLop, String maMon, float diemGK, float diemCK, float diemKhac, float diemTong) {
        this.MSSV = MSSV;
        MaMon = maMon;
        MaLop = maLop;
        DiemGK = diemGK;
        DiemCK = diemCK;
        DiemKhac = diemKhac;
        DiemTong = diemTong;
    }

    public TkbSV(String MSSV, String MaMon, String MaLop) {
        this.MSSV = MSSV;
        this.MaMon = MaMon;
        this.MaLop = MaLop;
        this.DiemCK = 0;
        this.DiemGK = 0;
        this.DiemKhac = 0;
        this.DiemTong = 0;
    }

    
    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String maMon) {
        MaMon = maMon;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String maLop) {
        MaLop = maLop;
    }

    public float getDiemGK() {
        return DiemGK;
    }

    public void setDiemGK(float diemGK) {
        DiemGK = diemGK;
    }

    public float getDiemCK() {
        return DiemCK;
    }

    public void setDiemCK(float diemCK) {
        DiemCK = diemCK;
    }

    public float getDiemKhac() {
        return DiemKhac;
    }

    public void setDiemKhac(float diemKhac) {
        DiemKhac = diemKhac;
    }

    public float getDiemTong() {
        return DiemTong;
    }

    public void setDiemTong(float diemTong) {
        DiemTong = diemTong;
    }

    @Override
    public String toString() {
        return "TkbSV{" +
                "MSSV='" + MSSV + '\'' +
                ", MaMon='" + MaMon + '\'' +
                ", MaLop='" + MaLop + '\'' +
                '}';
    }
}
