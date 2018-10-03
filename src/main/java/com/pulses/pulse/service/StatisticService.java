package com.pulses.pulse.service;

import java.util.List;

public interface StatisticService {
    List<Integer> dataWeek();
    List<Integer> dataYear();
    List<Integer> dataDay();
    void addValueWeek(Integer value);
    void addValueYear(Integer value);
    void addValueDay(Integer value);
}

