package com.pulses.pulse.controller;


import com.pulses.pulse.model.Ambulance;
import com.pulses.pulse.model.Diagnostic;
import com.pulses.pulse.service.AmbulanceService;
import com.pulses.pulse.service.DiagnosticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/diagnostic")
@CrossOrigin(origins = "http://localhost:8080")
public class DiagnosticController {
    @Autowired
    private DiagnosticService diagnosticService;

    @RequestMapping( value = "/getDiagnostics", method = RequestMethod.GET )
    public List<Diagnostic> getDiagnostics(){
        return diagnosticService.getDiagnosticList();
    }


    @RequestMapping( value = "/register/id")
    public void addProduct(@RequestParam("id") String id){
        Date date = new Date();
        diagnosticService.addDiagnostic(new Diagnostic(id,date,""));
    }
    //The link to add some ambulance is http://localhost:8080/ambulances/register/id?id=idAmbulance

    @RequestMapping(value ="/getById/id", method = RequestMethod.GET)
    public Diagnostic getDiagnosticById(@RequestParam("id") String id){
        return diagnosticService.findDiagnosticById(id);
    }
    //The link to add some ambulance is http://localhost:8080/ambulances/getById/id?id=idAmbulance
}
