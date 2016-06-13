package ProjectIT_DKKhamBenhTrucTuyen.data;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;


public class LichKham {
    private long LichKhamId;
    private Date ngayKham;
    private int buoiKham;
    @Temporal(TemporalType.TIMESTAMP)
    private Date thoiGianKham;
    private String phongKham;
    private String bacSiKham;

    public LichKham() {
    }

    public LichKham(long lichKhamId, Date ngayKham, int buoiKham, Date thoiGianKham, String phongKham, String bacSiKham) {
        LichKhamId = lichKhamId;
        this.ngayKham = ngayKham;
        this.buoiKham = buoiKham;
        this.thoiGianKham = thoiGianKham;
        this.phongKham = phongKham;
        this.bacSiKham = bacSiKham;
    }

    public LichKham(Date ngayKham, int buoiKham, Date thoiGianKham, String phongKham, String bacSiKham) {
        this.ngayKham = ngayKham;
        this.buoiKham = buoiKham;
        this.thoiGianKham = thoiGianKham;
        this.phongKham = phongKham;
        this.bacSiKham = bacSiKham;
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

    public Date getThoiGianKham() {
        return thoiGianKham;
    }

    public void setThoiGianKham(Date thoiGianKham) {
        this.thoiGianKham = thoiGianKham;
    }

    public String getPhongKham() {
        return phongKham;
    }

    public void setPhongKham(String phongKham) {
        this.phongKham = phongKham;
    }

    public String getBacSiKham() {
        return bacSiKham;
    }

    public void setBacSiKham(String bacSiKham) {
        this.bacSiKham = bacSiKham;
    }
}
