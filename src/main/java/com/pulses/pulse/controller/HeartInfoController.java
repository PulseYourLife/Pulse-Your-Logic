package com.pulses.pulse.controller;

import com.pulses.pulse.model.Ambulance;
import com.pulses.pulse.model.Diagnostic;
import com.pulses.pulse.service.HeartInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/heartInfo")
@CrossOrigin(origins = "http://localhost:8080")
public class HeartInfoController {

    @Autowired
    private HeartInfoService heartInfoService;

    @RequestMapping( value = "/getDiagnostics", method = RequestMethod.GET )
    public List<Diagnostic> getDiagnostics(){
        return heartInfoService.getDiagnostics();
    }


    @RequestMapping( value = "/getByDate/id")
    public String getDiagnosticById(@RequestParam("id") String id) throws ParseException {
        return heartInfoService.getDiagnosticById(id);
    }
    //Day-Month-Year  09-Jun-1998
    // http://localhost:8080/heartInfo/getByDate/date?date=09-Jun-1998

    @RequestMapping(value="/addDiagnostic/id/diagnostic")
    public void addDiagnostic(@RequestParam("id") String id, @RequestParam("diagnostic") String diagnostic) throws ParseException {
        Date date = new Date();
        heartInfoService.addDiagnostic(id, date,diagnostic);
    }
    // http://localhost:8080/heartInfo/addDiagnostic/date?date=09-Jun-1998/diagnostic?diagnostic=dead
    //void addDiagnostic(Date date, String diagnostic);
    //int findDataByDate(String date);
}
