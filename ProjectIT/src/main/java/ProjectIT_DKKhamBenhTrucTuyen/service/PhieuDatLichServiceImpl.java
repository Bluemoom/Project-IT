package ProjectIT_DKKhamBenhTrucTuyen.service;

import ProjectIT_DKKhamBenhTrucTuyen.data.PhieuDatLich;
import ProjectIT_DKKhamBenhTrucTuyen.repository.PhieuDatLichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhieuDatLichServiceImpl implements PhieuDatLichService {
    @Autowired
    private PhieuDatLichRepository phieuDatLichRepository;

    @Autowired
    public void setPhieuDatLichRepository(PhieuDatLichRepository phieuDatLichRepository) {this.phieuDatLichRepository = phieuDatLichRepository;}

    @Override
    public Iterable<PhieuDatLich> getAllPhieuDatLich() {
        return phieuDatLichRepository.findAll();
    }


    @Override
    public PhieuDatLich getPhieuDatLichById(Long id) {
       return phieuDatLichRepository.findOne(id);
    }

    @Override
    public PhieuDatLich savePhieuDatLich(PhieuDatLich phieuDatLich) {
        return phieuDatLichRepository.save(phieuDatLich);
    }

    @Override
    public void deletePhieuDatLich(Long id) {
        phieuDatLichRepository.delete(id);
    }

    @Override
    public Iterable<PhieuDatLich> findPhieuDatLichByBenhNhanId(Long benhNhanId) {
        return phieuDatLichRepository.findPhieuDatLichByBenhNhanId(benhNhanId);
    }

    @Override
    public Iterable<Object[]> findLichKhamByBenhNhanId(Long benhNhanId) {
        return phieuDatLichRepository.findLichKhamByBenhNhanId(benhNhanId);
    }

    @Override
    public int capNhatTrangThaiPhieuDatLich(Long phieuPhieuDatLichId, Integer trangThai) {
        return phieuDatLichRepository.capNhatTrangThaiPhieuDatLich(phieuPhieuDatLichId,trangThai);
    }

}
