package dao;

import java.util.*;
import model.*;

public interface PhongKhamDAO {
	
	List<PhongKham> findPhongKhamByDichVuIdAndNgayKhamAndBuoiKham(String dichVuId, Date ngayKham, int buoiKham);

	List<PhongKham> findPhongKhamByLichBieu(Date ngayKham, int buoiKham, int bacSiId);

}
