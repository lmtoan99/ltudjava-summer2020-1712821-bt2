package pojo;

public class SinhVien {
    private String MSSV;
    private String HoTen;
    private int GioiTinh;
    private String CMND;
    private String MaLop;

    public SinhVien() {
    }

    public SinhVien(String MSSV, String hoTen, int gioiTinh, String CMND, String maLop) {
        this.MSSV = MSSV;
        HoTen = hoTen;
        GioiTinh = gioiTinh;
        this.CMND = CMND;
        MaLop = maLop;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
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

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String lop) {
        MaLop = lop;
    }

    @Override
    public String toString() {
        return MSSV + "," + HoTen + ','+ GioiTinh +
                "," + CMND + ',' + MaLop;
    }
}
