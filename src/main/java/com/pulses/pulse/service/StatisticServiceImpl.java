package com.pulses.pulse.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Service
public class StatisticServiceImpl implements StatisticService {

    private ArrayList<Double> week = new ArrayList<>();
    private ArrayList<Double> year = new ArrayList<>();
    private double day;

    @Override
    public ArrayList<Double> dataWeek(){

        return week;
    }

    @Override
    public ArrayList<Double> dataYear(){
        for (double i=0; i<10; i++) year.add(i);
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

