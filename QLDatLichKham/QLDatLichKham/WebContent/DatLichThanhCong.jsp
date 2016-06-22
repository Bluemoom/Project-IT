<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html  >
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>Hệ thống đặt lịch và trả kết quả trực tuyến</title>
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
						<li class="dropdown"><a href="#" class="dropdown-toggle"
							data-toggle="dropdown" role="button" aria-haspopup="true"
							aria-expanded="false">Phạm Hồng Thuận<span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#">Thông tin cá nhân</a></li>
								<li><a href="#">Đăng xuất</a></li>
							</ul></li>
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
			<h1>Đặt lịch khám thành công</h1>
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