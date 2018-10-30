package com.pulses.pulse.controller;

import com.pulses.pulse.model.Diagnostic;
import com.pulses.pulse.service.HeartInfoService;
import com.pulses.pulse.service.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/values")
@CrossOrigin(origins = "http://localhost:8080")
public class StatisticController {

    @Autowired
    private StatisticService st;

    @RequestMapping( value = "/getValuesWeek", method = RequestMethod.GET )
    public List<Double> getValuesWeek(){

        return st.dataWeek();
    }

    @RequestMapping( value = "/getValuesYear", method = RequestMethod.GET )
    public List<Double> getValuesYear(){

        return st.dataYear();
    }

    @RequestMapping( value = "/getValueDay", method = RequestMethod.GET )
    public Double getValueDay(){
        return st.dataDay();
    }

    @RequestMapping(value="/addValue/value/time")
    public void addValue(@RequestParam("value") Double value, @RequestParam("time") String time){

        if(time == "year"){
            st.addValueYear(value);
        }
        if(time== "week"){
            st.addValueWeek(value);
        }
        if(time == "day"){
            st.addValueDay(value);
        }
    }
}
