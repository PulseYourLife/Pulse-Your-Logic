package com.pulses.pulse.service;

import com.pulses.pulse.model.Diagnostic;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface HeartInfoService {
    List<Diagnostic> getDiagnostics();
    String getDiagnosticById(String id);
    void addDiagnostic(String id, Date date, String diagnostic);
    int findDataByDate(String date);

}
