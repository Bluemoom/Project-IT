package Higgsup_qlbv.service;


import Higgsup_qlbv.data.Patient;

public interface PatientService {

    Iterable<Patient> listAllPatient();

    Patient getPatientById(Long id);

    Patient savePatient(Patient patient);

    void deletePatient(Long id);
}
