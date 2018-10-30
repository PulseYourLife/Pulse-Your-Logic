package com.pulses.pulse.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StatisticServiceImpl implements StatisticService {

    Double[] datosQuemados = {1.38, 2.56, 4.31,6.71,2.61,2.81,2.71,9.76,1.45,12.65,10.00};
    private ArrayList<Double> week = new ArrayList<>();
    private ArrayList<Double> year = new ArrayList<Double>(Arrays.asList(datosQuemados));

    private double day;

    @Override
    public ArrayList<Double> dataWeek(){

        return week;
    }

    @Override
    public ArrayList<Double> dataYear(){
        return year;
    }

    @Override
    public double dataDay() {
        this.day = 3.5;
        return day;
    }

    @Override
    public void addValueWeek(double value)    {

        week.add(value);
    }

    @Override
    public void addValueYear(double value){
        year.add(value);
    }

    @Override
    public void addValueDay(double value){
        this.day = value;
    }
}

