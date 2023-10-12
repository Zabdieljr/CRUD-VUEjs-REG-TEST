package com.bezahive.symplifica.controller;

import com.bezahive.symplifica.model.Patient;
import com.bezahive.symplifica.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ClientController {
    // service
    @Autowired
    private PatientService patientService;

    @RequestMapping("/")
    public String hello_world(){
        return "Symplifica REST API";
    }

    // add Patient
    @PostMapping("/add")
    public String addPatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
        return "Patient Added Successfully..";
    }

    // getPatientById
    @RequestMapping("/patient/{id}")
    public Patient getPatientById(@PathVariable("id") long id){
        return patientService.getPatientById(id);
    }

    // getPatients
    @RequestMapping("/patients")
    public List<Patient> getPatients(){
        return patientService.getPatients();
    }

    // updatePatient
    @PutMapping("/patient")
    public Patient updatePatient(@RequestBody Patient patient){
        return patientService.updatePatient(patient);
    }

    // deletePatientById
    @DeleteMapping("/patient/{id}")
    public String deletePatient(@PathVariable("id") long id){
        patientService.deletePatient(id);
        return "Patient Deleted";
    }

}
