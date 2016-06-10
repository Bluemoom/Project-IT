package ProjectIT_DKKhamBenhTrucTuyen.data;

import javax.persistence.*;

@Entity
@Table(name="TAIKHOAN")
public class TaiKhoan {
    @Id
    @Column(name="TAIKHOAN_ID")
    private long taiKhoanId;
    @Column(name="TENDANGNHAP")
    private String tenDangNhap;
    @Column(name="MATKHAU")
    private String matKhau;
    @Column(name="QUYEN")
    private int quyen;
    @Column(name="TRANGTHAI")
    private int trangThai;

    public TaiKhoan() {
    }

    public TaiKhoan(long taiKhoanId, String tenDangNhap, String matKhau, int quyen, int trangThai) {
        this.taiKhoanId = taiKhoanId;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.quyen = quyen;
        this.trangThai = trangThai;
    }

    public TaiKhoan(String tenDangNhap, String matKhau, int quyen, int trangThai) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.quyen = quyen;
        this.trangThai = trangThai;
    }

    public long getTaiKhoanId() {
        return taiKhoanId;
    }

    public void setTaiKhoanId(long taiKhoanId) {
        this.taiKhoanId = taiKhoanId;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
}
