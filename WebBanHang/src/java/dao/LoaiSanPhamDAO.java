/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import model.ConnectToDatabase;
import model.LoaiSanPham;


/**
 *
 * @author admin
 */
public class LoaiSanPhamDAO implements ObjectDao{
    public LoaiSanPhamDAO(){
        
    };
 public static Map<String, LoaiSanPham> mapLoaiSanPham = loadData();

    private static Map<String, LoaiSanPham> loadData() {
        Map<String, LoaiSanPham> mapTemp = new HashMap<>();
        try{
            ResultSet rs = new ConnectToDatabase().selectData("select * from LoaiSanPham");
            while (rs.next()){
                String maLoai = rs.getString("MALOAI");
                String tenLoai = rs.getString("TENLOAI");
                String maNhaCungCap= rs.getString("MANHACUNGCAP");
                String moTa = rs.getString("MOTA");
                
                LoaiSanPham lsp = new LoaiSanPham( );
                mapTemp.put(lsp.getMaLoai(), lsp);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return mapTemp;
    }
    @Override
    public boolean add(Object obj) {
        LoaiSanPham lsp = (LoaiSanPham) obj;
        mapLoaiSanPham.put(lsp.getMaLoai(), lsp);
        String sql = "insert into LoaiSanPham(maloai,tenloai, manhacungcap, mota) values (?,?,?,?)";
        Connection connect = ConnectToDatabase.getConnect();
         try {
             PreparedStatement ppstm = connect.prepareStatement(sql);
             ppstm.setString(1,lsp.getMaLoai());
             ppstm.setString(2, lsp.getTenLoai());
             ppstm.setString(3, lsp.getMaNhaCungCap());
             ppstm.setString(4, lsp.getMoTa());
            
             return true;
         } catch (SQLException ex) {
             System.out.println("err when add customer: "+ex.getMessage());
         }
        return false;
    }

    @Override
    public boolean del(String id) {
         mapLoaiSanPham.remove(id);
         try {
             new ConnectToDatabase().excuteSql("delete from LoaiSanPham where maLoai = '"+id+"'");
             return true;
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
        return false;
    }

    @Override
    public boolean edit(String id, Object obj) {
        LoaiSanPham lsp = (LoaiSanPham) obj;
        mapLoaiSanPham.replace(id, lsp);
        String sql = "update LoaiSanPham set maLoai = ?, tenLoai = ?, maNhaCungCap = ?, moTa = ?, where maLoai='"+id+"'";
        Connection connect = ConnectToDatabase.getConnect();
          try {
             PreparedStatement ppstm = connect.prepareStatement(sql);
             ppstm.setString(1,id);
             ppstm.setString(2, lsp.getTenLoai());
             ppstm.setString(3, lsp.getMaNhaCungCap());
             ppstm.setString(4, lsp.getMoTa());
            
             return true;
         } catch (SQLException ex) {
             System.out.println("err when add customer: "+ex.getMessage());
         }
        return false;
    }
    
    
}
