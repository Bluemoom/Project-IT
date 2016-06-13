package ProjectIT_DKKhamBenhTrucTuyen.service;

import ProjectIT_DKKhamBenhTrucTuyen.data.PhongKham;

public interface PhongKhamService {
    Iterable<PhongKham> findPhongKhamByDichVuId(Long id);

}
