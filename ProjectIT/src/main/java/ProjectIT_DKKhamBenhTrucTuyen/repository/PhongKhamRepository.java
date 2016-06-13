package ProjectIT_DKKhamBenhTrucTuyen.repository;

import ProjectIT_DKKhamBenhTrucTuyen.data.DichVu;
import ProjectIT_DKKhamBenhTrucTuyen.data.PhongKham;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PhongKhamRepository extends CrudRepository<PhongKham, Long> {

    @Query(value = "SELECT p.* FROM PhongKham p, DichVu d WHERE p.dichVu_Id = d.dichVu_Id and d.dichVu_Id = :dichVuId ",nativeQuery = true)
    Iterable<PhongKham> findPhongKhamByDichVuId(@Param("dichVuId") Long dichVuId);

}
