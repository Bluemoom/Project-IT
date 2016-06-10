package ProjectIT_DKKhamBenhTrucTuyen.service;


import ProjectIT_DKKhamBenhTrucTuyen.data.PhieuDatLich;

public interface PhieuDatLichService {
    Iterable<PhieuDatLich> getAllPhieuDatLich();

    Iterable<PhieuDatLich> getAllPhieuDatLichByBenhNhanId();

    PhieuDatLich getPhieuDatLichById(Long id);

    PhieuDatLich savePhieuDatLich(PhieuDatLich phieuDatLich);

    void deletePhieuDatLich(Long id);


}
