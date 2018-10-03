package com.pulses.pulse.controller;


import com.pulses.pulse.model.Ambulance;
import com.pulses.pulse.service.AmbulanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AmbulanceController {
    @Autowired
    private AmbulanceService ambulanceService;
    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping( value = "/ambulances", method = RequestMethod.GET )
    public List<Ambulance> getProductList(){
        return ambulanceService.getAmbulancesList();
    }


    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping( value = "/ambulances", method = RequestMethod.POST )
    public void addProduct(@RequestBody Ambulance ambulance){
        ambulanceService.addAmbulance(ambulance);
    }
}
