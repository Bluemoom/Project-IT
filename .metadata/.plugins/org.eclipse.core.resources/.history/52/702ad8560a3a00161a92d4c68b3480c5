<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html  >
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Đăng ký</title>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script
	src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js"></script>

<link href="css/styles.css" rel="stylesheet"/>

<link href="css/bootstrap.min.css" rel="stylesheet" media="screen" />

<link href="css/customize.css" rel="stylesheet" media="screen" />

<link href="css/font-awesome.min.css" rel="stylesheet" media="screen" />

<link href="css/footer-basic-centered.css" rel="stylesheet"
	media="screen" />

<script src="js/angular.min.js"></script>

<!--Demo-->
<link rel='stylesheet prefetch'
	href='http://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css' />
<script src="js/prefixfree.min.js"></script>

</head>

<body>
	<div class="container">
		<!-- Main menu -->
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">HN Hospital</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#">Trang chủ</a></li>
						<li><a href="#">Liên hệ</a></li>
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Dịch vụ<span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">Hoạt đông</a></li>
								<li><a href="#">Đăng ký khám trực tuyến</a></li>
							</ul></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li class="active"><a href="../navbar-static-top/">Đăng
								nhập</a></li>
						<li><a href="../navbar-fixed-top/">Đăng ký</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
			<!--/.container-fluid -->
		</nav>
		<!-- SiderBar -->
		<div id="carousel-example-generic" class="carousel slide"
			data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#carousel-example-generic" data-slide-to="0"
					class="active"></li>
				<li data-target="#carousel-example-generic" data-slide-to="1"></li>
				<li data-target="#carousel-example-generic" data-slide-to="2"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="images/b3.jpg" alt="..." />
					<div class="carousel-caption">Projec IT</div>
				</div>
				<div class="item">
					<img src="images/b3.jpg" alt="..." />
					<div class="carousel-caption">Banner2</div>
				</div>

				<div class="item">
					<img src="images/b3.jpg" alt="..." />
					<div class="carousel-caption">Banner3</div>
				</div>
				...
			</div>

			<!-- Controls -->
			<a class="left carousel-control" href="#carousel-example-generic"
				role="button" data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#carousel-example-generic"
				role="button" data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
		<div class="container">
			<div class="row">
				<div class="contentright col-md-2">
					<ul class="nav nav-pills nav-stacked">
						<li role="presentation" class="active"><a href="#">Thông
								tin cá nhân</a></li>
						<li role="presentation"><a href="add_schedule.html">Đặt
								mới lịch khám</a></li>
						<li role="presentation"><a href="schedule_list.html">Danh
								sách lịch khám</a></li>
					</ul>
				</div>

				<div class="contentleft col-md-10">
					<div class="contentleft col-md-10" ng-app="myApp"
						ng-controller="customersCtrl">
						<h3>Đăng ký</h3>
						<div class="datlich">
							<form class="form-horizontal" action="RegisterServlet" method="post">
								<div class="form-group">
									<label class="col-sm-3 control-label">Họ tên</label>
									<div class="col-sm-4">
										<input type="text" placeholder="Họ tên..." class='form-control', 
										name="hoten", required=""/>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label ">Ngày sinh</label>
									<div class="col-sm-3">
										<input type='text' ng-model='course.date' class='form-control'
											data-date-format="dd-mm-yyyy"
											placeholder="Ngày sinh..." required="" id="check-out" name="ngaysinh" />
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
										<input type='text' class='form-control', name="CMND",
											placeholder="CMND..." required="" id="CMND" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Số điện thoại</label>
									<div class="col-sm-4">
										<input type='text' class='form-control', name="SDT",
											placeholder="Số điện thoại..." required="" id="SDT" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Email</label>
									<div class="col-sm-4">
										<input type="email" class='form-control', name="email",
											placeholder="Email..." required="" id="email" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Địa chỉ</label>
									<div class="col-sm-4">
										<input type='text' class='form-control', name="diachi",
											placeholder="Địa chỉ..." required="" id="diachi" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label"></label>
									<div class="col-sm-4">	
										<button type="submit" class="btn btn-success">Đăng ký</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- footer -->
		<footer class="footer-basic-centered">

			<p class="footer-company-motto">Footer - project - it - 2016</p>

			<p class="footer-links">
				<a href="#">Home</a> · <a href="#">Blog</a> · <a href="#">Pricing</a>
				· <a href="#">About</a> · <a href="#">Faq</a> · <a href="#">Contact</a>
			</p>

			<p class="footer-company-name">Company Name &copy; 2015</p>

		</footer>

	</div>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
</body>
</html>
