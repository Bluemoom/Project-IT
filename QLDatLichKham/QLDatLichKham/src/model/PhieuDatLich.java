package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PHIEUDATLICH")
public class PhieuDatLich {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int phieuDatLich_Id;
	@Column(name = "PHONGKHAM_ID")
	private String phongKham_Id;
	@Column(name = "BENHNHAN_ID")
	private int benhNhan_Id;
	@Column(name = "CAKHAM_ID")
	private int caKham_Id;
	@Column(name = "PHIDATLICH")
	private float phiDatLich;
	@Column(name = "CHIPHI")
	private float chiPhi;
	@Column(name = "HINHTHUCTHANHTOAN")
	private String hinhThucThanhToan;
	@Column(name = "TRANGTHAI")
	private int trangThai;

	public PhieuDatLich() {
	}

	public PhieuDatLich(int phieuDatLich_Id, String phongKham_Id,
			int benhNhan_Id, int caKham_Id, float phiDatLich, float chiPhi,
			String hinhThucThanhToan, int trangThai) {
		this.phieuDatLich_Id = phieuDatLich_Id;
		this.phongKham_Id = phongKham_Id;
		this.benhNhan_Id = benhNhan_Id;
		this.caKham_Id = caKham_Id;
		this.phiDatLich = phiDatLich;
		this.chiPhi = chiPhi;
		this.hinhThucThanhToan = hinhThucThanhToan;
		this.trangThai = trangThai;
	}
	
	

	public PhieuDatLich(String phongKham_Id, int benhNhan_Id, int caKham_Id, float phiDatLich, float chiPhi,
			String hinhThucThanhToan, int trangThai) {
		this.phongKham_Id = phongKham_Id;
		this.benhNhan_Id = benhNhan_Id;
		this.caKham_Id = caKham_Id;
		this.phiDatLich = phiDatLich;
		this.chiPhi = chiPhi;
		this.hinhThucThanhToan = hinhThucThanhToan;
		this.trangThai = trangThai;
	}

	public int getPhieuDatLich_Id() {
		return phieuDatLich_Id;
	}

	public void setPhieuDatLich_Id(int phieuDatLich_Id) {
		this.phieuDatLich_Id = phieuDatLich_Id;
	}

	public String getPhongKham_Id() {
		return phongKham_Id;
	}

	public void setPhongKham_Id(String phongKham_Id) {
		this.phongKham_Id = phongKham_Id;
	}

	public int getBenhNhan_Id() {
		return benhNhan_Id;
	}

	public void setBenhNhan_Id(int benhNhan_Id) {
		this.benhNhan_Id = benhNhan_Id;
	}

	public int getCaKham_Id() {
		return caKham_Id;
	}

	public void setCaKham_Id(int caKham_Id) {
		this.caKham_Id = caKham_Id;
	}

	public float getPhiDatLich() {
		return phiDatLich;
	}

	public void setPhiDatLich(float phiDatLich) {
		this.phiDatLich = phiDatLich;
	}

	public float getChiPhi() {
		return chiPhi;
	}

	public void setChiPhi(float chiPhi) {
		this.chiPhi = chiPhi;
	}

	public String getHinhThucThanhToan() {
		return hinhThucThanhToan;
	}

	public void setHinhThucThanhToan(String hinhThucThanhToan) {
		this.hinhThucThanhToan = hinhThucThanhToan;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

}
