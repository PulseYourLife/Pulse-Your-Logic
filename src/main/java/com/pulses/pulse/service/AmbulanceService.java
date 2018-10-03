package com.pulses.pulse.service;

import com.pulses.pulse.model.Ambulance;
import java.util.List;
public interface AmbulanceService {
    List<Ambulance> getAmbulancesList();
    void addAmbulance( Ambulance ambulance );
    Ambulance findAmbulanceById(String id);
    List<Ambulance> findAviableAmbulances();
}
