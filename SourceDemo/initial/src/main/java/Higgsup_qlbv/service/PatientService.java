package Higgsup_qlbv.service;

import Higgsup_qlbv.data.Patient;

/**
 * Created by sunny on 25/05/2016.
 */
public interface PatientService {
    Iterable<Patient> listAllPatient();

    Patient getPatientById(Long id);

    Patient savePatient(Patient patient);

    void deletePatient(Long id);
}
