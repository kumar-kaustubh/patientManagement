package com.example.Patient.controller;


import com.example.Patient.Entity.Patient;
import com.example.Patient.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient addPatient)
    {
        return patientService.addPatient( addPatient);
    }
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Integer id)
    {
        return  patientService.getPatientById(id);
    }
    @GetMapping
    public ResponseEntity<List<Patient>> getAllPatient()
    {
        Optional<List<Patient>> patients =  patientService.getAllPatients( );
        if (patients.isPresent()) {
            return ResponseEntity.ok(patients.get());
        } else {
            return ResponseEntity.noContent().build();
        }
    }

}
