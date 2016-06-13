package ProjectIT_DKKhamBenhTrucTuyen.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "BENHNHAN")
public class BenhNhan {
    @Id
    @Column(name="BENHNHAN_ID")
    private Long benhNhanId;
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

    public BenhNhan() {
    }

    public BenhNhan(long benhNhanId, String hoTen, Date ngaySinh, int gioiTinh, String chungMinhThu, String soDienThoai, String email, String diaChi) {
        this.benhNhanId = benhNhanId;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.chungMinhThu = chungMinhThu;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
    }

    public BenhNhan(String hoTen, Date ngaySinh, int gioiTinh, String chungMinhThu, String soDienThoai, String email, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.chungMinhThu = chungMinhThu;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
    }

    public long getBenhNhanId() {
        return benhNhanId;
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

    public String getChungMinhThu() {
        return chungMinhThu;
    }

    public void setChungMinhThu(String chungMinhThu) {
        this.chungMinhThu = chungMinhThu;
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
}
