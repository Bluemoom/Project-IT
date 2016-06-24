/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.69
 * Generated at: 2016-06-24 12:49:33 UTC
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
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header1.jsp", out, false);
      out.write("\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("         <div class=\"row\">\r\n");
      out.write("            <div class=\"contentright col-md-2\">\r\n");
      out.write("               <ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("                  <li role=\"presentation\" class=\"active\"><a href=\"#\">Thông\r\n");
      out.write("                     tin cá nhân</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li role=\"presentation\"><a href=\"add_schedule.html\">Đặt\r\n");
      out.write("                     mới lịch khám</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li role=\"presentation\"><a href=\"schedule_list.html\">Danh\r\n");
      out.write("                     sách lịch khám</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("               </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"contentleft col-md-10\">\r\n");
      out.write("               <div class=\"contentleft col-md-10\" ng-app=\"myApp\"\r\n");
      out.write("                  ng-controller=\"customersCtrl\">\r\n");
      out.write("                  <h3>Thêm mới lịch khám</h3>\r\n");
      out.write("                  <div class=\"datlich\">\r\n");
      out.write("                     <form class=\"form-horizontal\" method=\"POST\" action=\"DatLichController\">\r\n");
      out.write("                        <input id=\"command\" type=\"hidden\" name=\"command\" value=\"addNew\"/>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                           <label class=\"col-sm-3 control-label\">Chọn dịch vụ khám</label>\r\n");
      out.write("                           <div class=\"col-sm-4\">\r\n");
      out.write("                              <select class=\"form-control\" id=\"dichVu_Id\" name=\"dichVu_Id\" ng-model=\"maDichVu.dichVu\"\r\n");
      out.write("                                 ng-change=\"loadPhongKham()\">\r\n");
      out.write("                                 <option ng-selected=\"maDichVu.dichVu == item.dichVuId\"\r\n");
      out.write("                                    ng-repeat=\"item in models\" ng-value=\"item.dichVu_Id\">{{item.tenDichVu}}\r\n");
      out.write("                                 </option>\r\n");
      out.write("                              </select>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                           <label class=\"col-sm-3 control-label \">Ngày khám</label>\r\n");
      out.write("                           <div class=\"col-sm-3\">\r\n");
      out.write("                              <input type='text' required=\"true\" ng-model='course.date' class='form-control'\r\n");
      out.write("                                 ng-change=\"loadPhongKham()\" data-date-format=\"dd-mm-yyyy\"\r\n");
      out.write("                                 placeholder=\"Ngày khám\" required=\"\" id=\"check-out\" />\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                           <label class=\"col-sm-3 control-label\">Buổi khám</label>\r\n");
      out.write("                           <div class=\"col-sm-2\">\r\n");
      out.write("                              <select class=\"form-control\" required=\"true\" ng-init=\"buoiKham = 0\"\r\n");
      out.write("                                 name=\"buoiKham\" id=\"buoiKham\" ng-model=\"data.buoiKham\"\r\n");
      out.write("                                 ng-change=\"loadPhongKham()\">\r\n");
      out.write("                                 <option value=\"0\">Sáng</option>\r\n");
      out.write("                                 <option value=\"1\">Chiều</option>\r\n");
      out.write("                              </select>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                           <label class=\"col-sm-3 control-label\">Phòng khám</label>\r\n");
      out.write("                           <div class=\"col-sm-4\">\r\n");
      out.write("                              <select class=\"form-control\" required=\"true\" id=\"phongKham_Id\" name=\"phongKham_Id\" ng-model=\"phongKhamId\"\r\n");
      out.write("                                 ng-change=\"loadBacSiByPhongKham()\">\r\n");
      out.write("                                 <option ng-selected=\"phongKhamId == item.phongKham_Id\"\r\n");
      out.write("                                    ng-repeat=\"item in PhongKhams\" ng-value=\"item.phongKham_Id\">{{item.tenPhongKham}}\r\n");
      out.write("                                 </option>\r\n");
      out.write("                              </select>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                           <label class=\"col-sm-3 control-label\" ng-model=\"bacSiKham\">Bác\r\n");
      out.write("                           sĩ khám</label>\r\n");
      out.write("                           <div class=\"col-sm-4\">\r\n");
      out.write("                              <select class=\"form-control\" required=\"true\" ng-model=\"bacSiId\"\r\n");
      out.write("                                 ng-change=\"loadPhongKhamByBacSi()\">\r\n");
      out.write("                                 <option ng-selected=\"bacSiId == item.bacSi_Id\"\r\n");
      out.write("                                    ng-repeat=\"item in BacSis\" ng-value=\"item.bacSi_Id\">{{item.hoTen}}\r\n");
      out.write("                                 </option>\r\n");
      out.write("                              </select>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                           <label class=\"col-sm-3 control-label\">Thời gian khám</label><label class=\"col-sm-3 control-label\">{{thoiGianBatDau | date:' h:mma'}} -> {{thoiGianKetThuc | date:' h:mma'}}</label>\r\n");
      out.write("                           <!-- <input type=\"hidden\" id=\"caKham_Id\" name=\"caKham_Id\" value=\"1\" /> -->\r\n");
      out.write("                           <input type=\"hidden\" id=\"caKham_Id\" name=\"caKham_Id\" value=\"{{caKham[0].caKham_Id}}\" ng-model=\"caKham[0].caKham_Id\" />\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                           <label class=\"col-sm-3 control-label\"></label>\r\n");
      out.write("                           <div class=\"col-sm-4\">\r\n");
      out.write("                              <button type=\"submit\" id=\"submit\" class=\"btn btn-success\">Xác\r\n");
      out.write("                              nhận đặt lịch</button>\r\n");
      out.write("                           </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                     </form>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
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
