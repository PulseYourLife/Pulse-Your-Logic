package com.pulses.pulse.service;

import java.util.ArrayList;
import java.util.List;

public interface StatisticService {
    ArrayList<Double> dataWeek();
    ArrayList<Double> dataYear();
    double dataDay();
    void addValueWeek(double value);
    void addValueYear(double value);
    void addValueDay(double value);
}


