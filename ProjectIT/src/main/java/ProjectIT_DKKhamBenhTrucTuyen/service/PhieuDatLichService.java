package ProjectIT_DKKhamBenhTrucTuyen.service;


import ProjectIT_DKKhamBenhTrucTuyen.data.PhieuDatLich;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PhieuDatLichService {

    Iterable<PhieuDatLich> getAllPhieuDatLich();

    PhieuDatLich getPhieuDatLichById(Long id);

    PhieuDatLich savePhieuDatLich(PhieuDatLich phieuDatLich);

    void deletePhieuDatLich(Long id);

    Iterable<PhieuDatLich> findPhieuDatLichByBenhNhanId(Long benhNhanId);

    Iterable<Object[]> findLichKhamByBenhNhanId(Long benhNhanId);

    int capNhatTrangThaiPhieuDatLich(Long phieuPhieuDatLichId,Integer trangThai);

}
