package ProjectIT_DKKhamBenhTrucTuyen.repository;

import ProjectIT_DKKhamBenhTrucTuyen.data.CaLam;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaLamRepository extends CrudRepository<CaLam,Long> {
}
