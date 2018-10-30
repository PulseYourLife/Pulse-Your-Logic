package com.pulses.pulse.service;

import com.pulses.pulse.model.Patient;
import com.pulses.pulse.model.Relative;
import java.util.List;

public interface PatientService {
    Patient getPatientByEmail(String email) throws PulseServicesException;
    List<Patient> getPatients() throws PulseServicesException;
    List<Relative> getRelativesByEmail(String email) throws PulseServicesException;
    void changeEmail(String newEmail, String email) throws PulseServicesException;
    void changeName(String newName, String email) throws PulseServicesException;
    void changeWeight(float newWeight, String email) throws PulseServicesException;
    void changeHeight(int newHeight, String email) throws PulseServicesException;
    void newPatient(Patient p) throws PulseServicesException;
    void addNewRelative(Relative r, String email) throws PulseServicesException;
}
