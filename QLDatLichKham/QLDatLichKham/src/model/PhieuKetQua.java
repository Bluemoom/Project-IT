package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PHIEUKETQUA")
public class PhieuKetQua {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int phieuKetQua_Id;
	@Column(name = "PHIEUDATLICH_ID")
	private int phieuDatLich_Id;
	@Column(name = "LYDOKHAM")
	private String lyDoKham;
	@Column(name = "TIENSUBENH")
	private String tienSuBenh;
	@Column(name = "QUATRINHBENHLY")
	private String quaTrinhBenhLy;
	@Column(name = "TOANTHAN")
	private String toanThan;
	@Column(name = "CACBOPHAN")
	private String cacBoPhan;
	@Column(name = "MACH")
	private String mach;
	@Column(name = "NHIETDO")
	private String nhietDo;
	@Column(name = "HUYETAP")
	private String huyetAp;
	@Column(name = "NOIKHOA")
	private String noiKhoa;
	@Column(name = "NGOAIKHOA")
	private String ngoaiKhoa;
	@Column(name = "SANPHUKHOA")
	private String sanPhuKhoa;
	@Column(name = "XETNGHIEMMAU")
	private String xetNghiemMau;
	@Column(name = "XETNGHIEMNUOCTIEU")
	private String xetNghiemNuocTieu;
	@Column(name = "TOMTATKETQUA")
	private String tomTatKetQua;
	@Column(name = "HUONGXULY")
	private String huongXuLy;
	@Column(name = "TRANGTHAI")
	private String trangThai;
	public PhieuKetQua() {
	}
	public PhieuKetQua(int phieuKetQua_Id, int phieuDatLich_Id,
			String lyDoKham, String tienSuBenh, String quaTrinhBenhLy,
			String toanThan, String cacBoPhan, String mach, String nhietDo,
			String huyetAp, String noiKhoa, String ngoaiKhoa,
			String sanPhuKhoa, String xetNghiemMau, String xetNghiemNuocTieu,
			String tomTatKetQua, String huongXuLy, String trangThai) {
		this.phieuKetQua_Id = phieuKetQua_Id;
		this.phieuDatLich_Id = phieuDatLich_Id;
		this.lyDoKham = lyDoKham;
		this.tienSuBenh = tienSuBenh;
		this.quaTrinhBenhLy = quaTrinhBenhLy;
		this.toanThan = toanThan;
		this.cacBoPhan = cacBoPhan;
		this.mach = mach;
		this.nhietDo = nhietDo;
		this.huyetAp = huyetAp;
		this.noiKhoa = noiKhoa;
		this.ngoaiKhoa = ngoaiKhoa;
		this.sanPhuKhoa = sanPhuKhoa;
		this.xetNghiemMau = xetNghiemMau;
		this.xetNghiemNuocTieu = xetNghiemNuocTieu;
		this.tomTatKetQua = tomTatKetQua;
		this.huongXuLy = huongXuLy;
		this.trangThai = trangThai;
	}
	public int getPhieuKetQua_Id() {
		return phieuKetQua_Id;
	}
	public void setPhieuKetQua_Id(int phieuKetQua_Id) {
		this.phieuKetQua_Id = phieuKetQua_Id;
	}
	public int getPhieuDatLich_Id() {
		return phieuDatLich_Id;
	}
	public void setPhieuDatLich_Id(int phieuDatLich_Id) {
		this.phieuDatLich_Id = phieuDatLich_Id;
	}
	public String getLyDoKham() {
		return lyDoKham;
	}
	public void setLyDoKham(String lyDoKham) {
		this.lyDoKham = lyDoKham;
	}
	public String getTienSuBenh() {
		return tienSuBenh;
	}
	public void setTienSuBenh(String tienSuBenh) {
		this.tienSuBenh = tienSuBenh;
	}
	public String getQuaTrinhBenhLy() {
		return quaTrinhBenhLy;
	}
	public void setQuaTrinhBenhLy(String quaTrinhBenhLy) {
		this.quaTrinhBenhLy = quaTrinhBenhLy;
	}
	public String getToanThan() {
		return toanThan;
	}
	public void setToanThan(String toanThan) {
		this.toanThan = toanThan;
	}
	public String getCacBoPhan() {
		return cacBoPhan;
	}
	public void setCacBoPhan(String cacBoPhan) {
		this.cacBoPhan = cacBoPhan;
	}
	public String getMach() {
		return mach;
	}
	public void setMach(String mach) {
		this.mach = mach;
	}
	public String getNhietDo() {
		return nhietDo;
	}
	public void setNhietDo(String nhietDo) {
		this.nhietDo = nhietDo;
	}
	public String getHuyetAp() {
		return huyetAp;
	}
	public void setHuyetAp(String huyetAp) {
		this.huyetAp = huyetAp;
	}
	public String getNoiKhoa() {
		return noiKhoa;
	}
	public void setNoiKhoa(String noiKhoa) {
		this.noiKhoa = noiKhoa;
	}
	public String getNgoaiKhoa() {
		return ngoaiKhoa;
	}
	public void setNgoaiKhoa(String ngoaiKhoa) {
		this.ngoaiKhoa = ngoaiKhoa;
	}
	public String getSanPhuKhoa() {
		return sanPhuKhoa;
	}
	public void setSanPhuKhoa(String sanPhuKhoa) {
		this.sanPhuKhoa = sanPhuKhoa;
	}
	public String getXetNghiemMau() {
		return xetNghiemMau;
	}
	public void setXetNghiemMau(String xetNghiemMau) {
		this.xetNghiemMau = xetNghiemMau;
	}
	public String getXetNghiemNuocTieu() {
		return xetNghiemNuocTieu;
	}
	public void setXetNghiemNuocTieu(String xetNghiemNuocTieu) {
		this.xetNghiemNuocTieu = xetNghiemNuocTieu;
	}
	public String getTomTatKetQua() {
		return tomTatKetQua;
	}
	public void setTomTatKetQua(String tomTatKetQua) {
		this.tomTatKetQua = tomTatKetQua;
	}
	public String getHuongXuLy() {
		return huongXuLy;
	}
	public void setHuongXuLy(String huongXuLy) {
		this.huongXuLy = huongXuLy;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	
}
