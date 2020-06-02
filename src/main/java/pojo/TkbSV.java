package pojo;

import java.io.Serializable;

public class TkbSV implements Serializable {
    private int STT;
    private String MSSV;
    private String MaMon;
    private String MaLop;
    private float DiemGK;
    private float DiemCK;
    private float DiemKhac;
    private float DiemTong;

    public TkbSV() {
    }

    public TkbSV(int STT, String MSSV, String maLop, String maMon, float diemGK, float diemCK, float diemKhac, float diemTong) {
        this.STT = STT;
        this.MSSV = MSSV;
        MaMon = maMon;
        MaLop = maLop;
        DiemGK = diemGK;
        DiemCK = diemCK;
        DiemKhac = diemKhac;
        DiemTong = diemTong;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
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
                "STT=" + STT +
                ", MSSV='" + MSSV + '\'' +
                ", MaMon='" + MaMon + '\'' +
                ", MaLop='" + MaLop + '\'' +
                '}';
    }
}
