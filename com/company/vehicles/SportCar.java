package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private int maxSpeed;


    public SportCar(String brand, String carClass, int weight, Driver driver, Engine engine, int maxSpeed) {//конструктор класса
        super(brand, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }


    public int getMaxSpeed() { //геттер
        return maxSpeed;
    } //геттер для максскорости

    public void setMaxSpeed(int maxSpeed) { //сеттер
        this.maxSpeed = maxSpeed;
    }//сеттер для максскорости
}