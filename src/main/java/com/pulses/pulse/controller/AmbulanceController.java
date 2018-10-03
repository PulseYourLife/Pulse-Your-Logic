package com.pulses.pulse.controller;


import com.pulses.pulse.model.Ambulance;
import com.pulses.pulse.service.AmbulanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ambulances")
@CrossOrigin(origins = "http://localhost:8080")
public class AmbulanceController {
    @Autowired
    private AmbulanceService ambulanceService;

    @RequestMapping( value = "/getAmbulances", method = RequestMethod.GET )
    public List<Ambulance> getAmbulances(){
        return ambulanceService.getAmbulancesList();
    }


    @RequestMapping( value = "/register/id")
    public void addProduct(@RequestParam("id") String id){
        ambulanceService.addAmbulance(new Ambulance(id,false));
    }
    //The link to add some ambulance is http://localhost:8080/ambulances/register/id?id=idAmbulance

    @RequestMapping(value ="/getById/id", method = RequestMethod.GET)
    public Ambulance getAmbulanceById(@RequestParam("id") String id){
        return ambulanceService.findAmbulanceById(id);
    }
    //The link to add some ambulance is http://localhost:8080/ambulances/getById/id?id=idAmbulance

    @RequestMapping( value = "/getAviableAmbulances", method = RequestMethod.GET )
    public List<Ambulance> getAviableAmbulances(){
        return ambulanceService.findAviableAmbulances();
    }
}
