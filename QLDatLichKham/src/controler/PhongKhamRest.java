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

import dao.PhongKhamDAOImpl;
import model.BacSi;
import model.PhongKham;

@WebServlet("/PhongKhamRest")
public class PhongKhamRest extends HttpServlet {
	PhongKhamDAOImpl phongKhamDAOImpl = new PhongKhamDAOImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<PhongKham> results = null;
		String command = request.getParameter("command");
		String ngayKham = request.getParameter("ngayKham");
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date ngayKhamConveter = null;
		try {
			ngayKhamConveter = (Date) df.parse(ngayKham);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int buoiKham = Integer.parseInt(request.getParameter("buoiKham"));
		switch (command) {
		case "findPhongKhamByDichVuIdAndNgayKhamAndBuoiKham":
			String dichVuId = request.getParameter("dichVuId");
			results = phongKhamDAOImpl.findPhongKhamByDichVuIdAndNgayKhamAndBuoiKham(dichVuId, ngayKhamConveter,
					buoiKham);
			break;
		case "findPhongKhamByLichBieu":
			int bacSiId = Integer.parseInt(request.getParameter("bacSiId"));
			results = phongKhamDAOImpl.findPhongKhamByLichBieu(ngayKhamConveter, buoiKham, bacSiId);
			break;
		}

		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		String json = new Gson().toJson(results);
		PrintWriter out = response.getWriter();
		out.print(json);
		out.flush();
		
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
