/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.69
 * Generated at: 2016-06-21 16:35:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ThemMoi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html  >\r\n");
      out.write("<html lang=\"en\" xmlns:th=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("<title>Hệ thống đặt lịch và trả kết quả trực tuyến</title>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"//ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/customize.css\" rel=\"stylesheet\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" media=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/footer-basic-centered.css\" rel=\"stylesheet\"\r\n");
      out.write("\tmedia=\"screen\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/angular.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--Demo-->\r\n");
      out.write("<link rel='stylesheet prefetch'\r\n");
      out.write("\thref='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css' />\r\n");
      out.write("<script src=\"js/prefixfree.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<!-- Main menu -->\r\n");
      out.write("\t\t<nav class=\"navbar navbar-default\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\"\r\n");
      out.write("\t\t\t\t\t\tdata-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\t\t\t\taria-controls=\"navbar\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<a class=\"navbar-brand\" href=\"#\">HN Hospital</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"#\">Trang chủ</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Liên hệ</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\taria-expanded=\"false\">Dịch vụ<span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Hoạt đông</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Đăng ký khám trực tuyến</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"../navbar-static-top/\">Đăng\r\n");
      out.write("\t\t\t\t\t\t\t\tnhập</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"../navbar-fixed-top/\">Đăng ký</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\taria-expanded=\"false\">Phạm Hồng Thuận<span class=\"caret\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Thông tin cá nhân</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Đăng xuất</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!--/.nav-collapse -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--/.container-fluid -->\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<!-- SiderBar -->\r\n");
      out.write("\t\t<div id=\"carousel-example-generic\" class=\"carousel slide\"\r\n");
      out.write("\t\t\tdata-ride=\"carousel\">\r\n");
      out.write("\t\t\t<!-- Indicators -->\r\n");
      out.write("\t\t\t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"0\"\r\n");
      out.write("\t\t\t\t\tclass=\"active\"></li>\r\n");
      out.write("\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t\t<li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Wrapper for slides -->\r\n");
      out.write("\t\t\t<div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("\t\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/b3.jpg\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption\">Projec IT</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/b3.jpg\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption\">Banner2</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/b3.jpg\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t<div class=\"carousel-caption\">Banner3</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t...\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Controls -->\r\n");
      out.write("\t\t\t<a class=\"left carousel-control\" href=\"#carousel-example-generic\"\r\n");
      out.write("\t\t\t\trole=\"button\" data-slide=\"prev\"> <span\r\n");
      out.write("\t\t\t\tclass=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Previous</span>\r\n");
      out.write("\t\t\t</a> <a class=\"right carousel-control\" href=\"#carousel-example-generic\"\r\n");
      out.write("\t\t\t\trole=\"button\" data-slide=\"next\"> <span\r\n");
      out.write("\t\t\t\tclass=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Next</span>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"contentright col-md-2\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t\t\t\t<li role=\"presentation\" class=\"active\"><a href=\"#\">Thông\r\n");
      out.write("\t\t\t\t\t\t\t\ttin cá nhân</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li role=\"presentation\"><a href=\"add_schedule.html\">Đặt\r\n");
      out.write("\t\t\t\t\t\t\t\tmới lịch khám</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li role=\"presentation\"><a href=\"schedule_list.html\">Danh\r\n");
      out.write("\t\t\t\t\t\t\t\tsách lịch khám</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"contentleft col-md-10\">\r\n");
      out.write("\t\t\t\t\t<div class=\"contentleft col-md-10\" ng-app=\"myApp\"\r\n");
      out.write("\t\t\t\t\t\tng-controller=\"customersCtrl\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Thêm mới lịch khám</h3>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"datlich\">\r\n");
      out.write("\t\t\t\t\t\t\t<form class=\"form-horizontal\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Chọn dịch vụ khám</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select class=\"form-control\" ng-model=\"maDichVu.dichVu\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tng-change=\"loadPhongKham()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option ng-selected=\"maDichVu.dichVu == item.dichVuId\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tng-repeat=\"item in models\" ng-value=\"item.dichVu_Id\">{{item.tenDichVu}}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- <select class=\"form-control\" ng-model=\"maDichVu.dichVu\" ng-change=\"loadPhongKham()\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tng-options=\"option.tenDichVu for option in models track by option.dichVu_Id\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label \">Ngày khám</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type='text' ng-model='course.date' class='form-control'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tng-change=\"loadPhongKham()\" data-date-format=\"dd-mm-yyyy\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Ngày khám\" required=\"\" id=\"check-out\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Buổi khám</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select class=\"form-control\" ng-init=\"buoiKham = 0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"buoiKham\" id=\"buoiKham\" ng-model=\"data.buoiKham\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tng-change=\"loadPhongKham()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Sáng</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Chiều</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Phòng khám</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!--<select  class=\"form-control\" ng-change=\"loadBacSiByPhongKham()\" ng-model=\"phongKhamId\" ng-options=\"item as item.tenPhongKham for item in PhongKhams track by item.phongKhamId\">-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!--</select>-->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select class=\"form-control\" ng-model=\"phongKhamId\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tng-change=\"loadBacSiByPhongKham()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option ng-selected=\"phongKhamId == item.phongKhamId\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tng-repeat=\"item in PhongKhams\" ng-value=\"item.phongKhamId\">{{item.tenPhongKham}}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\" ng-model=\"bacSiKham\">Bác\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tsĩ khám</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select class=\"form-control\" ng-model=\"bacSiId\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tng-change=\"loadPhongKhamByBacSi()\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option ng-selected=\"bacSiId == item.bacSiId\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tng-repeat=\"item in BacSis\" ng-value=\"item.bacSiId\">{{item.hoTen}}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Thời gian dự kiến</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\" ng-model=\"caLam\">{{caLam}}</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\"></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\">Xác\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tnhận đặt lịch</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- footer -->\r\n");
      out.write("\t\t<footer class=\"footer-basic-centered\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<p class=\"footer-company-motto\">Footer - project - it - 2016</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<p class=\"footer-links\">\r\n");
      out.write("\t\t\t\t<a href=\"#\">Home</a> · <a href=\"#\">Blog</a> · <a href=\"#\">Pricing</a>\r\n");
      out.write("\t\t\t\t· <a href=\"#\">About</a> · <a href=\"#\">Faq</a> · <a href=\"#\">Contact</a>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<p class=\"footer-company-name\">Company Name &copy; 2015</p>\r\n");
      out.write("\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tvar app = angular.module('myApp', []);\r\n");
      out.write("\r\n");
      out.write("\t\tapp\r\n");
      out.write("\t\t\t\t.controller(\r\n");
      out.write("\t\t\t\t\t\t'customersCtrl',\r\n");
      out.write("\t\t\t\t\t\tfunction($scope, $http) {\r\n");
      out.write("\t\t\t\t\t\t\t$scope.course = {\r\n");
      out.write("\t\t\t\t\t\t\t\tdate : ''\r\n");
      out.write("\t\t\t\t\t\t\t};\r\n");
      out.write("\t\t\t\t\t\t\t$('#check-out').datepicker();\r\n");
      out.write("\t\t\t\t\t\t\t$('#check-out').datepicker().on(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t'changeDate',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tfunction(ev) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$scope.course.date = $('#check-out')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t.val();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$scope.$digest();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t$scope.$watch('course.date', function(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tnewValue, oldValue) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$scope.course.date = newValue;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t$http(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tmethod : 'GET',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\turl : 'http://localhost:8080/QLDatLichKham/DichVuRest?command=getAllDichVu',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\theaders : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'Content-type' : 'application/json'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}).success(function(response) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$scope.models = response;\r\n");
      out.write("\t\t\t\t\t\t\t}).error(function(error) {\r\n");
      out.write("\t\t\t\t\t\t\t\t$scope.error = error;\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$scope.data = {\r\n");
      out.write("\t\t\t\t\t\t\t\tbuoiKham : null,\r\n");
      out.write("\t\t\t\t\t\t\t\tmultipleSelect : [],\r\n");
      out.write("\t\t\t\t\t\t\t\toption1 : '1',\r\n");
      out.write("\t\t\t\t\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$scope.maDichVu = {\r\n");
      out.write("\t\t\t\t\t\t\t\tdichVu : null,\r\n");
      out.write("\t\t\t\t\t\t\t\tmultipleSelect : [],\r\n");
      out.write("\t\t\t\t\t\t\t\toption1 : '1',\r\n");
      out.write("\t\t\t\t\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$scope.loadPhongKham = function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$http(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmethod : 'GET',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\turl : \"http://localhost:8080/QLDatLichKham/PhongKhamRest?command=findPhongKhamByDichVuIdAndNgayKhamAndBuoiKham&dichVuId=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.maDichVu.dichVu\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"&ngayKham=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.course.date\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"&buoiKham=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.data.buoiKham + \"\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\theaders : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t'Content-type' : 'application/json'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}).success(function(response) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$scope.PhongKhams = response;\r\n");
      out.write("\t\t\t\t\t\t\t\t}).error(function(error) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$scope.error = error;\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$http(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmethod : 'GET',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\turl : \"http://localhost:8080/QLDatLichKham/BacSiRest?command=findBacSiByDichVuIdAndNgayKhamAndBuoiKham&dichVuId=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.maDichVu.dichVu\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"&ngayKham=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.course.date\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"&buoiKham=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.data.buoiKham + \"\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\theaders : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t'Content-type' : 'application/json'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}).success(function(response) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$scope.BacSis = response;\r\n");
      out.write("\t\t\t\t\t\t\t\t}).error(function(error) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$scope.error = error;\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\t$scope.bacSiId = null;\r\n");
      out.write("\t\t\t\t\t\t\t\t$scope.phongKhamId = null;\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$scope.loadBacSiByPhongKham = function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t$http(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmethod : 'GET',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\turl : \"http://localhost:8080/QLDatLichKham/BacSiRest?command=findBacSiByLichBieu&ngayKham=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.course.date\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"&buoiKham=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.buoiKham\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"&phongKhamId=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.phongKhamId + \"\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\theaders : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t'Content-type' : 'application/json'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}).success(function(response) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$scope.bacSiId = response[0].bacSiId;\r\n");
      out.write("\t\t\t\t\t\t\t\t}).error(function(error) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$scope.error = error;\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$http(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmethod : 'GET',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\turl : \"http://localhost:8080/QLDatLichKham/CaLamRest/findCaLamByLichBieu/\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.course.date\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"/\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.buoiKham\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"/\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.phongKhamId + \"\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\theaders : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t'Content-type' : 'application/json'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}).success(function(response) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$scope.caLam = response.ca;\r\n");
      out.write("\t\t\t\t\t\t\t\t}).error(function(error) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$scope.error = error;\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$scope.loadPhongKhamByBacSi = function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t$http(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmethod : 'GET',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\turl : \"http://localhost:8080/QLDatLichKham/PhongKhamRest?command=findPhongKhamByLichBieu&ngayKham=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.course.date\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"&buoiKham=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.buoiKham\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"&bacSiId=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.bacSiId + \"\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\theaders : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t'Content-type' : 'application/json'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t.success(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tfunction(response) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t$scope.phongKhamId = response[0].phongKhamId;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t}).error(function(error) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$scope.error = error;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t$http(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tmethod : 'GET',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\turl : \"http://localhost:8080/QLDatLichKham/CaLamRest/findCaLamByLichBieu/\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.course.date\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"/\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.buoiKham\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"/\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ $scope.phongKhamId + \"\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\theaders : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t'Content-type' : 'application/json'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}).success(function(response) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$scope.caLam = response.ca;\r\n");
      out.write("\t\t\t\t\t\t\t\t}).error(function(error) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$scope.error = error;\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}