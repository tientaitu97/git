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
public class TaiKhoan {
    private String tenTaiKhoan;
    private String matKhau;
    private String tenKhachHang;
    private String gioiTinh;
    private BigDecimal soDienThoai;
    private String eMail;
    private String ngaySinh;
    private String diaChi;
    private BigDecimal soLuotMua;
    private String Role;

    public TaiKhoan(String tenTaiKhoan, String matKhau, String tenKachHang, String gioiTinh, BigDecimal soDienThoai, String eMail, String ngaySinh, String diaChi, BigDecimal soLuotMua, String Role) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.tenKhachHang = tenKachHang;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.eMail = eMail;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soLuotMua = soLuotMua;
        this.Role = Role;
    }
public TaiKhoan(String tenTaiKhoan, String matKhau, String tenKachHang, String gioiTinh, String eMail, String ngaySinh, String diaChi, String Role) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.tenKhachHang = tenKachHang;
        this.gioiTinh = gioiTinh;
        
        this.eMail = eMail;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        
        this.Role = Role;
    }
    public TaiKhoan() {
        
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTenKachHang() {
        return tenKhachHang;
    }

    public void setTenKachHang(String tenKachHang) {
        this.tenKhachHang = tenKachHang;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public BigDecimal getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(BigDecimal soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public BigDecimal getSoLuotMua() {
        return soLuotMua;
    }

    public void setSoLuotMua(BigDecimal soLuotMua) {
        this.soLuotMua = soLuotMua;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }
    
    @Override
    public String toString(){
        return " [tenTaiKhoan : "+tenTaiKhoan+", matkhau: "+matKhau+", tenKhachHang: "+tenKhachHang+", gioiTinh: "+gioiTinh+", SoDienThoai:"
                + ""+soDienThoai+ ", EMail: "+eMail+", NGaySinh: "+ngaySinh+", DiaChi: "+diaChi+", SoLuotMua: "+soLuotMua+", Role: "+Role;
    }
    
}
