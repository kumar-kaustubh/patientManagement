package com.example.Patient.ServiceImpl;

import com.example.Patient.Entity.Patient;
import com.example.Patient.Service.PatientService;
import com.example.Patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PatientServiceImpl implements PatientService {


   @Autowired
   private PatientRepository patientRepository;
    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient addPatient(Patient addPatient) {
        return patientRepository.save(addPatient);
    }
}
