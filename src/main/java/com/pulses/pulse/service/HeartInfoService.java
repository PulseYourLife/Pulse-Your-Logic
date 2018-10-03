package com.pulses.pulse.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface HeartInfoService {
    HashMap<Date, String> getDiagnostics();
    String getDiagnosticByDate(Date date);
    void addDiagnostic(Date date, String diagnostic);
    int findDataByDate(String date);

}
