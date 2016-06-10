package ProjectIT_DKKhamBenhTrucTuyen.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="BACSI")
public class BacSi {
    @Id
    @Column(name="BACSI_ID")
    private long bacSiId;
    @Column(name="HOTEN")
    private String hoTen;
    @Column(name="NGAYSINH")
    private Date ngaySinh;
    @Column(name="GIOITINH")
    private int gioiTinh;
    @Column(name="CMND")
    private String chungMinhThu;
    @Column(name="SDT")
    private String soDienThoai;
    @Column(name="EMAIL")
    private String email;
    @Column(name="DIACHI")
    private String diaChi;
    @Column(name = "CHUYENMON")
    private String chuyenMon;

    public BacSi() {
    }

    public BacSi(long bacSiId, String hoTen, Date ngaySinh, int gioiTinh, String cmnd, String soDienThoai, String email, String diaChi, String chuyenMon) {
        this.bacSiId = bacSiId;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.chungMinhThu = cmnd;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
        this.chuyenMon = chuyenMon;
    }

    public BacSi(String hoTen, Date ngaySinh, int gioiTinh, String cmnd, String soDienThoai, String email, String diaChi, String chuyenMon) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.chungMinhThu = cmnd;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
        this.chuyenMon = chuyenMon;
    }

    public long getBacSiId() {
        return bacSiId;
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
        return chungMinhThu;
    }

    public void setCmnd(String cmnd) {
        this.chungMinhThu = cmnd;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
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

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }
}
