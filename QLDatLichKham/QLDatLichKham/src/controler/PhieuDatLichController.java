package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PhieuDatLichDAOIpml;


@WebServlet("/PhieuDatLichController")
public class PhieuDatLichController extends HttpServlet {

	PhieuDatLichDAOIpml pla = new PhieuDatLichDAOIpml();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String command = request.getParameter("command");
		
		if (command.equalsIgnoreCase("capnhat")){
			String phieudatlich_id = request.getParameter("phieudatlich_id");
			String phiHangDoi = request.getParameter("phiHangDoi");			
			pla.updatePhieuDatLich(Integer.parseInt(phieudatlich_id), Integer.parseInt(phiHangDoi), 1);
			RequestDispatcher rd = request.getRequestDispatcher("ThuNgan.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
