package com.example.Patient.Service;

import com.example.Patient.Entity.Patient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PatientService {
    Optional<List<Patient>> getAllPatients();

    Patient addPatient(Patient addPatient);

    Patient getPatientById(Integer id);
}
