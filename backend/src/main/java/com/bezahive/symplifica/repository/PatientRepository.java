package com.bezahive.symplifica.repository;

import com.bezahive.symplifica.model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {

}
