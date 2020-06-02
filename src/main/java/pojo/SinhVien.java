package pojo;

public class SinhVien {
    private int STT;
    private String MSSV;
    private String HoTen;
    private int GioiTinh;
    private String CMND;
    private String Lop;

    public SinhVien() {
    }

    public SinhVien(int STT, String MSSV, String hoTen, int gioiTinh, String CMND, String lop) {
        this.MSSV = MSSV;
        this.STT = STT;
        HoTen = hoTen;
        GioiTinh = gioiTinh;
        this.CMND = CMND;
        Lop = lop;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String lop) {
        Lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "MSSV='" + MSSV + '\'' +
                ", STT=" + STT +
                ", HoTen='" + HoTen + '\'' +
                ", GioiTinh=" + GioiTinh +
                ", CMND='" + CMND + '\'' +
                ", Lop='" + Lop + '\'' +
                '}';
    }
}
