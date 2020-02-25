/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;




public class DonHang {
    private String maDonHang;
    private String tenKhachHang;
    private String danhSachTenSanPham;
    private String danhSachMaSanPham;
    private BigDecimal tonSoLuong;
    private BigDecimal tongTien;
    private String ngayMua;
    private String diaChi;
    private BigDecimal soDienToai;
    private String eMail;
    private String tinhTrangDonhang;

    public DonHang(String maDonHang, String tenKhachHang, String danhSachTenSanPham, String danhSachMaSanPham, BigDecimal tonSoLuong, BigDecimal tongTien, String ngayMua, String diaChi, BigDecimal soDienToai, String eMail, String tinhTrangDonhang) {
        this.maDonHang = maDonHang;
        this.tenKhachHang = tenKhachHang;
        this.danhSachTenSanPham = danhSachTenSanPham;
        this.danhSachMaSanPham = danhSachMaSanPham;
        this.tonSoLuong = tonSoLuong;
        this.tongTien = tongTien;
        this.ngayMua = ngayMua;
        this.diaChi = diaChi;
        this.soDienToai = soDienToai;
        this.eMail = eMail;
        this.tinhTrangDonhang = tinhTrangDonhang;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDanhSachTenSanPham() {
        return danhSachTenSanPham;
    }

    public void setDanhSachTenSanPham(String danhSachTenSanPham) {
        this.danhSachTenSanPham = danhSachTenSanPham;
    }

    public String getDanhSachMaSanPham() {
        return danhSachMaSanPham;
    }

    public void setDanhSachMaSanPham(String danhSachMaSanPham) {
        this.danhSachMaSanPham = danhSachMaSanPham;
    }

    public BigDecimal getTonSoLuong() {
        return tonSoLuong;
    }

    public void setTonSoLuong(BigDecimal tonSoLuong) {
        this.tonSoLuong = tonSoLuong;
    }

    public BigDecimal getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public BigDecimal getSoDienToai() {
        return soDienToai;
    }

    public void setSoDienToai(BigDecimal soDienToai) {
        this.soDienToai = soDienToai;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getTinhTrangDonhang() {
        return tinhTrangDonhang;
    }

    public void setTinhTrangDonhang(String tinhTrangDonhang) {
        this.tinhTrangDonhang = tinhTrangDonhang;
    }

    @Override
    public String toString() {
        return "DonHang{" + "maDonHang=" + maDonHang + ", tenKhachHang=" + tenKhachHang + ", danhSachTenSanPham=" + danhSachTenSanPham + ", danhSachMaSanPham=" + danhSachMaSanPham + ", tonSoLuong=" + tonSoLuong + ", tongTien=" + tongTien + ", ngayMua=" + ngayMua + ", diaChi=" + diaChi + ", soDienToai=" + soDienToai + ", eMail=" + eMail + ", tinhTrangDonhang=" + tinhTrangDonhang + '}';
    }
    
    
    
    
    
}
