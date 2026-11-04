package com.example.Patient.ServiceImpl;

import com.example.Patient.Entity.Patient;
import com.example.Patient.Service.PatientService;
import com.example.Patient.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PatientServiceImpl implements PatientService {


   @Autowired
   private PatientRepository patientRepository;
    @Override
    public Optional<List<Patient> >getAllPatients() {
       List<Patient>patientList = patientRepository.findAll();
        return patientList.isEmpty()
                ? Optional.empty()
                : Optional.of(patientList);
    }

    @Override
    public Patient addPatient(Patient addPatient) {
        return patientRepository.save(addPatient);
    }

    @Override
    public Patient getPatientById(Integer id) {
        return patientRepository.findById(id)            .orElseThrow(() ->
                new RuntimeException("Patient not found with id: " + id)
        );

    }
}
