package model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BENHNHAN")
public class BenhNhan {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int benhNhan_Id;
	@Column(name="HOTEN")
	private String hoTen;
	@Column(name="NGAYSINH")
	private Date ngaySinh;
	@Column(name="GIOITINH")
	private int gioiTinh;
	@Column(name="CMND")
	private String cmnd;
	@Column(name="SDT")
	private String sdt;
	@Column(name="EMAIL")
	private String email;
	@Column(name="DIACHI")
	private String diaChi;
	@Column(name="MAPIN")
	private int maPin;
	public BenhNhan() {
	}

	public BenhNhan(String hoTen, Date ngaySinh, int gioiTinh, String cmnd, String sdt, String email, String diaChi,
			int maPin) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.cmnd = cmnd;
		this.sdt = sdt;
		this.email = email;
		this.diaChi = diaChi;
		this.maPin = maPin;
	}

	public int getBenhNhan_Id() {
		return benhNhan_Id;
	}
	public void setBenhNhan_Id(int benhNhan_Id) {
		this.benhNhan_Id = benhNhan_Id;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public int getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getMaPin() {
		return maPin;
	}
	public void setMaPin(int maPin) {
		this.maPin = maPin;
	}
	
}
