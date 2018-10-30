package com.pulses.pulse.service;

import com.pulses.pulse.model.Diagnostic;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DiagnosticService {
    List<Diagnostic> getDiagnosticList();
    void addDiagnostic(Diagnostic diag);
    Diagnostic findDiagnosticById(String id);
}
