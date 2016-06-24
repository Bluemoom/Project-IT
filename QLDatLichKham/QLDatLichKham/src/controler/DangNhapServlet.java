package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.BenhNhanDAOImpl;
import model.BenhNhan;

@WebServlet("/DangNhapServlet")
public class DangNhapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BenhNhanDAOImpl bna = new BenhNhanDAOImpl();
       
    public DangNhapServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String command = request.getParameter("command");
		String url = request.getScheme() + "://" + request.getServerName()
			+ ":" + request.getServerPort() + request.getContextPath();
		if (command.equalsIgnoreCase("dangxuat"))
		{
			BenhNhan currentUser = (BenhNhan) session.getAttribute("currentUser");
			if (currentUser != null)
			{
				session.invalidate();
				response.sendRedirect(url + "/DangNhap.jsp");
				return;
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String command = request.getParameter("command");
		if (command.equalsIgnoreCase("dangnhap"))
		{
			String url = "DangNhap.jsp";
			String mapin = request.getParameter("mapin");
			BenhNhan bn = new BenhNhan();
			bn = bna.findBenhNhanByMapin(Integer.parseInt(mapin));
			if (bn != null)
			{
				url = "/ThongTinBenhNhan.jsp";
				session.setAttribute("currentUser", bn);
			}
			else {
				String err_dangnhap = "MaPin khong dung!";
				request.setAttribute("err_dangnhap", err_dangnhap);
			}
			RequestDispatcher rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
		}
		else
		{
			BenhNhan currentUser = (BenhNhan) session.getAttribute("currentUser");
			if (currentUser != null)
			{
				session.invalidate();
				response.sendRedirect("/DangNhap.jsp");
				return;
			}
		}
	}
}
