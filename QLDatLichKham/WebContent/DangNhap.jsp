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
		String err_dangnhap = "";
 		if (request.getAttribute("err_dangnhap")!=null)
 		{
			err_dangnhap = (String) request.getAttribute("err_dangnhap");
 		}
 		String err_dangnhap1 = "";
 		if (request.getAttribute("err_dangnhap1")!=null)
 		{
			err_dangnhap1 = (String) request.getAttribute("err_dangnhap1");
 		}
 		String err_dangnhap2 = "";
 		if (request.getAttribute("err_dangnhap2")!=null)
 		{
			err_dangnhap2 = (String) request.getAttribute("err_dangnhap2");
 		}
	%>
     <jsp:include page="header1.jsp"></jsp:include>
      <div class="container">
         <div class="row">
         	<div class="contentleft col-md-10">
					<div class="contentleft col-md-10" ng-app="myApp"
						ng-controller="customersCtrl">
						<h3>Đăng Nhập</h3>
						<div class="datlich">
							<form class="form-horizontal" action="DangNhapServlet" method="post">
							 	<input id="command" type="hidden" name="command" value="dangnhap"/>
								<p style="color: red"><%=err_dangnhap%></p>
								<div class="form-group">
									<label class="col-sm-3 control-label">Nhập mã bệnh nhân của bạn:</label>
									<div class="col-sm-4">
										<input type="text" placeholder="Mã bệnh nhân..." class='form-control' 
										name="benhNhan_Id" required=""/>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Nhập mã Pin của bạn:</label>
									<div class="col-sm-4">
										<input type="text" placeholder="Mã pin..." class='form-control' 
										name="mapin" required=""/>
									</div>
								</div>								
								<div class="form-group">
									<label class="col-sm-3 control-label"></label>
									<div class="col-sm-4">	
										<button type="submit" class="btn btn-success">Đăng nhập</button>
									</div>
								</div>
							</form>
						</div>
						<button class="btn btn-primary" type="button" name="button" id="button" style="margin-top: 60px ;width: 200px; height: 40px">
						Đăng nhập dành cho thu ngân</button>
						
						<div class="datlich">
							<form class="form-horizontal" action="ThuNganController" method="post">
							 	<input id="command" type="hidden" name="command" value="dangnhap"/>
								<p style="color: red"><%=err_dangnhap1%></p>
								<div class="form-group">
									<label class="col-sm-3 control-label">UserName:</label>
									<div class="col-sm-4">
										<input type="text" placeholder="UserName..." class='form-control' 
										name="userName" required=""/>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">PassWord:</label>
									<div class="col-sm-4">
										<input type="text" placeholder="PassWord..." class='form-control' 
										name="passWord" required=""/>
									</div>
								</div>								
								<div class="form-group">
									<label class="col-sm-3 control-label"></label>
									<div class="col-sm-4">	
										<button type="submit" class="btn btn-success">Đăng nhập</button>
									</div>
								</div>
							</form>
						</div>
						
						<button class="btn btn-primary" type="button" name="button" id="button" style="margin-top: 60px ;width: 200px; height: 40px">
						Đăng nhập dành cho bác sĩ</button>
						<div class="datlich">
							<form class="form-horizontal" action="BacSiRest" method="post">
							 	<input id="command" type="hidden" name="command" value="dangnhap"/>
								<p style="color: red"><%=err_dangnhap2%></p>
								<div class="form-group">
									<label class="col-sm-3 control-label">UserName:</label>
									<div class="col-sm-4">
										<input type="text" placeholder="UserName..." class='form-control' 
										name="userName" required=""/>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">PassWord:</label>
									<div class="col-sm-4">
										<input type="text" placeholder="PassWord..." class='form-control' 
										name="passWord" required=""/>
									</div>
								</div>								
								<div class="form-group">
									<label class="col-sm-3 control-label"></label>
									<div class="col-sm-4">	
										<button type="submit" class="btn btn-success">Đăng nhập</button>
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