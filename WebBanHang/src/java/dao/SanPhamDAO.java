/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.TaiKhoanDao.mapTaiKhoan;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import model.ConnectToDatabase;

import model.SanPham;
import model.TaiKhoan;

/**
 *
 * @author admin
 */
public class SanPhamDAO implements ObjectDao{

   
    public SanPhamDAO(){
        
    }
    public static Map<String, SanPham> mapSanPham = loadData();
     private static Map<String, SanPham> loadData() {
        Map<String, SanPham> mapTemp = new HashMap<>();
        try{
            ResultSet rs = new ConnectToDatabase().selectData("select * from SanPham");
            while (rs.next()){
                String maSanPham = rs.getString("maSanPham");
                String ten = rs.getString("ten");
                BigDecimal giaDaGiam = rs.getBigDecimal("giaDaGiam");
                BigDecimal giaBan = rs.getBigDecimal("giaBan");
                BigDecimal soLuong = rs.getBigDecimal("soLuong");
                String nhaCungCap = rs.getString("nhaCungCap");
                String maLoai = rs.getString("maLoai");
                String hinhAnh = rs.getString("hinhAnh");
                BigDecimal soLuongNhap = rs.getBigDecimal("soLuongNhap");
                BigDecimal soLuongBan = rs.getBigDecimal("soLuongBan");
               SanPham sp = new SanPham(maSanPham, ten, giaDaGiam, giaBan, soLuong,nhaCungCap, maLoai, hinhAnh, soLuongNhap, soLuongBan );
                mapTemp.put(sp.getMaSanPham(), sp);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return mapTemp;
    }

    @Override
    public boolean add(Object obj) {
        SanPham sp = (SanPham) obj;
        mapSanPham.put(sp.getMaSanPham(), sp);
        String sql = "insert into SanPham(maSanPham, ten, giadagiam, giaban, soluong, nhacungcap, maloai, hinhanh, soluongnhap, soluongban) values (?,?,?,?,?,?,?,?,?,?)";
        Connection connect = ConnectToDatabase.getConnect();
         try {
             PreparedStatement ppstm = connect.prepareStatement(sql);
             ppstm.setString(1,sp.getMaSanPham());
             ppstm.setString(2, sp.getTen());
             ppstm.setBigDecimal(3, sp.getGiaDaGiam());
             ppstm.setBigDecimal(4, sp.getGiaBan());
             ppstm.setBigDecimal(5, sp.getSoLuong());
             ppstm.setString(6, sp.getNhaCungCap());
             ppstm.setString(7, sp.getMaLoai());
             ppstm.setString(8,sp.getHinhAnh());
             ppstm.setBigDecimal(9, sp.getSoLuongNhap());
             ppstm.setBigDecimal(10, sp.getSoLuongBan());
             return true;
         } catch (SQLException ex) {
             System.out.println("err when add customer: "+ex.getMessage());
         }
        return false;
    }

    @Override
    public boolean del(String id) {
        mapSanPham.remove(id);
         try {
             new ConnectToDatabase().excuteSql("delete from SanPham where maSanPham = '"+id+"'");
             return true;
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
        return false;
    }

    @Override
    public boolean edit(String id, Object obj) {
        SanPham sp = (SanPham) obj;
        mapSanPham.replace(id, sp);
        String sql = "update SanPham set maSanPham = ?, ten = ?, giaDaGiam = ?, giaBan =?,soLuong = ?, nhaCungCap = ?, maLoai = ?, hinhAnh = ?, soLuongNhap = ?, soLuongBan = ? where maSanPham ='"+id+"'";
        Connection connect = ConnectToDatabase.getConnect();
         try {
             PreparedStatement ppstm = connect.prepareStatement(sql);
             ppstm.setString(1,id);
             ppstm.setString(2, sp.getTen());
             ppstm.setBigDecimal(3, sp.getGiaDaGiam());
             ppstm.setBigDecimal(4, sp.getGiaBan());
             ppstm.setBigDecimal(5, sp.getSoLuong());
             ppstm.setString(6, sp.getNhaCungCap());
             ppstm.setString(7, sp.getMaLoai());
             ppstm.setString(8,sp.getHinhAnh());
             ppstm.setBigDecimal(9, sp.getSoLuongNhap());
             ppstm.setBigDecimal(10, sp.getSoLuongBan());
             return true;
         } catch (SQLException ex) {
             System.out.println("err when edit customer: "+ex.getMessage());
         }
        return false;
    }
    
    
}
