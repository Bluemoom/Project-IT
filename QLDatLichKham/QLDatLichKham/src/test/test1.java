package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.google.gson.Gson;

import dao.BacSiDAOImpl;
import dao.BenhNhanDAO;
import dao.BenhNhanDAOImpl;
import dao.CaKhamDAO;
import dao.CaKhamDAOImpl;
import dao.DichVuDAOImpl;
import dao.PhieuDatLichDAOIpml;
import dao.PhongKhamDAOImpl;
import dao.ThuNganDAOImpl;
import model.BacSi;
import model.BenhNhan;
import model.CaKham;
import model.DichVu;
import model.PhieuDatLich;
import model.PhongKham;
import util.SentMail;

public class test1 {

	public static void main(String[] args) throws Exception {
		
		BacSiDAOImpl bacSiDAOImpl=new BacSiDAOImpl();
		PhongKhamDAOImpl phongKhamDAOImpl = new PhongKhamDAOImpl();
		DichVuDAOImpl dichVuDAOImpl = new DichVuDAOImpl();
		CaKhamDAO caKhamDAO = new CaKhamDAOImpl();
		BenhNhanDAO bna = new BenhNhanDAOImpl();
		ThuNganDAOImpl tna = new ThuNganDAOImpl();
		PhieuDatLichDAOIpml pla = new PhieuDatLichDAOIpml();
		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String ngayLam = "01-06-2016";
        Date ngayKhamAfter = df.parse(ngayLam); 
//		List<BacSi> lst = (List<BacSi>) bacSiDAOImpl.findBacSiByDichVuIdAndNgayKhamAndBuoiKham("DV001", ngayKhamAfter, 0);
//      List<PhongKham> lst = phongKhamDAOImpl.findPhongKhamByLichBieu(ngayKhamAfter, 0, 100000);
//      BenhNhan lst = benhNhanDAO.findBenhNhanById(100002);
//        CaKham lst = caKhamDAO.findCaKhamById(1);
//        int result = caKhamDAO.updateCaKham(1,0);
//		String json = new Gson().toJson(lst); 
//		for(BacSi bs : lst)
//		{
//			System.out.println(bs.getHoTen());
//		}	
		System.out.print(tna.checkLogin("vandat", "123456").getUserName());
		
//		SentMail.send("smtp.gmail.com", "phamhongthuan@rocketmail.com", "phamthuannsth@gmail.com", "thuan1714", "Ma dat lich", "Ma dat lich cua ban la: MDL10000001");
//		SentMail.send("smtp.gmail.com", "phamthuannsth@gmail.com", "tq1417@gmail.com", "quyenthuan1714", "Ma dat lich", "Ma dat lich cua ban la: MDL10000001");

	}

}
