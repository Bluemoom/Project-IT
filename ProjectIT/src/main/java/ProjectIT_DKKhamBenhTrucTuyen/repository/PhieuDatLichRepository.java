package ProjectIT_DKKhamBenhTrucTuyen.repository;

import ProjectIT_DKKhamBenhTrucTuyen.data.PhieuDatLich;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuDatLichRepository extends CrudRepository<PhieuDatLich, Long> {
}
