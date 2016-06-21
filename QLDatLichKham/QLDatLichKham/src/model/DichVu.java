package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "DICHVU")
public class DichVu {
	@Id
	private String dichVu_Id;
	@Column(name = "TENDICHVU")
	private String tenDichVu;
	@Column(name="MOTA")
	private String moTa;
	@Column(name="THOIGIANKHAM")
	private int thoiGianKham;
	@Column(name="CHIPHI")
	private float chiPhi;
	@Column(name="TRANGTHAI")
	private int trangThai;
	public DichVu() {
	}
	public DichVu(String dichVu_Id, String tenDichVu, String moTa,
			int thoiGianKham, float chiPhi, int trangThai) {
		this.dichVu_Id = dichVu_Id;
		this.tenDichVu = tenDichVu;
		this.moTa = moTa;
		this.thoiGianKham = thoiGianKham;
		this.chiPhi = chiPhi;
		this.trangThai = trangThai;
	}
	public String getDichVu_Id() {
		return dichVu_Id;
	}
	public void setDichVu_Id(String dichVu_Id) {
		this.dichVu_Id = dichVu_Id;
	}
	public String getTenDichVu() {
		return tenDichVu;
	}
	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public int getThoiGianKham() {
		return thoiGianKham;
	}
	public void setThoiGianKham(int thoiGianKham) {
		this.thoiGianKham = thoiGianKham;
	}
	public float getChiPhi() {
		return chiPhi;
	}
	public void setChiPhi(float chiPhi) {
		this.chiPhi = chiPhi;
	}
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
}
