package com.pulses;

public class Diagnostic {
    private String diagnostic;
    private Date date;
    public Diagnostic(String diagnostic, Date date){
        this.date = date;
        this.diagnostic = diagnostic;
    }

    public Date getDate() {
        return date;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }
}
