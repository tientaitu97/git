<%-- 
    Document   : header-top
    Created on : Feb 19, 2020, 10:12:05 AM
    Author     : admin
--%>

<%@page import="model.TaiKhoan"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%  TaiKhoan tk = (TaiKhoan)session.getAttribute("userlogin"); %>
    </head>
    <body>
        <div class="header" id="home">	
			<div class="header-para">
				<p>The quick brown <span>fox jumps over a lazy dog. DJs flock by when MTV ax quiz prog.</span></p>	
			</div>	
			<ul class="header-in">
                            <li><a href ="">Xin Chao,
                                    <% if(tk!=null){
                                        out.print(tk.getTenTaiKhoan());
                                    }%>
                                </a></li>
				<li><a href="account.jsp">MY ACCOUNT</a> </li>
				<li><a href="wishlist.jsp">  WISHLIST</a></li>
				<li ><a href="contact.jsp" > CONTACT US</a></li>
			</ul>
				<div class="clearfix"> </div>
		</div>
		<!---->
		<div class="header-top">
			<div class="logo">
				<a href="index.jsp"><img src="images/logo.png" alt="" ></a>
			</div>
			<div class="header-top-on">
				<ul class="social-in">
					<li><a href="#"><i> </i></a></li>						
					<li><a href="#"><i class="ic"> </i></a></li>
					<li><a href="#"><i class="ic1"> </i></a></li>
					<li><a href="#"><i class="ic2"> </i></a></li>
					<li><a href="#"><i class="ic3"> </i></a></li>
				</ul>
			</div>
				<div class="clearfix"> </div>
		</div>
    </body>
</html>
