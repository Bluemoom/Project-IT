<%@page import="model.BenhNhan"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html  >
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
   <head>
      <meta charset="utf-8" />
      <meta http-equiv="X-UA-Compatible" content="IE=edge" />
      <meta name="viewport" content="width=device-width, initial-scale=1" />
      <title>Hệ thống đặt lịch và trả kết quả trực tuyến</title>
      <link href="css/styles.css" rel="stylesheet"/>
      <link href="css/jquery-ui.css" rel="stylesheet"/>
      <link href="css/bootstrap.min.css" rel="stylesheet" media="screen" />
      <link href="css/customize.css" rel="stylesheet" media="screen" />
      <link href="css/font-awesome.min.css" rel="stylesheet" media="screen" />
      <link href="css/footer-basic-centered.css" rel="stylesheet"
         media="screen" />
      <link rel="stylesheet" href="css/style.css" type="text/css" />
      <script src="js/angular.min.js"></script>
      <script src="js/jquery.min.js"></script>

      <!--Demo-->
      <script src="js/prefixfree.min.js"></script>
   </head>
   <body>
   	<%
 		BenhNhan bn = (BenhNhan) session.getAttribute("currentUser");
	%>
     <jsp:include page="header1.jsp"></jsp:include>
      <div class="container">
         <div class="row">
         	<div class="contentright col-md-2">
               <ul class="nav nav-pills nav-stacked">
                  <li role="presentation" class="active"><a href="#">Thông
                     tin cá nhân</a>
                  </li>
                  <li role="presentation"><a href="add_schedule.html">Đặt
                     mới lịch khám</a>
                  </li>
                  <li role="presentation"><a href="schedule_list.html">Danh
                     sách lịch khám</a>
                  </li>
               </ul>
            </div>
            <div class="contentleft col-md-10">
					<div class="contentleft col-md-10" ng-app="myApp"
						ng-controller="customersCtrl">
						<h3>Thông tin bệnh nhân</h3>
						<div class="datlich">
							<form class="form-horizontal" action="BenhNhanController" method="post">
								<div class="form-group">
									<label class="col-sm-3 control-label">Họ tên</label>
									<div class="col-sm-4">
										<input type="text" placeholder="Họ tên..." class='form-control' 
										name="hoten" required="" value=<%=bn.getHoTen() %>>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label ">Ngày sinh</label>
									<div class="col-sm-3">
										<input type='text' ng-model='course.date' class='form-control'
											data-date-format="dd-mm-yyyy" value=<%=bn.getNgaySinh() %>
											placeholder="Ngày sinh..." required="" id="check-out" name="ngaysinh">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Giới tính</label>
									<div class="col-sm-2">
										<select class="form-control"
											name="gioitinh" id="gioitinh">
											<option value="0">Nam</option>
											<option value="1">Nữ</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">CMND</label>
									<div class="col-sm-4">
										<input type='text' class='form-control' name="CMND",
											placeholder="CMND..." required="" id="CMND" value=<%=bn.getCmnd() %> />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Số điện thoại</label>
									<div class="col-sm-4">
										<input type='text' class='form-control' name="SDT"
											placeholder="Số điện thoại..." required="" id="SDT" value=<%=bn.getSdt() %> />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Email</label>
									<div class="col-sm-4">
										<input type="email" class='form-control' name="email",
											placeholder="Email..." required="" id="email" value=<%=bn.getEmail() %>>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Địa chỉ</label>
									<div class="col-sm-4">
										<input type='text' class='form-control' name="diachi",
											placeholder="Địa chỉ..." required="" id="diachi" value=<%=bn.getDiaChi() %>>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Mã Pin</label>
									<div class="col-sm-4">
										<input type='text' class='form-control' name="maPin",
											placeholder="Địa chỉ..." required="" id="maPin" value=<%=bn.getMaPin() %>>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label"></label>
									<div class="col-sm-4">	
										<button type="submit" class="btn btn-success">Cập Nhật</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
         </div>
      </div>
      <!-- footer -->
     <jsp:include page="footer1.jsp"></jsp:include> 
      <script src="js/bootstrap.min.js"></script>
      <script src="js/bootstrap-datepicker.js"></script>
      <script src="js/ThemMoi.js"></script>
   </body>
</html>