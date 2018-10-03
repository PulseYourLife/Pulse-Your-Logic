package com.pulses.pulse.service;

import com.pulses.pulse.model.Patient;
import com.pulses.pulse.model.Relative;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PatientServiceImpl implements PatientService {
    private List<Patient> patients = new ArrayList<>();

    @Autowired
    public PatientServiceImpl(){}
    @Override
    public Patient getPatientByEmail(String email) {
        for(Patient pat: patients){
            if(pat.getEmail().equals(email)){
                return pat;
            }
        }
        return null;
    }

    @Override
    public List<Patient> getPatients() {
        return patients;
    }

    @Override
    public List<Relative> getRelativesByEmail(String email) {
        Patient pat = getPatientByEmail(email);
        if(pat!=null){
            return pat.getRelatives();
        }else{
            return null;
        }
    }

    public void changeEmail (String newEmail, String email){
        Patient p = getPatientByEmail(email);
        p.setEmail(newEmail);
    }

    public void changeName (String newName, String email){
        Patient p = getPatientByEmail(email);
        p.setName(newName);
    }

    public void changeWeight(float newWeight, String email){
        Patient p = getPatientByEmail(email);
        p.setWeight(newWeight);
    }

    public void changeHeight(int newHeight, String email){
        Patient p = getPatientByEmail(email);
        p.setWeight(newHeight);
    }

}
