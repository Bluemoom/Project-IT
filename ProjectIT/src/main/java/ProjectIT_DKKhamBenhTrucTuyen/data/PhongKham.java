package ProjectIT_DKKhamBenhTrucTuyen.data;

import javax.persistence.*;

@Entity
@Table(name="PHONGKHAM")
public class PhongKham {
    @Id
    @Column(name="PHONGKHAM_ID")
    private long phongKhamId;
    @Column(name="DICHVU_ID")
    private long dichVuId;
    @Column(name="TENPHONGKHAM")
    private String tenPhongKham;
    @Column(name="DIADIEM")
    private String diaDiem;
    @Column(name="TRANGTHAI")
    private int trangThai;

    public PhongKham() {
    }

    public PhongKham(long phongKhamId, long dichVuId, String tenPhongKham, String diaDiem, int trangThai) {
        this.phongKhamId = phongKhamId;
        this.dichVuId = dichVuId;
        this.tenPhongKham = tenPhongKham;
        this.diaDiem = diaDiem;
        this.trangThai = trangThai;
    }

    public PhongKham(long dichVuId, String tenPhongKham, String diaDiem, int trangThai) {
        this.dichVuId = dichVuId;
        this.tenPhongKham = tenPhongKham;
        this.diaDiem = diaDiem;
        this.trangThai = trangThai;
    }

    public long getPhongKhamId() {
        return phongKhamId;
    }

    public void setPhongKhamId(long phongKhamId) {
        this.phongKhamId = phongKhamId;
    }

    public long getDichVuId() {
        return dichVuId;
    }

    public void setDichVuId(long dichVuId) {
        this.dichVuId = dichVuId;
    }

    public String getTenPhongKham() {
        return tenPhongKham;
    }

    public void setTenPhongKham(String tenPhongKham) {
        this.tenPhongKham = tenPhongKham;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
}
