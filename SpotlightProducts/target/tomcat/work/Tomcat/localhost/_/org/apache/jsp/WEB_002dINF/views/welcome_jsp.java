/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-12-04 23:44:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<title>SpotLightProduct's Main Page</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("#navBarSearchForm input[type=text] {\r\n");
      out.write("\twidth: 500px !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar {\r\n");
      out.write("\tmargin-bottom: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".borderless li {\r\n");
      out.write("\tborder-top: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".welcomeMessage {\r\n");
      out.write("\tmargin-top: 15px;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\t<div class=\"col-xs-8 col-md-offset-4 col-md-4\">\r\n");
      out.write("\t\t<h1 align=\"center\">SpotlightProducts</h1>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\"\r\n");
      out.write("\t\t\t\taria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"#\">SP</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<form class=\"navbar-form navbar-left\" role=\"search\"\r\n");
      out.write("\t\t\tid=\"navBarSearchForm\" method=\"POST\" action=\"/search\">\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"searchQuery\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-primary btn\">\r\n");
      out.write("\t\t\t<i class=\"fa fa-search\"></i>\r\n");
      out.write("\t\t\t</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li><form action=\"/ShoppingCart\"><button type=\"submit\" class=\"btn btn-primary navbar-btn\">\r\n");
      out.write("\t\t\t\t\t<i class=\"fa fa-shopping-cart\"></i> Shopping Cart\r\n");
      out.write("\t\t\t\t</button></form></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\taria-expanded=\"false\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" <span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/Dashboard\">Dashboard</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/ChangePassword\">Change Password</a></li>\r\n");
      out.write("\t\t\t\t\t<li role=\"separator\" class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/Logout\">Logout</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.navbar-collapse -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /.container-fluid -->\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<ul class=\"nav nav-pills\">\r\n");
      out.write("\t<li role=\"presentation\" class=\"active\"><a href=\"/homepage\">Home</a></li>\r\n");
      out.write("\t<li role=\"presentation\"><a href=\"/filterByElectronics\">Electronics</a></li>\r\n");
      out.write("\t<li role=\"presentation\"><a href=\"/filterByMobiles\">Mobiles</a></li>\r\n");
      out.write("\t<li role=\"presentation\"><a href=\"/filterByShoes\">Shoes</a></li>\r\n");
      out.write("\t<li role=\"presentation\"><a href=\"/filterByWatches\">Watches</a></li>\r\n");
      out.write("\t<li role=\"presentation\"><a href=\"/filterByBooks\">Books</a></li>\r\n");
      out.write("\t<li role=\"presentation\"><a href=\"/filterBySpotlightProducts\">SpotLightProducts</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("<!-- Page Content -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t<p class=\"lead\">Filter Products</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"list-group\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"list-group-item list-group-item-action\">Price\r\n");
      out.write("\t\t\t\t\tLow to High</button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"list-group-item list-group-item-action\">Price\r\n");
      out.write("\t\t\t\t\tHigh to Low</button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"list-group-item list-group-item-action\">A\r\n");
      out.write("\t\t\t\t\tto Z</button>\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"list-group-item list-group-item-action\">Z\r\n");
      out.write("\t\t\t\t\tto A</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-md-9\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row carousel-holder\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t<div id=\"carousel-example-generic\" class=\"carousel slide\"\r\n");
      out.write("\t\t\t\t\t\tdata-ride=\"carousel\">\r\n");
      out.write("\t\t\t\t\t\t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"active\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t\t\t\t\t\t</ol>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"carousel-inner\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"slide-image\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"/resources/nikon-1.png\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"slide-image\" src=\"/resources/macbook-1.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"slide-image\" src=\"http://placehold.it/800x300\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\talt=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"left carousel-control\" href=\"#carousel-example-generic\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-slide=\"prev\"> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-left\"></span>\r\n");
      out.write("\t\t\t\t\t\t</a> <a class=\"right carousel-control\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"#carousel-example-generic\" data-slide=\"next\"> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"http://placehold.it/320x150\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"pull-right\">$24.99</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">First Product</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\tSee more snippets like this online store item at <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttarget=\"_blank\" href=\"http://www.bootsnipp.com\">Bootsnipp -\r\n");
      out.write("\t\t\t\t\t\t\t\t\thttp://bootsnipp.com</a>.\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ratings\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"pull-right\">15 reviews</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"http://placehold.it/320x150\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"pull-right\">$64.99</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Second Product</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>This is a short description. Lorem ipsum dolor sit amet,\r\n");
      out.write("\t\t\t\t\t\t\t\tconsectetur adipiscing elit.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ratings\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"pull-right\">12 reviews</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star-empty\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"http://placehold.it/320x150\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"pull-right\">$74.99</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Third Product</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>This is a short description. Lorem ipsum dolor sit amet,\r\n");
      out.write("\t\t\t\t\t\t\t\tconsectetur adipiscing elit.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ratings\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"pull-right\">31 reviews</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star-empty\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"http://placehold.it/320x150\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"pull-right\">$84.99</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Fourth Product</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>This is a short description. Lorem ipsum dolor sit amet,\r\n");
      out.write("\t\t\t\t\t\t\t\tconsectetur adipiscing elit.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ratings\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"pull-right\">6 reviews</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star-empty\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star-empty\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"http://placehold.it/320x150\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"pull-right\">$94.99</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Fifth Product</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>This is a short description. Lorem ipsum dolor sit amet,\r\n");
      out.write("\t\t\t\t\t\t\t\tconsectetur adipiscing elit.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ratings\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"pull-right\">18 reviews</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star-empty\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"http://placehold.it/320x150\" alt=\"\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"pull-right\">$94.99</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">Fifth Product</a>\r\n");
      out.write("\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t<p>This is a short description. Lorem ipsum dolor sit amet,\r\n");
      out.write("\t\t\t\t\t\t\t\tconsectetur adipiscing elit.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"ratings\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"pull-right\">18 reviews</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"glyphicon glyphicon-star-empty\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t<hr>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Footer -->\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t<p>Copyright &copy; SpotlightProducts.com 2016</p>\r\n");
      out.write("\t\t\t\t <a href=\"/CustomerSupport\">Customer Support </a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.container -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
