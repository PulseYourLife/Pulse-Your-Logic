package com.pulses;

public class Ambulance {
    private String id;
    private boolean onService;
    private boolean busy;
    public Ambulance (String id){
        this.id =id;
        this.onService = true;
        this.busy = false;
    }
}
