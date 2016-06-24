package controler;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BenhNhanDAO;
import dao.BenhNhanDAOImpl;
import model.BenhNhan;

@WebServlet("/DangKyController")
public class DangKyController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BenhNhanDAO bna = new BenhNhanDAOImpl();
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String hoTen = request.getParameter("hoten");
		String ngaySinh = request.getParameter("ngaysinh");
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date ngaySinhConveter = null;
		try {
			ngaySinhConveter = (Date)df.parse(ngaySinh);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Integer gioiTinh = Integer.parseInt(request.getParameter("gioitinh"));
		String cmnd = request.getParameter("CMND");
		String sdt = request.getParameter("SDT");
		String email = request.getParameter("email");
		String diaChi = request.getParameter("diachi");
		String url = "DangKy.jsp";
		String err = null;
		if (bna.checkEmail(email)) {
			err = "Email ða ton tai!";
			request.setAttribute("err", err);
		} else {

			BenhNhan benhnhan = new BenhNhan(hoTen, ngaySinhConveter, gioiTinh, cmnd, sdt, email, diaChi, 0);
			bna.themBenhNhan(benhnhan);
			url = "ThemMoi.jsp";
			session.setAttribute("currentUser", bna.getLastBenhNhan());

		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
		;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
