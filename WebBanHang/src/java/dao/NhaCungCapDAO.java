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
import model.NhaCungCap;


/**
 *
 * @author admin
 */
public class NhaCungCapDAO implements ObjectDao{
     public NhaCungCapDAO(){
        
    }
 public static Map<String, NhaCungCap> mapNhaCungCap= loadData();
    private static Map<String, NhaCungCap> loadData() {
        Map<String, NhaCungCap> mapTemp = new HashMap<>();
        try{
            ResultSet rs = new ConnectToDatabase().selectData("select * from NhaCungCap");
            while (rs.next()){
                String maNhaCungCap = rs.getString("MANHACUNGCAP");
                String tenNhaCungCap = rs.getString("tenNhaCungCap");
                String diaChi = rs.getString("diaChi");
                BigDecimal soDienThoai = rs.getBigDecimal("SODIENTHOAI");
                String loGo = rs.getString("LOGO");
                
               NhaCungCap ncc = new NhaCungCap(maNhaCungCap, tenNhaCungCap, diaChi, soDienThoai, loGo );
                mapTemp.put(ncc.getMaNhaCungCap(), ncc);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return mapTemp;
    }
   
    

    @Override
    public boolean add(Object obj) {
        NhaCungCap ncc = (NhaCungCap) obj;
        mapNhaCungCap.put(ncc.getMaNhaCungCap(), ncc);
        String sql = "insert into NhaCungCap(manhacungcap,tennhacungcap, diachi, sodienthoai, logo) values (?,?,?,?,?)";
        Connection connect = ConnectToDatabase.getConnect();
         try {
             PreparedStatement ppstm = connect.prepareStatement(sql);
             ppstm.setString(1, ncc.getMaNhaCungCap());
             ppstm.setString(2, ncc.getTenNhaCungCap());
             ppstm.setString(3, ncc.getDiaChi());
             ppstm.setBigDecimal(4, ncc.getSoDienThoai());
             ppstm.setString(5, ncc.getLoGo());
             return true;
         } catch (SQLException ex) {
             System.out.println("err when add customer: "+ex.getMessage());
         }
        return false;
    }

    @Override
    public boolean del(String id) {
         mapNhaCungCap.remove(id);
         try {
             new ConnectToDatabase().excuteSql("delete from NhaCungCap where maNhaCungCap = '"+id+"'");
             return true;
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
        return false;
    }

    @Override
    public boolean edit(String id, Object obj) {
        NhaCungCap ncc = (NhaCungCap) obj;
       mapNhaCungCap.replace(id, ncc);
        String sql = "update NhaCungCap set maNhaCungCap = ?, tenNhaCungCap = ?, diaChi = ?, soDienThoai = ?, logo = ? where maLoai='"+id+"'";
        Connection connect = ConnectToDatabase.getConnect();
          try {
             PreparedStatement ppstm = connect.prepareStatement(sql);
             ppstm.setString(1,id);
             ppstm.setString(2, ncc.getTenNhaCungCap());
             ppstm.setString(3, ncc.getDiaChi());
             ppstm.setBigDecimal(4, ncc.getSoDienThoai());
             ppstm.setString(5, ncc.getLoGo());
            
             return true;
         } catch (SQLException ex) {
             System.out.println("err when edit customer: "+ex.getMessage());
         }
        return false;
    }
    
}
