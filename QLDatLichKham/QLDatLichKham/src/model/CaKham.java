package model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAKHAM")
public class CaKham {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int caKham_Id;
	@Column(name = "LICHBIEU_ID")
	private int lichBieu_Id;
	@Column(name = "CA")
	private int ca;
	@Column(name = "THOIGIANBATDAU")
	private Timestamp thoiGianBatDau;
	@Column(name = "THOIGIANKETTHUC")
	private Timestamp thoiGianKetThuc;
	@Column(name = "TRANGTHAI")
	private int trangThai;
	public CaKham() {
	}
	public CaKham(int caKham_Id, int lichBieu_Id, int ca,
			Timestamp thoiGianBatDau, Timestamp thoiGianKetThuc, int trangThai) {
		this.caKham_Id = caKham_Id;
		this.lichBieu_Id = lichBieu_Id;
		this.ca = ca;
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.trangThai = trangThai;
	}
	public int getCaKham() {
		return caKham_Id;
	}
	public void setCaKham(int caKham_Id) {
		this.caKham_Id = caKham_Id;
	}
	public int getLichBieu_Id() {
		return lichBieu_Id;
	}
	public void setLichBieu_Id(int lichBieu_Id) {
		this.lichBieu_Id = lichBieu_Id;
	}
	public int getCa() {
		return ca;
	}
	public void setCa(int ca) {
		this.ca = ca;
	}
	public Timestamp getThoiGianBatDau() {
		return thoiGianBatDau;
	}
	public void setThoiGianBatDau(Timestamp thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}
	public Timestamp getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}
	public void setThoiGianKetThuc(Timestamp thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

}
