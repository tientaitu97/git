package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Mihstore A Ecommerce Category Flat Bootstarp Resposive Website Template | Cart :: w3layouts</title>\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<!--theme-style-->\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("<!--//theme-style-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Mihstore Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--fonts-->\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Cabin:400,500,600,700' rel='stylesheet' type='text/css'>\n");
      out.write("<!--//fonts-->\n");
      out.write("<!--//slider-script-->\n");
      out.write("<script>$(document).ready(function(c) {\n");
      out.write("\t$('.alert-close').on('click', function(c){\n");
      out.write("\t\t$('.message').fadeOut('slow', function(c){\n");
      out.write("\t  \t\t$('.message').remove();\n");
      out.write("\t\t});\n");
      out.write("\t});\t  \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<script>$(document).ready(function(c) {\n");
      out.write("\t$('.alert-close1').on('click', function(c){\n");
      out.write("\t\t$('.message1').fadeOut('slow', function(c){\n");
      out.write("\t  \t\t$('.message1').remove();\n");
      out.write("\t\t});\n");
      out.write("\t});\t  \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<script>$(document).ready(function(c) {\n");
      out.write("\t$('.alert-close2').on('click', function(c){\n");
      out.write("\t\t$('.message2').fadeOut('slow', function(c){\n");
      out.write("\t  \t\t$('.message2').remove();\n");
      out.write("\t\t});\n");
      out.write("\t});\t  \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\tjQuery(document).ready(function($) {\n");
      out.write("\t\t\t\t\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\t\t\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t</script>\n");
      out.write("\t\t\t\t<!-- start menu -->\n");
      out.write("<link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/megamenu.js\"></script>\n");
      out.write("<script>$(document).ready(function(){$(\".megamenu\").megamenu();});</script>\t\t\n");
      out.write("</head>\n");
      out.write("<body> \n");
      out.write("<!--header-->\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"header\" id=\"home\">\t\n");
      out.write("\t\t\t<div class=\"header-para\">\n");
      out.write("\t\t\t\t<p>The quick brown <span>fox jumps over a lazy dog. DJs flock by when MTV ax quiz prog.</span></p>\t\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t\t<ul class=\"header-in\">\n");
      out.write("\t\t\t\t<li><a href=\"account.html\">MY ACCOUNT</a> </li>\n");
      out.write("\t\t\t\t<li><a href=\"wishlist.html\">  WISHLIST</a></li>\n");
      out.write("\t\t\t\t<li ><a href=\"contact.html\" > CONTACT US</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!---->\n");
      out.write("\t\t<div class=\"header-top\">\n");
      out.write("\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t<a href=\"index.html\"><img src=\"images/logo.png\" alt=\"\" ></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"header-top-on\">\n");
      out.write("\t\t\t\t<ul class=\"social-in\">\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><i> </i></a></li>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><i class=\"ic\"> </i></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><i class=\"ic1\"> </i></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><i class=\"ic2\"> </i></a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><i class=\"ic3\"> </i></a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"header-bottom\">\n");
      out.write("\t\t\t\t<div class=\"top-nav\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t  <ul class=\"megamenu skyblue\">\n");
      out.write("\t\t\t\t      <li class=\"active grid\"><a  href=\"index.html\">Products</a>\n");
      out.write("\t\t\t\t\t    <div class=\"megapanel\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Bags</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Caps & Hats</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Hoodies & Sweatshirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Jackets & Coats</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Jeans</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Jewellery</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Jumpers & Cardigans</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Leather Jackets</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Long Sleeve T-Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Loungewear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Shoes, Boots & Trainers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Shorts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Suits & Blazers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Sunglasses</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Sweatpants</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Swimwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Trousers & Chinos</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">T-Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Underwear & Socks</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Vests</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Popular Brands</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Levis</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Persol</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Nike</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Edwin</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">New Balance</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Jack & Jones</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Paul Smith</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Ray-Ban</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Wood Wood</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li><a class=\"pink\"  href=\"404.html\">ideas</a></li>\n");
      out.write("\t\t\t\t    <li class=\"grid\"><a  href=\"#\">Brands</a>\n");
      out.write("\t\t\t\t\t   <div class=\"megapanel\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Bags</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Caps & Hats</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Hoodies & Sweatshirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Jackets & Coats</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Jeans</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Jewellery</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Jumpers & Cardigans</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Leather Jackets</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Long Sleeve T-Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Loungewear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Shoes, Boots & Trainers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Shorts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Suits & Blazers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Sunglasses</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Sweatpants</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Swimwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Trousers & Chinos</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">T-Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Underwear & Socks</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Vests</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Popular Brands</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Levis</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Persol</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Nike</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Edwin</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">New Balance</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Jack & Jones</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Paul Smith</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Ray-Ban</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Wood Wood</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t    </li>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t<li><a class=\"pink\" href=\"gifts.html\">gifts</a></li>\n");
      out.write("\t\t\t <li class=\"grid\"><a  href=\"#\">stores</a>\n");
      out.write("\t\t\t\t\t   <div class=\"megapanel\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Accessories</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Bags</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Caps & Hats</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Hoodies & Sweatshirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Jackets & Coats</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Jeans</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Jewellery</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Jumpers & Cardigans</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Leather Jackets</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Long Sleeve T-Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Loungewear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Shoes, Boots & Trainers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Shorts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Suits & Blazers</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Sunglasses</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Sweatpants</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Swimwear</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Trousers & Chinos</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">T-Shirts</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Underwear & Socks</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Vests</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Popular Brands</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Levis</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Persol</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Nike</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Edwin</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">New Balance</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Jack & Jones</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Paul Smith</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Ray-Ban</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"store.html\">Wood Wood</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t    </li>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t  </ul> \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"cart icon1 sub-icon1\">\n");
      out.write("\t\t\t\t\t\t<h6 >Shopping cart:\n");
      out.write("\t\t\t\t\t\t<span class=\"item\">3 items</span>\n");
      out.write("\t\t\t\t\t\t<span class=\"rate\">70$</span>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\" class=\"round\"> </a>\n");
      out.write("\t\t\t\t\t\t<ul class=\"sub-icon1 list\">\n");
      out.write("\t\t\t\t\t\t  <h3>Recently added items(3)</h3>\n");
      out.write("\t\t\t\t\t\t  <div class=\"shopping_cart\">\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"cart_box\">\n");
      out.write("\t\t\t\t\t\t\t   \t <div class=\"message\">\n");
      out.write("\t\t\t\t\t\t\t   \t     <div class=\"alert-close\"> </div> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"list_img\"><img src=\"images/si.jpg\" class=\"img-responsive\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"list_desc\"><h4><a href=\"#\">velit esse molestie</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"offer\">1 offer applied</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t                              <div class=\"clearfix\"></div>\n");
      out.write("\t                              </div>\n");
      out.write("\t                            </div>\n");
      out.write("\t                           <div class=\"cart_box\">\n");
      out.write("\t\t\t\t\t\t\t   \t <div class=\"message1\">\n");
      out.write("\t\t\t\t\t\t\t   \t     <div class=\"alert-close1\"> </div> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"list_img\"><img src=\"images/si1.jpg\" class=\"img-responsive\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"list_desc\"><h4><a href=\"#\">velit esse molestie</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"offer\">1 offer applied</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t                              <div class=\"clearfix\"></div>\n");
      out.write("\t                              </div>\n");
      out.write("\t                            </div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cart_box\">\n");
      out.write("\t\t\t\t\t\t\t   \t <div class=\"message2\">\n");
      out.write("\t\t\t\t\t\t\t   \t     <div class=\"alert-close2\"> </div> \n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"list_img\"><img src=\"images/si.jpg\" class=\"img-responsive\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"list_desc\"><h4><a href=\"#\">velit esse molestie</a></h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"offer\">1 offer applied</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t                              <div class=\"clearfix\"></div>\n");
      out.write("\t                              </div>\n");
      out.write("\t                            </div>\n");
      out.write("\t                        </div>\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"check_button\"><a href=\"cart.html\">View Cart</a></div>\n");
      out.write("\t\t\t\t\t      <div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("</h6>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"page\">\n");
      out.write("\t\t\t<h6><a href=\"#\">Page Title</a><b>|</b>Page description The quick, brown <span class=\"for\">fox jumps over a lazy dog. DJs flock by when TV ax quiz prog.</span></h6>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"content\">\n");
      out.write("\t\t<div class=\"check-out\">\n");
      out.write("    \t    <h4 class=\"title\">Shopping cart is empty</h4>\n");
      out.write("    \t    <p class=\"cart-out\">You have no items in your shopping cart.<br>Click<a href=\"index.html\"> here</a> to continue shopping</p>\n");
      out.write("    \t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!---->\n");
      out.write("\t\t<div class=\"footer\">\n");
      out.write("\t\t\t<p class=\"footer-class\">© 2015 Mihstore All Rights Reserved | Template by  <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a> </p>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<a href=\"#home\" class=\"scroll to-Top\" >  GO TO TOP!</a>\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!---->\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
