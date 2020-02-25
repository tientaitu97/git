/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author admin
 */
public class NhaCungCap {
    private String maNhaCungCap;
    private String tenNhaCungCap;
    private String diaChi;
    private BigDecimal soDienThoai;
    private String loGo;

    public NhaCungCap(String maNhaCungCap, String tenNhaCungCap, String diaChi, BigDecimal soDienThoai, String loGo) {
        this.maNhaCungCap = maNhaCungCap;
        this.tenNhaCungCap = tenNhaCungCap;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.loGo = loGo;
    }
    public NhaCungCap(){
        
    }
    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public BigDecimal getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(BigDecimal soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getLoGo() {
        return loGo;
    }

    public void setLoGo(String loGo) {
        this.loGo = loGo;
    }
    
    
}
