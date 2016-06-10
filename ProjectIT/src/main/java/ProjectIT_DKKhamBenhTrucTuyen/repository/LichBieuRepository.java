package ProjectIT_DKKhamBenhTrucTuyen.repository;

import ProjectIT_DKKhamBenhTrucTuyen.data.LichBieu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LichBieuRepository extends CrudRepository<LichBieu, Long> {
}
