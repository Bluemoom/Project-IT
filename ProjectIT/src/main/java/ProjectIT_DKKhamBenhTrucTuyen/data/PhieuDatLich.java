package ProjectIT_DKKhamBenhTrucTuyen.data;

import oracle.sql.TIMESTAMP;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="PHIEUDATLICH")
public class PhieuDatLich {
    @Id
    @Column(name = "PHIEUDATLICH_ID")
    private long phieuDatLichId;
    @Column(name = "PHONGKHAM_ID")
    private long phongKhamId;
    @Column(name = "BENHNHAN_ID")
    private long benhNhanId;
    @Column(name = "THOIGIANBATDAU")
    @Temporal(TemporalType.TIMESTAMP)
//    @DateTimeFormat(pattern = "HH:mm:ss")
    private Date thoiGianBatDau;
    @Column(name = "THOIGIANKETTHUC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thoiGianKetThuc;
    @Column(name = "CHIPHI")
    private float chiPhi;
    @Column(name="PHIDATLICH")
    private float phiDatLich;
    @Column(name="KETLUAN")
    private String ketLuan;
    @Column(name="TRANGTHAI")
    private int trangThai;

    public PhieuDatLich() {
    }

    public PhieuDatLich(long phieuDatLichId, long phongKhamId, long benhNhanId, Date thoiGianBatDau, Date thoiGianKetThuc, float chiPhi, float phiDatLich, String ketLuan, int trangThai) {
        this.phieuDatLichId = phieuDatLichId;
        this.phongKhamId = phongKhamId;
        this.benhNhanId = benhNhanId;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.chiPhi = chiPhi;
        this.phiDatLich = phiDatLich;
        this.ketLuan = ketLuan;
        this.trangThai = trangThai;
    }

    public PhieuDatLich(long phongKhamId, long benhNhanId, Date thoiGianBatDau, Date thoiGianKetThuc, float chiPhi, float phiDatLich, String ketLuan, int trangThai) {
        this.phongKhamId = phongKhamId;
        this.benhNhanId = benhNhanId;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.chiPhi = chiPhi;
        this.phiDatLich = phiDatLich;
        this.ketLuan = ketLuan;
        this.trangThai = trangThai;
    }

    public long getPhieuDatLichId() {
        return phieuDatLichId;
    }

    public void setPhieuDatLichId(long phieuDatLichId) {
        this.phieuDatLichId = phieuDatLichId;
    }

    public long getPhongKhamId() {
        return phongKhamId;
    }

    public void setPhongKhamId(long phongKhamId) {
        this.phongKhamId = phongKhamId;
    }

    public long getBenhNhanId() {
        return benhNhanId;
    }

    public void setBenhNhanId(long benhNhanId) {
        this.benhNhanId = benhNhanId;
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

    public float getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(float chiPhi) {
        this.chiPhi = chiPhi;
    }

    public float getPhiDatLich() {
        return phiDatLich;
    }

    public void setPhiDatLich(float phiDatLich) {
        this.phiDatLich = phiDatLich;
    }

    public String getKetLuan() {
        return ketLuan;
    }

    public void setKetLuan(String ketLuan) {
        this.ketLuan = ketLuan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
}

