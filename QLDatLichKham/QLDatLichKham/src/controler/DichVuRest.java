package controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.DichVuDAO;
import dao.DichVuDAOImpl;
import model.DichVu;
import java.util.*;


@WebServlet("/DichVuRest")
public class DichVuRest extends HttpServlet {
	DichVuDAO dichVuDAO = new DichVuDAOImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		if(command.equalsIgnoreCase("getAllDichVu")) {
			List<DichVu> results = dichVuDAO.getAllDichVu();
			response.setContentType("application/json");
			response.setCharacterEncoding("utf-8");
			String json = new Gson().toJson(results);
			PrintWriter out = response.getWriter();
			out.print(json);
			out.flush();
		}		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
