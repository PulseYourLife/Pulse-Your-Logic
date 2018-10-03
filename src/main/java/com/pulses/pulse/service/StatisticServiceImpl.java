package com.pulses.pulse.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Service
public class StatisticServiceImpl implements StatisticService {

    private List<Integer> week = new ArrayList<>();
    private List<int> year = new ArrayList<>();
    private List<int> day = new ArrayList<>();

    @Override
    List<Integer> dataWeek(){
        return week;
    }

    @Override
    List<Integer> dataYear(){
        return year;
    }

    @Override
    List<Integer> dataDay() {
        return day;
    }

    @Override
    void addValueWeek(Integer value){
        week.add(value);
    }

    @Override
    void addValueYear(Integer value){
        year.add(value);
    }

    @Override
    void addValueDay(Integer value){
        day.add(value);
    }
}

