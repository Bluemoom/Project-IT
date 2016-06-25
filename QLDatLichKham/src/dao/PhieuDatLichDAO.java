package dao;

import java.util.List;

import model.PhieuDatLich;

public interface PhieuDatLichDAO {
	
	int addNewPhieuDatLich(PhieuDatLich phieuDatLich);
	
	int updatePhieuDatLich(PhieuDatLich phieuDatLich);
	
	int deletePhieuDatLich(int phieuDatLichId);
	
	List<PhieuDatLich> findPhieuDatLichByBenhNhan(int benhNhanId);
	
	PhieuDatLich findLastestPhieuDatLichByBenhNhan(int benhNhanId);
	
	List<Object[]> findLichKhamByBenhNhan(int benhNhanId);
	
	PhieuDatLich findPhieuDatLichById(int phieuDatLichId);
	
	void updatePhieuDatLich(float phieuDatLich_Id, float phiDatLich, int hinhThucThanhToan);
	
	List<PhieuDatLich> showListPhieuDatLich();

}
