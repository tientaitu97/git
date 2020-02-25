/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author admin
 */
public interface ObjectDao {
    default boolean add(Object obj){
        return false;
    }
     default boolean edit(String id, Object obj){
        return false;
    }
      default boolean del(String id){
        return false;
    }
}
