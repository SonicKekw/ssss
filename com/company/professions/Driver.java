package com.company.professions;

public class Driver extends Person {
    private int drivingExperience;

    public Driver(String fullName, int drivingExperience) {//конструктор
        super(fullName, drivingExperience);
        this.drivingExperience = drivingExperience;
    }

    public int getDrivingExperience() {//геттер для стажа вождения
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {//сеттер для стажа вождения
        this.drivingExperience = drivingExperience;
    }

    public String toString() {//переопределение toString для вывода инфы о водителе
        return "Driver{" +
                "fullName='" + getFullName() + '\'' +
                ", drivingExperience=" + getDrivingExperience() +
                '}';
    }
}

