package ProjectIT_DKKhamBenhTrucTuyen.service;

import ProjectIT_DKKhamBenhTrucTuyen.data.PhieuDatLich;
import ProjectIT_DKKhamBenhTrucTuyen.repository.PhieuDatLichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Iterable<PhieuDatLich> getAllPhieuDatLichByBenhNhanId() {
        return null;
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
}
