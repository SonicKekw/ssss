package com.company.professions;

public class Person {
    private String fullName;
    private int drivingExperience;


    public Person(String fullName, int drivingExperience) {//конструкто
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;
    }


    public String getFullName() {//геттер для фио водителя
        return fullName;
    }//геттер для имени

    public void setFullName(String fullName) {//сеттер для фио
        this.fullName = fullName;
    }//сеттер для имени

    public int getDrivingExperience() {//геттер для стажа вождения
        return drivingExperience;
    }//геттер для стажа водителя

    public void setDrivingExperience(int drivingExperience) {//сеттер для стажа вождения
        this.drivingExperience = drivingExperience;
    }
}