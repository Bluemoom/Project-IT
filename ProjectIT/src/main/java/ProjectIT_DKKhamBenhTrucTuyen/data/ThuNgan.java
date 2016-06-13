package ProjectIT_DKKhamBenhTrucTuyen.data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="THUNGAN")
public class ThuNgan {
    @Id
    @Column(name="THUNGAN_ID")
    private long thuNganId;
    @Column(name="HOTEN")
    private String hoTen;
    @Column(name="NGAYSINH")
    private Date ngaySinh;
    @Column(name="GIOITINH")
    private int gioiTinh;
    @Column(name="SDT")
    private String soDienThoai;
    @Column(name="EMAIL")
    private String email;
    @Column(name="DIACHI")
    private String diaChi;


    public ThuNgan() {
    }

    public ThuNgan(long thuNganId, String hoTen, Date ngaySinh, int gioiTinh, String soDienThoai, String email, String diaChi) {
        this.thuNganId = thuNganId;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
    }

    public ThuNgan(String hoTen, Date ngaySinh, int gioiTinh, String soDienThoai, String email, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
    }

    public long getThuNganId() {
        return thuNganId;
    }

    public void setThuNganId(long thuNganId) {
        this.thuNganId = thuNganId;
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
