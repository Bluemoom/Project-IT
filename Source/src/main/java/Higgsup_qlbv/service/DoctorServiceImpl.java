package Higgsup_qlbv.service;

import Higgsup_qlbv.data.Doctor;
import Higgsup_qlbv.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    public void setDoctorRepository(DoctorRepository doctorRepository) {this.doctorRepository=doctorRepository;}
    @Override
    public Iterable<Doctor> listAllDoctor() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctorById(Long id) {
        return doctorRepository.findOne(id);
    }

    @Override
    public Doctor saveDoctor(Doctor patient) {
        return doctorRepository.save(patient);
    }

    @Override
    public void deleteDoctor(Long id) {
        doctorRepository.delete(id);
    }
}
