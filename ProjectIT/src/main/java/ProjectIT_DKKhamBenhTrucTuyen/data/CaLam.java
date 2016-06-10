package ProjectIT_DKKhamBenhTrucTuyen.data;

import javax.persistence.*;

@Entity
@Table(name = "CALAM")
public class CaLam {
    @Id
    @Column(name="LICHBIEU_ID")
    private long lichBieuId;
    @Column(name="PHIEUDATLICH_ID")
    private long phieuDatLichId;
    @Column(name="CA")
    private int ca;

    public CaLam() {
    }

    public CaLam(long lichBieuId, long phieuDatLichId, int ca) {
        this.lichBieuId = lichBieuId;
        this.phieuDatLichId = phieuDatLichId;
        this.ca = ca;
    }

    public CaLam(int ca) {
        this.ca = ca;
    }

    public long getLichBieuId() {
        return lichBieuId;
    }

    public void setLichBieuId(long lichBieuId) {
        this.lichBieuId = lichBieuId;
    }

    public long getPhieuDatLichId() {
        return phieuDatLichId;
    }

    public void setPhieuDatLichId(long phieuDatLichId) {
        this.phieuDatLichId = phieuDatLichId;
    }

    public int getCa() {
        return ca;
    }

    public void setCa(int ca) {
        this.ca = ca;
    }
}
