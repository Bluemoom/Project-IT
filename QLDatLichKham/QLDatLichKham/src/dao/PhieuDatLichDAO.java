package dao;

import java.util.List;

import model.PhieuDatLich;

public interface PhieuDatLichDAO {
	
	int addNewPhieuDatLich(PhieuDatLich phieuDatLich);
	
	int updatePhieuDatLich(PhieuDatLich phieuDatLich);
	
	int deletePhieuDatLich(int phieuDatLichId);
	
	List<PhieuDatLich> findPhieuDatLichByBenhNhan(int benhNhanId);
	
	PhieuDatLich findLastestPhieuDatLichByBenhNhan(int benhNhanId);

}
