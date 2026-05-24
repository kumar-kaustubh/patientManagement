package com.example.Patient.controller;


import com.example.Patient.Entity.Patient;
import com.example.Patient.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatient() {
        return patientService.getAllPatients();
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient addPatient)
    {
        return patientService.addPatient( patientService.addPatient(addPatient));
    }
}
