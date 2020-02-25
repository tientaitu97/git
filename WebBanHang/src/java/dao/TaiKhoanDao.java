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
import model.TaiKhoan;

/**
 *
 * @author admin
 */
public class TaiKhoanDao implements ObjectDao{
     public TaiKhoanDao(){
        
    }
    public static Map<String, TaiKhoan> mapTaiKhoan = loadData();

    private static Map<String, TaiKhoan> loadData() {
        Map<String, TaiKhoan> mapTemp = new HashMap<>();
        try{
            ResultSet rs = new ConnectToDatabase().selectData("select * from TaiKhoan");
            while (rs.next()){
                String tenTaiKhoan = rs.getString("TENTAIKHOAN");
                String matKhau = rs.getString("MATKHAU");
                String tenKhachHang = rs.getString("TENKHACHHANG");
                String gioiTinh = rs.getString("GIOITINH");
                BigDecimal soDienThoai = rs.getBigDecimal("SODIENTHOAI");
                String eMail = rs.getString("EMAIL");
                String ngaySinh = rs.getString("NGAYSINH");
                String diaChi = rs.getString("DIACHI");
                BigDecimal soLuotMua = rs.getBigDecimal("SOLUOTMUA");
                String Role = rs.getString("ROLE");
                TaiKhoan tk = new TaiKhoan(tenTaiKhoan, matKhau, tenKhachHang, gioiTinh, soDienThoai,eMail, ngaySinh, diaChi, soLuotMua, Role );
                mapTemp.put(tk.getTenTaiKhoan(), tk);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return mapTemp;
    }
    public boolean checkLogin(String username, String passWord){
        TaiKhoan tk = mapTaiKhoan.get(username);
        if(tk != null){
            if(tk.getMatKhau().equals(passWord)){
                return true;
            } else {
                return false;
            }
        } else{
        
        return false;
    }
    }

    @Override
    public boolean add(Object obj) {
        TaiKhoan tk = (TaiKhoan) obj;
        mapTaiKhoan.put(tk.getTenTaiKhoan(), tk);
        String sql = "insert into TaiKhoan(tentaikhoan, matkhau, tenkhachhang, gioi tinh, sodienthoai, email, ngaysinh, diachi, soluotmua, role) values (?,?,?,?,?,?,?,?,?,?)";
        Connection connect = ConnectToDatabase.getConnect();
         try {
             PreparedStatement ppstm = connect.prepareStatement(sql);
             ppstm.setString(1,tk.getTenTaiKhoan());
             ppstm.setString(2, tk.getMatKhau());
             ppstm.setString(3, tk.getTenKachHang());
             ppstm.setString(4, tk.getGioiTinh());
             ppstm.setBigDecimal(5, tk.getSoDienThoai());
             ppstm.setString(6, tk.geteMail());
             ppstm.setString(7, tk.getNgaySinh());
             ppstm.setString(8,tk.getDiaChi());
             ppstm.setBigDecimal(9, tk.getSoLuotMua());
             ppstm.setString(10, tk.getRole());
             return true;
         } catch (SQLException ex) {
             System.out.println("err when add customer: "+ex.getMessage());
         }
        return false;
    }

    @Override
    public boolean del(String id) {
        mapTaiKhoan.remove(id);
         try {
             new ConnectToDatabase().excuteSql("delete from TaiKhoan where tentaikhoan = '"+id+"'");
             return true;
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
        return false;
    }

    @Override
    public boolean edit(String id, Object obj) {
        TaiKhoan tk = (TaiKhoan) obj;
        mapTaiKhoan.replace(id, tk);
        String sql = "update TaiKhoan set tentaikhoan = ?, matkhau = ?, tenkhachhang = ?, gioitinh =?,sodienthoai = ?, email = ?, ngaysinh = ?, diachi = ?, soLuotMua = ?, role = ? where tentaikhoan ='"+id+"'";
        Connection connect = ConnectToDatabase.getConnect();
        try {
             PreparedStatement ppstm = connect.prepareStatement(sql);
             ppstm.setString(1,id);
             ppstm.setString(2, tk.getMatKhau());
             ppstm.setString(3, tk.getTenKachHang());
             ppstm.setString(4, tk.getGioiTinh());
             ppstm.setBigDecimal(5, tk.getSoDienThoai());
             ppstm.setString(6, tk.geteMail());
             ppstm.setString(7, tk.getNgaySinh());
             ppstm.setString(8,tk.getDiaChi());
             ppstm.setBigDecimal(9, tk.getSoLuotMua());
             ppstm.setString(10,tk.getRole());
             return true;
         } catch (SQLException ex) {
             System.out.println("err when add customer: "+ex.getMessage());
         }
        
        return false;
    }
    public boolean changPass(String userName, String newPass){
        TaiKhoan tk = mapTaiKhoan.get(userName);
        if(tk != null){
            tk.setMatKhau(newPass);
            mapTaiKhoan.replace(tk.getTenTaiKhoan(), tk);
            edit(tk.getTenTaiKhoan(), tk);
            return true;
        } else {
            return false;
            
       
    }
    }
    
    
    
    public static void main(String[] args) {
        TaiKhoanDao tkDao = new TaiKhoanDao();
        System.out.println(tkDao.mapTaiKhoan);
        tkDao.del("undefined");
        System.out.println(tkDao.checkLogin("nguyentanhau", "1234567"));
        System.out.println(tkDao.checkLogin("hiendi", "hiendi11"));
        System.out.println(tkDao.checkLogin("anhdinh", "anhdinh1"));

    }
    
}
