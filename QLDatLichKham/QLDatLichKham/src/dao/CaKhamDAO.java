package dao;

import java.util.Date;
import java.util.List;
import model.*;

public interface CaKhamDAO {
	
	List<CaKham> findCaKhamByLichBieu(Date ngayLam, int buoiLam, String phongKhamId);
	
	List<CaKham> findCaKhamByBacSi(Date ngayLam, int buoiLam, int bacSiId);
	
	CaKham findCaKhamById(int caKhamId);
	
	int updateCaKham(int caKhamId, int trangThai);

}
