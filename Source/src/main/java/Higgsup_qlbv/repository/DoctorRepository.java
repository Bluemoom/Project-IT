package Higgsup_qlbv.repository;

import Higgsup_qlbv.data.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor,Long> {
}
