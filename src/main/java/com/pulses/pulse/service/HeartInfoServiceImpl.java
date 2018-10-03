package com.pulses.pulse.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class HeartInfoServiceImpl implements HeartInfoService {
    private HashMap<String, Integer> currentData = new HashMap<String, Integer>();
    private HashMap <Date, String> diagnostics= new HashMap<>();
    @Autowired
    public HeartInfoServiceImpl(){}

    @Override
    public HashMap<Date, String> getDiagnostics() {
        return diagnostics;
    }

    @Override
    public String getDiagnosticByDate(Date date) {
        for (Map.Entry<Date, String> entry : diagnostics.entrySet()) {
            if(entry.getKey().equals(date)){
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public void addDiagnostic(Date date, String diagnostic) {
        diagnostics.put(date,diagnostic);
    }

    @Override
    public int findDataByDate(String date) {
        for (Map.Entry<String, Integer> entry : currentData.entrySet()) {
            if(entry.getKey().equals(date)){
                return entry.getValue();
            }
        }
        return 0;

    }
}
