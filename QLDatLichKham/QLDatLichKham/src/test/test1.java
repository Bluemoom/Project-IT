package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.google.gson.Gson;

import dao.BacSiDAOImpl;
import dao.DichVuDAOImpl;
import dao.PhongKhamDAOImpl;
import model.BacSi;
import model.DichVu;
import model.PhongKham;

public class test1 {

	public static void main(String[] args) throws ParseException {
		
		BacSiDAOImpl bacSiDAOImpl=new BacSiDAOImpl();
		PhongKhamDAOImpl phongKhamDAOImpl = new PhongKhamDAOImpl();
		DichVuDAOImpl dichVuDAOImpl = new DichVuDAOImpl();
		
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		String ngayLam = "01-06-2016";
        Date ngayKhamAfter = df.parse(ngayLam); 
//		List<BacSi> lst = (List<BacSi>) bacSiDAOImpl.findBacSiByDichVuIdAndNgayKhamAndBuoiKham("DV001", ngayKhamAfter, 0);
//     List<PhongKham> lst = phongKhamDAOImpl.findPhongKhamByDichVuIdAndNgayKhamAndBuoiKham("DV001", ngayKhamAfter, 1);
        List<DichVu> lst = dichVuDAOImpl.getAllDichVu();
		String json = new Gson().toJson(lst); 
//		for(BacSi bs : lst)
//		{
//			System.out.println(bs.getHoTen());
//		}	
		System.out.println(json);
		
		
		

	}

}
