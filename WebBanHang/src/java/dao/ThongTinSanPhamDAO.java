/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import static dao.NhaCungCapDAO.mapNhaCungCap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import model.ConnectToDatabase;
import model.NhaCungCap;

import model.ThongTinSanPham;

/**
 *
 * @author admin
 */
public class ThongTinSanPhamDAO implements ObjectDao{
    public ThongTinSanPhamDAO(){
        
    }
    public Map<String, ThongTinSanPham > mapThongTinSanPham = loadData();

    private Map<String, ThongTinSanPham> loadData() {
        Map<String, ThongTinSanPham> mapTemp = new HashMap<>();
         try{
            ResultSet rs = new ConnectToDatabase().selectData("select * from ThongTinSanPham");
            while (rs.next()){
                String maSanPham = rs.getString("MaSanPham");
                String moTa1 = rs.getString("moTa1");
                String moTa2 = rs.getString("moTa2");
                String moTa3 = rs.getString("moTa3");
                String moTa4 = rs.getString("moTa4");
                String moTa5 = rs.getString("moTa5");
                String hinhAnhChiTiet= rs.getString("hinhAnhChiTiet");
                
               ThongTinSanPham ttsp = new ThongTinSanPham(maSanPham, moTa1, moTa2, moTa3, moTa4, moTa5, hinhAnhChiTiet );
                mapTemp.put(ttsp.getMaSanPham(), ttsp);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return mapTemp;
    }

    @Override
    public boolean add(Object obj) {
        ThongTinSanPham ttsp = (ThongTinSanPham) obj;
        mapThongTinSanPham.put(ttsp.getMaSanPham(), ttsp);
        String sql = "insert into ThongTinSanPham(masanpham,mota1, mota2, mota3, mota4, mota5, hinhAnhChiTiet) values (?,?,?,?,?,?,?)";
        Connection connect = ConnectToDatabase.getConnect();
         try {
             PreparedStatement ppstm = connect.prepareStatement(sql);
             ppstm.setString(1, ttsp.getMaSanPham());
             ppstm.setString(2, ttsp.getMoTa1());
             ppstm.setString(3, ttsp.getMoTa2());
             ppstm.setString(4, ttsp.getMoTa3());
             ppstm.setString(5, ttsp.getMoTa4());
             ppstm.setString(6, ttsp.getMoTa5());
             ppstm.setString(7, ttsp.getHinhAnhChiTiet());
             return true;
         } catch (SQLException ex) {
             System.out.println("err when add customer: "+ex.getMessage());
         }
        return false;
    }

    @Override
    public boolean del(String id) {
         mapThongTinSanPham.remove(id);
         try {
             new ConnectToDatabase().excuteSql("delete from ThongTinSanPham where maSanpham = '"+id+"'");
             return true;
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
        return false;
    }

    @Override
    public boolean edit(String id, Object obj) {
       ThongTinSanPham ttsp = (ThongTinSanPham) obj;
       mapThongTinSanPham.replace(id, ttsp);
        String sql = "update ThongTinSanPham set maSanPham = ?, Mota1= ?, Mota2 = ?, Mota3 = ?,Mota4 = ?, Mota5 = ?, hinhAnhChiTiet = ? where maSanPham='"+id+"'";
        Connection connect = ConnectToDatabase.getConnect();
          try {
             PreparedStatement ppstm = connect.prepareStatement(sql);
             ppstm.setString(1,id);
             ppstm.setString(2,ttsp.getMoTa1());
             ppstm.setString(3,ttsp.getMoTa2());
             ppstm.setString(4,ttsp.getMoTa3());
             ppstm.setString(5,ttsp.getMoTa4());
             ppstm.setString(6,ttsp.getMoTa5());
             ppstm.setString(7,ttsp.getHinhAnhChiTiet());
          
             
            
             return true;
         } catch (SQLException ex) {
             System.out.println("err when edit customer: "+ex.getMessage());
         }
        return false;
    }
    
            
}
