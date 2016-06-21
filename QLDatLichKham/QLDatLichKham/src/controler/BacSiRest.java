package controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.*;
import model.*;

@WebServlet("/BacSiRest")
public class BacSiRest extends HttpServlet {

	BacSiDAOImpl bacSiDAOImpl = new BacSiDAOImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<BacSi> results = null;
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
		case "findBacSiByDichVuIdAndNgayKhamAndBuoiKham":
			String dichVuId = request.getParameter("dichVuId");
			results = bacSiDAOImpl.findBacSiByDichVuIdAndNgayKhamAndBuoiKham(dichVuId, ngayKhamConveter, buoiKham);
			break;
		case "findBacSiByLichBieu":
			String phongKhamId = request.getParameter("phongKhamId");
			results = bacSiDAOImpl.findBacSiByLichBieu(ngayKhamConveter, buoiKham, phongKhamId);
			break;
		}

		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		String json = new Gson().toJson(results);
		PrintWriter out = response.getWriter();
		out.print(json);
		out.flush();
		// out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
