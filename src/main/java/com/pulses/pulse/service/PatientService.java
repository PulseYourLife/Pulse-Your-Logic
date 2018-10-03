package com.pulses.pulse.service;

import com.pulses.pulse.model.Patient;
import com.pulses.pulse.model.Relative;
import java.util.List;

public interface PatientService {
    public Patient getPatientByEmail(String email);
    public List<Patient> getPatients();
    public List<Relative> getRelativesByEmail(String email);
    public void changeEmail (String newEmail, String email);
    public void changeName (String newName, String email);
    public void changeWeight(float newWeight, String email);
    public void changeHeight(int newHeight, String email);
    public void newPatient(Patient p);
}
