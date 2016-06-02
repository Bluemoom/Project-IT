package Higgsup_qlbv.service;

import Higgsup_qlbv.data.Doctor;


public interface DoctorService {
    Iterable<Doctor> listAllDoctor();

    Doctor getDoctorById(Long id);

    Doctor saveDoctor(Doctor patient);

    void deleteDoctor(Long id);
}
