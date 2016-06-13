package ProjectIT_DKKhamBenhTrucTuyen.data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="DICHVU")
public class DichVu {
    @Id
    @Column(name="DICHVU_ID")
    private long dichVuId;
    @Column(name="TENDICHVU")
    private String tenDichVu;
    @Column(name="MOTA")
    private String moTa;
    @Column(name="THOIGIANKHAM")
    private int thoiGianKham;
    @Column(name ="TRANGTHAI")
    private int trangThai;
    @Column(name ="CHIPHI")
    private float chiPhi;

    public DichVu() {
    }

    public DichVu(long dichVuId, String tenDichVu, String moTa, int thoiGianKham, int trangThai, float chiPhi) {
        this.dichVuId = dichVuId;
        this.tenDichVu = tenDichVu;
        this.moTa = moTa;
        this.thoiGianKham = thoiGianKham;
        this.trangThai = trangThai;
        this.chiPhi = chiPhi;
    }

    public DichVu(String tenDichVu, String moTa, int thoiGianKham, int trangThai, float chiPhi) {
        this.tenDichVu = tenDichVu;
        this.moTa = moTa;
        this.thoiGianKham = thoiGianKham;
        this.trangThai = trangThai;
        this.chiPhi = chiPhi;
    }

    public long getDichVuId() {
        return dichVuId;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getThoiGianKham() {
        return thoiGianKham;
    }

    public void setThoiGianKham(int thoiGianKham) {
        this.thoiGianKham = thoiGianKham;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public float getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(float chiPhi) {
        this.chiPhi = chiPhi;
    }
}
