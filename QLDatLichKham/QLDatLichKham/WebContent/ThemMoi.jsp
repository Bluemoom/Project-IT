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
	<%@include file="Header.jsp"%>
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
						<h3>Thêm mới lịch khám</h3>
						<div class="datlich">
							<form class="form-horizontal" method="POST" action="DatLichController">
								<input id="command" type="hidden" name="command" value="addNew"/>
								<div class="form-group">
									<label class="col-sm-3 control-label">Chọn dịch vụ khám</label>
									<div class="col-sm-4">
										<select class="form-control" id="dichVu_Id" name="dichVu_Id" ng-model="maDichVu.dichVu"
											ng-change="loadPhongKham()">
											<option ng-selected="maDichVu.dichVu == item.dichVuId"
												ng-repeat="item in models" ng-value="item.dichVu_Id">{{item.tenDichVu}}
											</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label ">Ngày khám</label>
									<div class="col-sm-3">
										<input type='text' ng-model='course.date' class='form-control'
											ng-change="loadPhongKham()" data-date-format="dd-mm-yyyy"
											placeholder="Ngày khám" required="" id="check-out" />
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Buổi khám</label>
									<div class="col-sm-2">
										<select class="form-control" ng-init="buoiKham = 0"
											name="buoiKham" id="buoiKham" ng-model="data.buoiKham"
											ng-change="loadPhongKham()">
											<option value="0">Sáng</option>
											<option value="1">Chiều</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Phòng khám</label>
									<div class="col-sm-4">
										<select class="form-control" id="phongKham_Id" name="phongKham_Id" ng-model="phongKhamId"
											ng-change="loadBacSiByPhongKham()">
											<option ng-selected="phongKhamId == item.phongKham_Id"
												ng-repeat="item in PhongKhams" ng-value="item.phongKham_Id">{{item.tenPhongKham}}
											</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label" ng-model="bacSiKham">Bác
										sĩ khám</label>
									<div class="col-sm-4">
										<select class="form-control" ng-model="bacSiId"
											ng-change="loadPhongKhamByBacSi()">
											<option ng-selected="bacSiId == item.bacSi_Id"
												ng-repeat="item in BacSis" ng-value="item.bacSi_Id">{{item.hoTen}}
											</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label">Thời gian khám</label><label class="col-sm-3 control-label">{{thoiGianBatDau | date:' h:mma'}} -> {{thoiGianKetThuc | date:' h:mma'}}</label>
									<!-- <input type="hidden" id="caKham_Id" name="caKham_Id" value="1" /> -->
									<input type="hidden" id="caKham_Id" name="caKham_Id" value="{{caKham[0].caKham_Id}}" ng-model="caKham[0].caKham_Id" />
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label"></label>
									<div class="col-sm-4">
										<button type="submit" id="submit" class="btn btn-success">Xác
											nhận đặt lịch</button>
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- footer -->
	<%@include file="Footer.jsp"%>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script src="js/ThemMoi.js"></script>
</body>
</html>
