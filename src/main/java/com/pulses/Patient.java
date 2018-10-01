package com.pulses;

public class Patient {
    private String name;
    private int age;
    private float height;
    private float weight;
    private String email;
    private String gender;
    private ArrayList<Patient> relatives;
    private HeartInfo heartStat;
    public Patient(){

    }
    public Patient(String name, int age, float height, float weight, String email, String gender){
        this.name = name;
        this.age=age;
        this.height = height;
        this.weight = weight;
        this.email=email;
        this.gender=gender;
        relatives = new ArrayList<Patient>();
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

    public ArrayList<Patient> getRelatives() {
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

    public void setRelatives(ArrayList<Patient> relatives) {
        this.relatives = relatives;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
