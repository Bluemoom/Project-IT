package dao;

import java.util.Date;
import java.util.List;

import model.BacSi;
import model.ThuNgan;

public interface BacSiDAO {
	//Thêm 1 BacSi
	public void themBacSi(BacSi bacSi);
	
	//Hiển thị Toàn bộ danh sách BacSi
	public List<BacSi> listAllBacSi();
	
	//Hiển thị danh sách BacSi theo mã phòng
	public List<BacSi> listBacSiByPhongKhamID(String phongKham_Id);
	
	List<BacSi> findBacSiByDichVuIdAndNgayKhamAndBuoiKham(String dichVuId, Date ngayKham, int buoiKham);
	
	List<BacSi> findBacSiByLichBieu(Date ngayKham, int buoiKham, String phongKhamId);
	
	BacSi checkLogin(String username, String password);
}
