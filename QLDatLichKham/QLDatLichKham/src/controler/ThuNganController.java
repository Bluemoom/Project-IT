package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ThuNganDAO;
import dao.ThuNganDAOImpl;
import model.ThuNgan;


@WebServlet("/ThuNganController")
public class ThuNganController extends HttpServlet {
	
	ThuNganDAO tna = new ThuNganDAOImpl();
       
    public ThuNganController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String command = request.getParameter("command");
		String url = "DangNhap.jsp";
		if (command.equalsIgnoreCase("dangnhap"))
		{		
			String userName = request.getParameter("userName");
			String passWord = request.getParameter("passWord");
			ThuNgan tn = new ThuNgan();
			tn = (ThuNgan) tna.checkLogin(userName, passWord);
			if (tn != null)
			{
				url = "ThuNgan.jsp";
			}
			else {
				String err_dangnhap1 = "UserName hoac password khong dung!";
				request.setAttribute("err_dangnhap1", err_dangnhap1);
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
