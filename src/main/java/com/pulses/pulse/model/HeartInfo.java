package com.pulses.pulse.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class HeartInfo {

    private HashMap<String, Integer> currentData = new HashMap<String, Integer>();
    private HashMap <Date, String> diagnostics= new HashMap<>();

    public HeartInfo(){

    }

    public int getDataByDate(String date){
        return currentData.get(date);
    }

    public HashMap<String, Integer> getCurrentData() {
        return currentData;
    }

    public void setCurrentData(HashMap<String, Integer> currentData) {
        this.currentData = currentData;
    }


}
