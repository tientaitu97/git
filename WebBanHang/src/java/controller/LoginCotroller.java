/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dao.TaiKhoanDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.TaiKhoan;

/**
 *
 * @author admin
 */
@WebServlet("/Login")
public class LoginCotroller extends HttpServlet {

    
    public LoginCotroller(){
        super();
    }
        
        

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=utf-8");
        String action = req.getParameter("action");
        if(action==null){
            System.out.println("Khong thuc hien gi het");
        } else if(action.equals("Login")){
            String userName = req.getParameter("username");
            String passWord = req.getParameter("password");
            if(new TaiKhoanDao().checkLogin(userName,passWord)){
                HttpSession session = req.getSession();
                TaiKhoan tk = TaiKhoanDao.mapTaiKhoan.get(userName);
                session.setAttribute("userlogin", tk);
                
            }
            
        } else if(action.equals("Res")){
            
        } else if(action.equals("Logout")){
            
        }
        resp.sendRedirect("account.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
    }

    
   


