/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.69
 * Generated at: 2016-06-24 13:38:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.BenhNhan;

public final class ThongTinBenhNhan_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html  >\r\n");
      out.write("<html lang=\"en\" xmlns:th=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("   <head>\r\n");
      out.write("      <meta charset=\"utf-8\" />\r\n");
      out.write("      <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("      <title>Hệ thống đặt lịch và trả kết quả trực tuyến</title>\r\n");
      out.write("      <link href=\"css/styles.css\" rel=\"stylesheet\"/>\r\n");
      out.write("      <link href=\"css/jquery-ui.css\" rel=\"stylesheet\"/>\r\n");
      out.write("      <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" media=\"screen\" />\r\n");
      out.write("      <link href=\"css/customize.css\" rel=\"stylesheet\" media=\"screen\" />\r\n");
      out.write("      <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\" media=\"screen\" />\r\n");
      out.write("      <link href=\"css/footer-basic-centered.css\" rel=\"stylesheet\"\r\n");
      out.write("         media=\"screen\" />\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" />\r\n");
      out.write("      <script src=\"js/angular.min.js\"></script>\r\n");
      out.write("      <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("      <!--Demo-->\r\n");
      out.write("      <script src=\"js/prefixfree.min.js\"></script>\r\n");
      out.write("   </head>\r\n");
      out.write("   <body>\r\n");
      out.write("   \t");

 		BenhNhan bn = (BenhNhan) session.getAttribute("currentUser");
	
      out.write("\r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header1.jsp", out, false);
      out.write("\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("         <div class=\"row\">\r\n");
      out.write("            <div class=\"contentleft col-md-10\">\r\n");
      out.write("\t\t\t\t\t<div class=\"contentleft col-md-10\" ng-app=\"myApp\"\r\n");
      out.write("\t\t\t\t\t\tng-controller=\"customersCtrl\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Thông tin bệnh nhân</h3>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"datlich\">\r\n");
      out.write("\t\t\t\t\t\t\t<form class=\"form-horizontal\" action=\"BenhNhanController\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Họ tên</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Họ tên...\" class='form-control' \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"hoten\" required=\"\" value=");
      out.print(bn.getHoTen() );
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label \">Ngày sinh</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type='text' ng-model='course.date' class='form-control'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tdata-date-format=\"dd-mm-yyyy\" value=");
      out.print(bn.getNgaySinh() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Ngày sinh...\" required=\"\" id=\"check-out\" name=\"ngaysinh\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Giới tính</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tname=\"gioitinh\" id=\"gioitinh\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"0\">Nam</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">Nữ</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">CMND</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type='text' class='form-control' name=\"CMND\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"CMND...\" required=\"\" id=\"CMND\" value=");
      out.print(bn.getCmnd() );
      out.write(" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Số điện thoại</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type='text' class='form-control' name=\"SDT\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Số điện thoại...\" required=\"\" id=\"SDT\" value=");
      out.print(bn.getSdt() );
      out.write(" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Email</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"email\" class='form-control' name=\"email\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Email...\" required=\"\" id=\"email\" value=");
      out.print(bn.getEmail() );
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Địa chỉ</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type='text' class='form-control' name=\"diachi\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Địa chỉ...\" required=\"\" id=\"diachi\" value=");
      out.print(bn.getDiaChi() );
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\">Mã Pin</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type='text' class='form-control' name=\"maPin\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Địa chỉ...\" required=\"\" id=\"maPin\" value=");
      out.print(bn.getMaPin() );
      out.write(">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"col-sm-3 control-label\"></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-sm-4\">\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-success\">Cập Nhật</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- footer -->\r\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer1.jsp", out, false);
      out.write(" \r\n");
      out.write("      <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("      <script src=\"js/bootstrap-datepicker.js\"></script>\r\n");
      out.write("      <script src=\"js/ThemMoi.js\"></script>\r\n");
      out.write("   </body>\r\n");
      out.write("</html>");
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
