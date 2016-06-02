package Higgsup_qlbv.service;

import Higgsup_qlbv.data.Patient;
import Higgsup_qlbv.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    public void setPatientRepository(PatientRepository patientRepository) {this.patientRepository = patientRepository;}
    @Override
    public Iterable<Patient> listAllPatient() {
      return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Long id) {
        Patient patient = patientRepository.findOne(id);
        return patient;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Long id) {
        patientRepository.delete(id);
    }
}
