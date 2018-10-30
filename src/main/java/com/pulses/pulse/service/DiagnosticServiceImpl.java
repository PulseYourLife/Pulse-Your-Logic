package com.pulses.pulse.service;

import com.pulses.pulse.model.Diagnostic;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiagnosticServiceImpl implements  DiagnosticService{
    private List<Diagnostic> diagnostics = new ArrayList<>();
    @Autowired
    public DiagnosticServiceImpl(){}

    @PostConstruct
    private void populateSampleData()
    {
        Date date = new Date();
        diagnostics.add( new Diagnostic("di1",date, "It's fine"));
    }

    @Override
    public List<Diagnostic> getDiagnosticList() {
        return diagnostics;
    }

    @Override
    public void addDiagnostic(Diagnostic diag) {
        diagnostics.add(diag);
    }

    @Override
    public Diagnostic findDiagnosticById(String id) {
        for(Diagnostic diag: diagnostics){
            if(diag.getId().equals(id)){
                return diag;
            }
        }
        return null;
    }

}
