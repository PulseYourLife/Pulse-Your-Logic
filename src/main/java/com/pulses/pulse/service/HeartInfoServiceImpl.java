package com.pulses.pulse.service;


import com.pulses.pulse.model.Diagnostic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HeartInfoServiceImpl implements HeartInfoService {
    private HashMap<String, Integer> currentData = new HashMap<String, Integer>();
    private List<Diagnostic> diagnostics= new ArrayList<>();
    @Autowired
    public HeartInfoServiceImpl(){}

    @Override
    public List<Diagnostic> getDiagnostics() {
        return diagnostics;
    }

    @Override
    public String getDiagnosticById(String id) {
        for (Diagnostic dg : diagnostics) {
            if(dg.getId().equals(id)){
                return dg.getDiagnostic();
            }
        }
        return null;
    }

    @Override
    public void addDiagnostic(String id, Date date, String diagnostic) {
        diagnostics.add(new Diagnostic(id,date,diagnostic));
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
