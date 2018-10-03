package com.pulses.pulse.service;

import com.pulses.pulse.model.Patient;
import com.pulses.pulse.model.Relative;
import java.util.List;

public interface PatientService {
    Patient getPatientByEmail(String email);
    List<Patient> getPatients();
    List<Relative> getRelativesByEmail(String email);
}
