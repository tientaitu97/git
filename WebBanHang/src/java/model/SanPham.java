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
public class SanPham {
    private String maSanPham;
    private String ten;
    private BigDecimal giaDaGiam;
    private BigDecimal giaBan;
    private BigDecimal soLuong;
    private String nhaCungCap;
    private String maLoai;
    private String hinhAnh;
    private BigDecimal soLuongNhap;
    private BigDecimal soLuongBan;

    public SanPham(String maSanPham, String ten, BigDecimal giaDaGiam, BigDecimal giaBan, BigDecimal soLuong, String nhaCungCap, String maLoai, String hinhAnh, BigDecimal soLuongNhap, BigDecimal soLuongBan) {
        this.maSanPham = maSanPham;
        this.ten = ten;
        this.giaDaGiam = giaDaGiam;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaCungCap = nhaCungCap;
        this.maLoai = maLoai;
        this.hinhAnh = hinhAnh;
        this.soLuongNhap = soLuongNhap;
        this.soLuongBan = soLuongBan;
    }

    public SanPham() {
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public BigDecimal getGiaDaGiam() {
        return giaDaGiam;
    }

    public void setGiaDaGiam(BigDecimal giaDaGiam) {
        this.giaDaGiam = giaDaGiam;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    public BigDecimal getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(BigDecimal soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public BigDecimal getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(BigDecimal soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public BigDecimal getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(BigDecimal soLuongBan) {
        this.soLuongBan = soLuongBan;
    }
    
    
}
