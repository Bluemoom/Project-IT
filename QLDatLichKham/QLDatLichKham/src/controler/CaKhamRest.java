package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.CaKhamDAO;
import dao.CaKhamDAOImpl;
import model.*;

@WebServlet("/CaKhamRest")
public class CaKhamRest extends HttpServlet {
	CaKhamDAO caKhamDAO = new CaKhamDAOImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		if(command.equalsIgnoreCase("findCaKhamByLichBieu")) {
			String ngayKham = request.getParameter("ngayKham");
			DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
			Date ngayKhamConveter = null;
			try {
				ngayKhamConveter = (Date) df.parse(ngayKham);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			int buoiKham = Integer.parseInt(request.getParameter("buoiKham"));
			String phongKhamId = request.getParameter("phongKhamId");
			List<CaKham> results = caKhamDAO.findCaKhamByLichBieu(ngayKhamConveter, buoiKham, phongKhamId);
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
