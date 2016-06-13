package ProjectIT_DKKhamBenhTrucTuyen.data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "LICHBIEU")
public class LichBieu {
    @Id
    @Column(name = "LICHBIEU_ID")
    private long lichBieuId;
    @Column(name="PHONGKHAM_ID")
    private long phongKhamId;
    @Column(name="BACSI_ID")
    private long bacSiId;
    @Column(name="NGAYLAM")
    private Date ngayLam;
    @Column(name="BUOILAM")
    private int buoiLam;
    @Column(name="TRANGTHAI")
    private int trangThai;

    public LichBieu() {
    }

    public LichBieu(long lichBieuId, long phongKhamId, long bacSiId, Date ngayLam, int buoiLam, int trangThai) {
        this.lichBieuId = lichBieuId;
        this.phongKhamId = phongKhamId;
        this.bacSiId = bacSiId;
        this.ngayLam = ngayLam;
        this.buoiLam = buoiLam;
        this.trangThai = trangThai;
    }

    public LichBieu(long phongKhamId, long bacSiId, Date ngayLam, int buoiLam, int trangThai) {
        this.phongKhamId = phongKhamId;
        this.bacSiId = bacSiId;
        this.ngayLam = ngayLam;
        this.buoiLam = buoiLam;
        this.trangThai = trangThai;
    }

    public long getLichBieuId() {
        return lichBieuId;
    }

    public void setLichBieuId(long lichBieuId) {
        this.lichBieuId = lichBieuId;
    }

    public long getPhongKhamId() {
        return phongKhamId;
    }

    public void setPhongKhamId(long phongKhamId) {
        this.phongKhamId = phongKhamId;
    }

    public long getBacSiId() {
        return bacSiId;
    }

    public void setBacSiId(long bacSiId) {
        this.bacSiId = bacSiId;
    }

    public Date getNgayLam() {
        return ngayLam;
    }

    public void setNgayLam(Date ngayLam) {
        this.ngayLam = ngayLam;
    }

    public int getBuoiLam() {
        return buoiLam;
    }

    public void setBuoiLam(int buoiLam) {
        this.buoiLam = buoiLam;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
}
