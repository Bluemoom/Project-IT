package dao;

import java.util.List;
import model.*;

public interface DichVuDAO {
	List<DichVu> getAllDichVu();
	
	DichVu findDichVuById(String dichVuId);
}
