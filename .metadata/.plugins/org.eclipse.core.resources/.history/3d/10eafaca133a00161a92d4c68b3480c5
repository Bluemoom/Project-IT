package controler;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.mail.Session;
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

@WebServlet("/BenhNhanController")
public class BenhNhanController extends HttpServlet {
	
	BenhNhanDAOImpl bna = new BenhNhanDAOImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");	
		HttpSession session = request.getSession();
		BenhNhan bn = (BenhNhan) session.getAttribute("currentUser");
		String hoTen = request.getParameter("hoten");
		String ngaySinh = request.getParameter("ngaysinh");
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date ngaySinhConveter = null;
		try {
			ngaySinhConveter = (Date) df.parse(ngaySinh);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Integer gioiTinh = Integer.parseInt(request.getParameter("gioitinh"));
		String cmnd = request.getParameter("CMND");
		String sdt = request.getParameter("SDT");
		String email = request.getParameter("email");
		String diaChi = request.getParameter("diachi");
		bna.updateProfile(bn.getBenhNhan_Id(), hoTen, ngaySinhConveter, gioiTinh, cmnd, sdt, email, diaChi);
		bn = bna.findBenhNhanById(bn.getBenhNhan_Id());
		session.setAttribute("currentUser", bn);
		RequestDispatcher rd = request.getRequestDispatcher("/ThongTinBenhNhan.jsp");
		rd.forward(request, response);
	}

}
