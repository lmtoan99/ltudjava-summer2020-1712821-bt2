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
public class DotPhucKhao implements Serializable{
    private long ngayBatDau;
    private long ngayKetThuc;

    public DotPhucKhao() {
    }

    public DotPhucKhao(long ngayBatDau, long ngayKetThuc) {
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public long getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(long ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public long getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(long ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
    
    
}
