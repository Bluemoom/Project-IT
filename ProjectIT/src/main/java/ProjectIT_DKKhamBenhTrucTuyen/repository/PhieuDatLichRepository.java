package ProjectIT_DKKhamBenhTrucTuyen.repository;

import ProjectIT_DKKhamBenhTrucTuyen.data.LichBieu;
import ProjectIT_DKKhamBenhTrucTuyen.data.LichKham;
import ProjectIT_DKKhamBenhTrucTuyen.data.PhieuDatLich;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PhieuDatLichRepository extends CrudRepository<PhieuDatLich, Long> {

    @Query("SELECT t FROM PhieuDatLich t WHERE t.benhNhanId = :BenhNhanId")
    Iterable<PhieuDatLich> findPhieuDatLichByBenhNhanId(@Param("BenhNhanId") Long benhNhanId);

    @Query("SELECT p,c,l,pk,b FROM PhieuDatLich p, CaLam c, LichBieu l, PhongKham pk, BacSi b"
            + " WHERE p.phieuDatLichId = c.phieuDatLichId AND c.lichBieuId = l.lichBieuId AND l.phongKhamId = pk.phongKhamId AND l.bacSiId = b.bacSiId AND p.trangThai = 1 AND p.benhNhanId = :benhNhanId")
    Iterable<Object[]> findLichKhamByBenhNhanId(@Param("benhNhanId") Long benhNhanId);

    @Modifying
    @Query("UPDATE PhieuDatLich p SET p.trangThai = :trangThai WHERE phieuDatLichId = :phieuDatLichId")
    @Transactional
    int capNhatTrangThaiPhieuDatLich(@Param("phieuDatLichId") Long phieuDatLichId,@Param("trangThai") Integer trangThai);
}
