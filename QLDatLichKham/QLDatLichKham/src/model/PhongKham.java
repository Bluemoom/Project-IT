package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PHONGKHAM")
public class PhongKham {
	@Id
	@Column(name ="PHONGKHAM_ID")
	private String phongKham_Id;
	@Column(name = "DICHVU_ID")
	private String dichVu_Id;
	@Column(name = "TENPHONGKHAM")
	private String tenPhongKham;
	@Column(name = "DIADIEM")
	private String diaDiem;
	@Column(name = "TRANGTHAI")
	private int trangThai;

	public PhongKham() {
	}

	public PhongKham(String phongKham_Id, String dichVu_Id,
			String tenPhongKham, String diaDiem, int trangThai) {
		this.phongKham_Id = phongKham_Id;
		this.dichVu_Id = dichVu_Id;
		this.tenPhongKham = tenPhongKham;
		this.diaDiem = diaDiem;
		this.trangThai = trangThai;
	}

	public String getPhongKham_Id() {
		return phongKham_Id;
	}

	public void setPhongKham_Id(String phongKham_Id) {
		this.phongKham_Id = phongKham_Id;
	}

	public String getDichVu_Id() {
		return dichVu_Id;
	}

	public void setDichVu_Id(String dichVu_Id) {
		this.dichVu_Id = dichVu_Id;
	}

	public String getTenPhongKham() {
		return tenPhongKham;
	}

	public void setTenPhongKham(String tenPhongKham) {
		this.tenPhongKham = tenPhongKham;
	}

	public String getDiaDiem() {
		return diaDiem;
	}

	public void setDiaDiem(String diaDiem) {
		this.diaDiem = diaDiem;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

}
