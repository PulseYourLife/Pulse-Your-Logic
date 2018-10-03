package com.pulses.pulse.service;

import com.pulses.pulse.model.Ambulance;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.ArrayList;

@Service
public class AmbulanceServiceImpl implements AmbulanceService {
    private List<Ambulance> ambulances = new ArrayList<>();
    @Autowired
    public AmbulanceServiceImpl(){}


    @PostConstruct
    private void populateSampleData()
    {
        ambulances.add( new Ambulance("amb1",true));
    }

    @Override
    public List<Ambulance> getAmbulancesList() {
        return ambulances;
    }

    @Override
    public void addAmbulance(Ambulance ambulance) {
        ambulances.add(ambulance);
    }

    @Override
    public Ambulance findAmbulanceById(String id) {
        for(Ambulance am: ambulances){
            if(am.getId().equals(id)){
                return am;
            }
        }
        return null;
    }

    @Override
    public List<Ambulance> findAviableAmbulances() {
        List<Ambulance> aviableAmb = new ArrayList<>();
        for(Ambulance am: ambulances){
            if(!am.isOnService()){
                aviableAmb.add(am);
            }
        }
        return aviableAmb;
    }
}
