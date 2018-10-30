package com.pulses.pulse.model;

public class Ambulance {

    private String id;
    private boolean onService;

    public Ambulance (String id, boolean onService){
        this.id =id;
        this.onService = onService;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public boolean isOnService() {
        return onService;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setOnService(boolean onService) {
        this.onService = onService;
    }
}
