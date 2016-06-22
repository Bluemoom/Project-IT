package dao;

import java.util.Date;
import java.util.List;
import model.*;

public interface CaKhamDAO {
	
	List<CaKham> findCaKhamByLichBieu(Date ngayLam, int buoiLam, String phongKhamId);
	
	CaKham findCaKhamById(int caKhamId);
	
	int updateCaKham(int caKhamId, int trangThai);

}
