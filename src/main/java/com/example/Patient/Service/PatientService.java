package com.example.Patient.Service;

import com.example.Patient.Entity.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {
    List<Patient> getAllPatients();

    Patient addPatient(Patient addPatient);
}
