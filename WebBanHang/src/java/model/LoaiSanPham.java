/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class LoaiSanPham {
    private String maLoai;
    private String tenLoai;
    private String maNhaCungCap;
    private String moTa;

    public LoaiSanPham(String maLoai, String tenLoai, String maNhaCungCap, String moTa) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.maNhaCungCap = maNhaCungCap;
        this.moTa = moTa;
    }
    public LoaiSanPham(){
        
    }
    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" + "maLoai=" + maLoai + ", tenLoai=" + tenLoai + ", maNhaCungCap=" + maNhaCungCap + ", moTa=" + moTa + '}';
    }
    
    
}
