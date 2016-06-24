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
<link rel="stylesheet" href="css/style.css" type="text/css" />
<script src="js/angular.min.js"></script>
<!--Demo-->
</head>
<body>
	<%
		DateFormat dateFormat0 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		DateFormat dateFormat = new SimpleDateFormat("HH:mm");
		DateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
		PhieuDatLichDAO phieuDatLichDAO = new PhieuDatLichDAOIpml();
		List<PhieuDatLich> lsst = phieuDatLichDAO.showListPhieuDatLich();
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
	<jsp:include page="header1.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<div class="contentright col-md-2">
				<ul class="nav nav-pills nav-stacked">
					<li role="presentation" class="active"><a href="#">Danh
							sách phiếu đặt lịch</a></li>
				</ul>
			</div>
			<div class="contentleft col-md-10">
				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>Mã đặt lịch</th>
								<th>Mã phòng khám</th>
								<th>Mã bệnh nhân</th>
								<th>Mã ca khám</th>
								<th>Phí đặt lịch</th>
								<th>Chi phí</th>
								<th>Thanh Toan</th>
								<th>Trang thai</th>
								<th>Tùy chọn</th>
							</tr>
						</thead>
						<tbody>
							<%
								for (PhieuDatLich lk : lsst) {
							%>
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
											<form action="PhieuDatLichController" method="POST">
												<div class="row">
													<label class="col-sm-4 control-label">Mã phiếu đặt
														lịch</label><label class="col-sm-4 control-label"><%=lk.getPhieuDatLich_Id()%></label>
												</div>
												<div class="row">
													<label class="col-sm-4 control-label">Mã phòng khám</label><label
														class="col-sm-4 control-label"><%=lk.getPhongKham_Id()%></label>
												</div>
												<div class="row">
													<label class="col-sm-4 control-label">Mã bệnh nhân</label><label
														class="col-sm-4 control-label"><%=lk.getBenhNhan_Id()%></label>
												</div>
												<div class="row">
													<label class="col-sm-4 control-label">Mã ca khám</label><label
														class="col-sm-4 control-label"><%=lk.getCaKham_Id()%></label>
												</div>
												<div class="row">
													<label class="col-sm-4 control-label">Chi Phí</label>
													<div class="col-sm-4">
														<input type="text" placeholder="Chi phí..."
															class='form-control' value=<%=lk.getChiPhi()%> /> <input
															type="hidden" name="phieudatlich_id" class="form-control"
															name="chiPhi" value=<%=lk.getChiPhi()%>>
													</div>
												</div>
												<div class="row">
													<label class="col-sm-4 control-label">Phí hàng đợi</label>
													<div class="col-sm-4">
														<input type="text" placeholder="Chi phí..."
															class='form-control' value=<%=lk.getPhiDatLich()%> />

													</div>
												</div>
												<input type="hidden" name="command" class="form-control"
													value="capnhat"> <input type="hidden"
													name="phieudatlich_id" class="form-control"
													value=<%=lk.getPhieuDatLich_Id()%>>
												<div class="modal-footer">
													<button type="submit" class="btn btn-success">Thanh
														Toán</button>
													<button type="button" class="btn btn-default"
														data-dismiss="modal">Đóng</button>
												</div>
											</form>
										</div>

									</div>
								</div>
							</div>

							<tr>
								<td><%=lk.getPhieuDatLich_Id()%></td>
								<td><%=lk.getPhongKham_Id()%></td>
								<td><%=lk.getBenhNhan_Id()%></td>
								<td><%=lk.getCaKham_Id()%></td>
								<td><%=lk.getPhiDatLich()%></td>
								<td><%=lk.getChiPhi()%></td>
								<%
									if (lk.getHinhThucThanhToan() == 0) {
								%>
								<td>Chưa thanh toán</td>
								<%
									} else if (lk.getHinhThucThanhToan() == 1) {
								%>
								<td>Đã thanh toán</td>
								<%
									} else {
								%>
								<td>Đi trễ</td>
								<%
									}
								%>
								<%
									if (lk.getTrangThai() == 0) {
								%>
								<td>Chưa khám</td>
								<%
									} else {
								%>
								<td>Đã khám</td>
								<%
									}
								%>
								<td>
									<button type="button" class="btn btn-success"
										data-toggle="modal" data-target="#myModal2">Chi tiết</button>
								</td>
							</tr>
							<% } %>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<!-- footer -->
		<jsp:include page="footer1.jsp"></jsp:include>
		<script src="js/bootstrap.min.js"></script>
</body>
</html>