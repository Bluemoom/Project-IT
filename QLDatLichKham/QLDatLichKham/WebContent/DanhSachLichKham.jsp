<%@page import="dao.*"%>
<%@page import="model.*"%>
<%@page import="java.util.*"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
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

<link href="css/styles.css" rel="stylesheet" />

<link href="css/bootstrap.min.css" rel="stylesheet" media="screen" />

<link href="css/customize.css" rel="stylesheet" media="screen" />

<link href="css/font-awesome.min.css" rel="stylesheet" media="screen" />

<link href="css/footer-basic-centered.css" rel="stylesheet"
	media="screen" />

<script src="js/angular.min.js"></script>
<!--Demo-->
</head>
<body>
	<%
		DateFormat dateFormat0 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		DateFormat dateFormat = new SimpleDateFormat("HH:mm");
		DateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
		PhieuDatLichDAO phieuDatLichDAO = new PhieuDatLichDAOIpml();
		int benhNhanId = 100000;
		List<PhieuDatLich> lst = phieuDatLichDAO.findPhieuDatLichByBenhNhan(benhNhanId);

		List<Object[]> list = (List<Object[]>) phieuDatLichDAO.findLichKhamByBenhNhan(benhNhanId);

		List<LichKham> listLichKham = new ArrayList<LichKham>();
		for (Object o[] : list) {
			PhieuDatLich p = (PhieuDatLich) o[0];
			CaKham caKham = (CaKham) o[1];
			LichBieu l = (LichBieu) o[2];
			PhongKham pk = (PhongKham) o[3];
			BacSi b = (BacSi) o[4];
			LichKham temp = new LichKham();
			temp.setLichKhamId(p.getPhieuDatLich_Id());
			temp.setNgayKham(l.getNgayLam());
			temp.setBuoiKham(l.getBuoiLam());
			temp.setTenPhongKham(pk.getTenPhongKham());
			temp.setViTriPhongKham(pk.getDiaDiem());
			temp.setThoiGianBatDau(caKham.getThoiGianBatDau());
			temp.setThoiGianKetThuc(caKham.getThoiGianKetThuc());
			temp.setChiPhi(500000);
			temp.setHinhThucThanhToan(p.getHinhThucThanhToan());
			temp.setBacSiKham(b.getHoTen());
			temp.setTrangThai(p.getTrangThai());
			listLichKham.add(temp);
		}
	%>
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
				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>Mã đặt lịch</th>
								<th>Ngày khám</th>
								<th>Buổi khám</th>
								<th>Thời gian khám</th>
								<th>Phòng khám</th>
								<th>Bác sĩ khám</th>
								<th>Tùy chọn</th>
							</tr>
						</thead>
						<tbody>
							<%
								for (LichKham lk : listLichKham) {
							%>
							<!-- Modal hủy lịch khám -->
							<div class="modal fade" id="myModal" role="dialog">
								<div class="modal-dialog modal-sm">
									<!-- Modal content-->
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal">&times;</button>
											<h4 class="modal-title">XN</h4>
										</div>
										<div class="modal-body">
											<p>Hủy lịch khám này?</p>
										</div>
										<div class="modal-footer">
											<a class="btn btn-danger"
												href="DatLichController?command=delete&phieuDatLich_Id=<%=lk.getLichKhamId()%>"
												role="button">Hủy lịch</a>
											<button type="button" class="btn btn-default"
												data-dismiss="modal">Trở lại</button>
										</div>
									</div>
								</div>
							</div>
							<!-- Modal Chi tiết lịch khám -->
							<div class="modal fade" id="myModal2" role="dialog">
								<div class="modal-dialog">
									<!-- Modal content-->
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal">&times;</button>
											<h4 class="modal-title">Chi tiết lịch khám</h4>
										</div>
										<div class="modal-body">
										<div class="row">											
											<label class="col-sm-4 control-label">Mã đặt lịch</label><label
												class="col-sm-4 control-label"><%=lk.getLichKhamId()%></label>
												</div>
												<div class="row">
											<label class="col-sm-4 control-label">Ngày Khám</label><label
												class="col-sm-4 control-label"><%=dateFormat2.format(lk.getNgayKham())%></label>
												</div>
												<div class="row">
											<label class="col-sm-4 control-label">Buổi Khám</label><label
												class="col-sm-4 control-label"><%=(lk.getBuoiKham() == 0) ? "Sáng" : "Chiều"%></label>
												</div>
												<div class="row">
											<label class="col-sm-4 control-label">Tên phòng khám</label><label
												class="col-sm-4 control-label"><%=lk.getTenPhongKham()%></label>
												</div>
												<div class="row">
											<label class="col-sm-4 control-label">Vị trí phòng
												khám</label><label class="col-sm-3 control-label"><%=lk.getViTriPhongKham()%></label>
												</div>
												<div class="row">
											<label class="col-sm-4 control-label">Bác Sĩ</label><label
												class="col-sm-4 control-label"><%=lk.getBacSiKham()%></label>
												</div>
												<div class="row">
											<label class="col-sm-4 control-label">Thời gian</label><label
												class="col-sm-4 control-label"><%=dateFormat.format(lk.getThoiGianBatDau())%>
												-> <%=dateFormat.format(lk.getThoiGianKetThuc())%></label> 
												</div>
												<div class="row">
												<label class="col-sm-4 control-label">Chi Phí</label><label
												class="col-sm-4 control-label"><%=lk.getChiPhi()%></label>
												</div>
												<div class="row">
												<label class="col-sm-4 control-label">Thanh toán</label><label
												class="col-sm-4 control-label"><%=(lk.getHinhThucThanhToan() == 0) ? "Chưa thanh toán" : "Đã thanh toán"%></label>
												</div>
												<div class="row">
											<label class="col-sm-4 control-label">Trạng thái</label><label
												class="col-sm-4 control-label"><%=(lk.getTrangThai() == 0) ? "Đã Khám" : "Chưa Khám"%></label>
												</div>
										</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-default"
												data-dismiss="modal">Đóng</button>
										</div>
									</div>
								</div>
							</div>

							<tr>
								<td><%=lk.getLichKhamId()%></td>
								<td><%=lk.getNgayKham()%></td>
								<td><%=(lk.getBuoiKham() == 0) ? "Sáng" : "Chiều"%></td>
								<td><%=dateFormat.format(lk.getThoiGianBatDau())%> -> <%=dateFormat.format(lk.getThoiGianKetThuc())%></td>
								<td><%=lk.getTenPhongKham()%></td>
								<td><%=lk.getBacSiKham()%></td>
								<td>
									<button type="button" class="btn btn-danger"
										data-toggle="modal" data-target="#myModal">Hủy</button>
									<button type="button" class="btn btn-success"
										data-toggle="modal" data-target="#myModal2">Chi tiết</button>
									<a class="btn btn-info" th:href="#" role="button">Kết luận</a>
								</td>
							</tr>
							<% } %>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<!-- footer -->
		<%@include file="Footer.jsp"%>
		<script src="js/bootstrap.min.js"></script>
</body>
</html>
