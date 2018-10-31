package com.pulses.pulse.model;

import java.util.ArrayList;
import java.util.List;

public class Patient {

    private String name;
    private int age;
    private float height;
    private float weight;
    private String email;
    private String gender;
    private String password;
    private List<Relative> relatives;
    private HeartInfo heartStat;

    public Patient(String david, String email, String password, int age, String male, double v, double v1){

    }

    public Patient(String name,String email, String password, int age, String gender,float height, float weight){
        this.name = name;
        this.password = password;
        this.age=age;
        this.height = height;
        this.weight = weight;
        this.email=email;
        this.gender=gender;
        relatives = new ArrayList<Relative>();
        heartStat = new HeartInfo();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public List<Relative> getRelatives() {
        return relatives;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public HeartInfo getHeartStat() {
        return heartStat;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeartStat(HeartInfo heartStat) {
        this.heartStat = heartStat;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setRelatives(List<Relative> relatives) {
        this.relatives = relatives;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
