/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author toanm
 */
public class LopMon {
    String maLop;
    String maMon;

    public LopMon() {
    }

    public LopMon(String maLop, String maMon) {
        this.maLop = maLop;
        this.maMon = maMon;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getMaMon() {
        return maMon;
    }

    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }
    
    
}
