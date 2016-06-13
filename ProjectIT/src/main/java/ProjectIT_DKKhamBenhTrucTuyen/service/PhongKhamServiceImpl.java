package ProjectIT_DKKhamBenhTrucTuyen.service;

import ProjectIT_DKKhamBenhTrucTuyen.data.PhongKham;
import ProjectIT_DKKhamBenhTrucTuyen.repository.PhongKhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhongKhamServiceImpl implements PhongKhamService {
    @Autowired
    private PhongKhamRepository phongKhamRepository;
    @Autowired
    public void setPhongKhamRepository(PhongKhamRepository phongKhamRepository) {this.phongKhamRepository = phongKhamRepository;}

    @Override
    public Iterable<PhongKham> findPhongKhamByDichVuId(Long id) {
        return phongKhamRepository.findPhongKhamByDichVuId(id);
    }
}
