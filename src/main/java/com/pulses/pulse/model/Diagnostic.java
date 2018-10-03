package com.pulses.pulse.model;

import java.util.Date;

public class Diagnostic {
    private String id;
    private Date date;
    private String diagnostic;
    public Diagnostic(String id, Date date, String diagnostic){
        this.id = id;
        this.date=date;
        this.diagnostic=diagnostic;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }
}
