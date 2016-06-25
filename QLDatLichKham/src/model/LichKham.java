package model;

import java.util.Date;

public class LichKham {
	private long LichKhamId;
    private Date ngayKham;
    private int buoiKham;
    private String tenPhongKham;
    private String viTriPhongKham;
    private String bacSiKham;    
    private Date thoiGianBatDau;
    private Date thoiGianKetThuc;
    private double chiPhi;
    private int hinhThucThanhToan;
    private int trangThai;    
    
	public LichKham() {
	}

	

	public LichKham(long lichKhamId,Date ngayKham, int buoiKham, String tenPhongKham,
			String viTriPhongKham, String bacSiKham, Date thoiGianBatDau, Date thoiGianKetThuc, double chiPhi,
			int hinhThucThanhToan, int trangThai) {
		super();
		LichKhamId = lichKhamId;
		this.ngayKham = ngayKham;
		this.buoiKham = buoiKham;
		this.tenPhongKham = tenPhongKham;
		this.viTriPhongKham = viTriPhongKham;
		this.bacSiKham = bacSiKham;
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.chiPhi = chiPhi;
		this.hinhThucThanhToan = hinhThucThanhToan;
		this.trangThai = trangThai;
	}



	public long getLichKhamId() {
		return LichKhamId;
	}



	public void setLichKhamId(long lichKhamId) {
		LichKhamId = lichKhamId;
	}



	public Date getNgayKham() {
		return ngayKham;
	}



	public void setNgayKham(Date ngayKham) {
		this.ngayKham = ngayKham;
	}



	public int getBuoiKham() {
		return buoiKham;
	}



	public void setBuoiKham(int buoiKham) {
		this.buoiKham = buoiKham;
	}



	public String getTenPhongKham() {
		return tenPhongKham;
	}



	public void setTenPhongKham(String tenPhongKham) {
		this.tenPhongKham = tenPhongKham;
	}



	public String getViTriPhongKham() {
		return viTriPhongKham;
	}



	public void setViTriPhongKham(String viTriPhongKham) {
		this.viTriPhongKham = viTriPhongKham;
	}



	public String getBacSiKham() {
		return bacSiKham;
	}



	public void setBacSiKham(String bacSiKham) {
		this.bacSiKham = bacSiKham;
	}



	public Date getThoiGianBatDau() {
		return thoiGianBatDau;
	}



	public void setThoiGianBatDau(Date thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}



	public Date getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}



	public void setThoiGianKetThuc(Date thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}



	public double getChiPhi() {
		return chiPhi;
	}



	public void setChiPhi(double chiPhi) {
		this.chiPhi = chiPhi;
	}



	public int getHinhThucThanhToan() {
		return hinhThucThanhToan;
	}



	public void setHinhThucThanhToan(int hinhThucThanhToan) {
		this.hinhThucThanhToan = hinhThucThanhToan;
	}



	public int getTrangThai() {
		return trangThai;
	}



	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}	
    
}
