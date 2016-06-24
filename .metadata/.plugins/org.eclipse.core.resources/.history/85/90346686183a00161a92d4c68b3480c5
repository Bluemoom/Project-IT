<%@page import="model.BenhNhan"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
   
<%
	BenhNhan bn = (BenhNhan) session.getAttribute("currentUser");
%>   
<div id="header">
	<div>
		<div>
			<span>Đảm bảo sức khỏe sinh sản phụ nữ...</span> <a href="index.jsp"
			class="logo"><img src="images/logo.png" alt=""></a> <span
			class="tagline">Làm mẹ là điều tuyệt vời nhất!</span>
		</div>
		<ul>
			<li class="selected"><a href="index.jsp">Trang chủ</a></li>
			<li><a href="about.jsp">Giới thiệu</a></li>
			<li><a href="doctors.jsp">Bác sĩ</a></li>
			<li><a href="services.jsp">Dịch vụ</a></li>
			<% if (bn == null) %>
				<li><a href="forms.jsp">Đăng ký</a></li>
			<li><a href="contact.jsp">Liên hệ</a></li>
			<% if (bn == null) %>
				<li><a href="blog.jsp">Đăng nhập</a></li>
			<% if (bn != null) { %>
				<h2>Xin chào, <%=bn.getHoTen() %></h2>
				<a style="font-size: 24px" href="DangNhapServlet?command=dangxuat">Đăng xuất</a>
			<% } %>	
		</ul>
	</div>
</div>
