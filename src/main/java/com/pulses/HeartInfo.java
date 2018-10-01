package com.pulses;

public class HeartInfo {
    private HashMap<String, Integer> currentData;
    private ArrayList<Diagnostic> diagnostics;
    public HeartInfo(){
        currentData = new HashMap<String, Integer>();
        diagnostics = new ArrayList<Diagnostic>();
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

    public ArrayList<Diagnostic> getDiagnostics() {
        return diagnostics;
    }

    public void setDiagnostics(ArrayList<Diagnostic> diagnostics) {
        this.diagnostics = diagnostics;
    }

}
