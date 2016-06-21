package model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BACSI")
public class BacSi {
	@Id
	@Column(name="BACSI_ID")
	private int bacSi_Id;
	@Column(name="USERNAME")
	private String username;
	@Column(name="PASS_WORD")
	private String password;
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
	@Column(name="CHUYENMON")
	private String chuyenMon;
	
	public BacSi(int bacSi_Id, String username, String password, String hoTen,
			Date ngaySinh, int gioiTinh, String cmnd, String sdt, String email,
			String chuyenMon) {
		this.bacSi_Id = bacSi_Id;
		this.username = username;
		this.password = password;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.cmnd = cmnd;
		this.sdt = sdt;
		this.email = email;
		this.chuyenMon = chuyenMon;
	}
	public BacSi() {
	}
	public int getBacSi_Id() {
		return bacSi_Id;
	}
	public void setBacSi_Id(int bacSi_Id) {
		this.bacSi_Id = bacSi_Id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getChuyenMon() {
		return chuyenMon;
	}
	public void setChuyenMon(String chuyenMon) {
		this.chuyenMon = chuyenMon;
	}
	
}
