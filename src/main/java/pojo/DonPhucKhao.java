/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.io.Serializable;

/**
 *
 * @author toanm
 */
public class DonPhucKhao implements Serializable{
    private String mssv;
    private String maMon;
    private int cotDiem;
    private float diemMongMuon;
    private String lyDo;
    private int trangThai;

    public DonPhucKhao() {
    }

    public DonPhucKhao(String mssv, String maMon, int cotDiem, float diemMongMuon, String lyDo, int trangThai) {
        this.mssv = mssv;
        this.maMon = maMon;
        this.cotDiem = cotDiem;
        this.diemMongMuon = diemMongMuon;
        this.lyDo = lyDo;
        this.trangThai = trangThai;
    }


    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }

    public int getCotDiem() {
        return cotDiem;
    }

    public void setCotDiem(int cotDiem) {
        this.cotDiem = cotDiem;
    }

    public float getDiemMongMuon() {
        return diemMongMuon;
    }

    public void setDiemMongMuon(float diemMongMuon) {
        this.diemMongMuon = diemMongMuon;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
