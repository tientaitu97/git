/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import model.ConnectToDatabase;
import model.DonHang;



/**
 *
 * @author admin
 */
public class DonHangDAO implements ObjectDao{
    public static Map<String, DonHang> mapDonHang = loadData();
    public DonHangDAO(){
        
    }

    private static Map<String, DonHang> loadData() {
        Map<String, DonHang> mapTemp = new HashMap<>();
        try{
            ResultSet rs = new ConnectToDatabase().selectData("select * from DonHang");
            while (rs.next()){
                String maDonHang = rs.getString("MADONHANG");
                String tenKhachHang = rs.getString("TENKHACHANG");
                String danhSachSanPham = rs.getString("DANHSACHMASANPHAM");
                String danhSachTenSanPham = rs.getString("DANHSACHTENSANPHAM");
                BigDecimal tongSoLuong = rs.getBigDecimal("TONGSOLUONG");
                BigDecimal tongTien = rs.getBigDecimal("TONGTIEN");
                String ngayMua = rs.getString("NGAYMUA");
                String diaChi = rs.getString("DIACHI");
                BigDecimal soDienThoai = rs.getBigDecimal("SODIENTHOAI");
                String eMail = rs.getString("EMAIL");
                String tinhTrangDonHang = rs.getString("TINHTRANGDONHANG");
                DonHang dh = new DonHang( maDonHang, tenKhachHang, danhSachSanPham, danhSachTenSanPham,tongSoLuong,tongTien, ngayMua,diaChi,soDienThoai,eMail,tinhTrangDonHang );
                mapTemp.put(dh.getMaDonHang(), dh);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return mapTemp;
    }

    @Override
    public boolean add(Object obj) {
       DonHang dh = (DonHang) obj;
        mapDonHang.put(dh.getMaDonHang(), dh);
        String sql = "insert into DonHang(madonhang,tenkhachhang, danhsachmasanpham, danhsachtensanpham, tongsoluong, tongtien, ngaymua, diachi, sodienthoai, email, tinhtrangdonhang) values (?,?,?,?,?,?,?,?,?,?,?)";
        Connection connect = ConnectToDatabase.getConnect();
         try {
             PreparedStatement ppstm = connect.prepareStatement(sql);
             ppstm.setString(1,dh.getMaDonHang());
             ppstm.setString(2, dh.getTenKhachHang());
             ppstm.setString(3, dh.getDanhSachMaSanPham());
             ppstm.setString(4, dh.getDanhSachTenSanPham());
             ppstm.setBigDecimal(5, dh.getTonSoLuong());
             ppstm.setBigDecimal(6, dh.getTongTien());
             ppstm.setString(7, dh.getNgayMua());
             ppstm.setString(8,dh.getDiaChi());
             ppstm.setBigDecimal(9, dh.getSoDienToai());
             ppstm.setString(10, dh.geteMail());
             ppstm.setString(11, dh.getTinhTrangDonhang());
             return true;
         } catch (SQLException ex) {
             System.out.println("err when add customer: "+ex.getMessage());
         }
        return false;
    }

    @Override
    public boolean del(String id) {
         mapDonHang.remove(id);
         try {
             new ConnectToDatabase().excuteSql("delete from DonHang where maDonHang = '"+id+"'");
             return true;
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
        return false;
    }

    @Override
    public boolean edit(String id, Object obj) {
        DonHang dh = (DonHang) obj;
        mapDonHang.replace(id, dh);
        String sql = "update TaiKhoan set madonhang = ?, tenkhachhang = ?, danhsachmasanpham = ?, danhsachtensanpham =?,"
                + " tongsoluong = ?, ngaymua = ?, diachi = ?, sodienthoai = ?, email = ?, tinhtrangdonhang = ? where madonhang ='"+id+"'";
        Connection connect = ConnectToDatabase.getConnect();
          try {
             PreparedStatement ppstm = connect.prepareStatement(sql);
             ppstm.setString(1,id);
             ppstm.setString(2, dh.getTenKhachHang());
             ppstm.setString(3, dh.getDanhSachMaSanPham());
             ppstm.setString(4, dh.getDanhSachTenSanPham());
             ppstm.setBigDecimal(5, dh.getTonSoLuong());
             ppstm.setBigDecimal(6, dh.getTongTien());
             ppstm.setString(7, dh.getNgayMua());
             ppstm.setString(8,dh.getDiaChi());
             ppstm.setBigDecimal(9, dh.getSoDienToai());
             ppstm.setString(10, dh.geteMail());
             ppstm.setString(11, dh.getTinhTrangDonhang());
             return true;
         } catch (SQLException ex) {
             System.out.println("err when edit customer: "+ex.getMessage());
         }
        return false;
    }
    
    
    
}
