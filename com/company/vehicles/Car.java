package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String brand;
    private String carClass;
    private int weight;
    private Driver driver;
    private Engine engine;


    public Car(String brand, String carClass, int weight, Driver driver, Engine engine) {//конструктор
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }


    public void start() {//создание методов
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String toString() {// toString метод
        return "Car{" +
                "brand='" + brand + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }


    public String getBrand() {//геттер для марки
        return brand;
    } //геттер для марки

    public void setBrand(String brand) {//сеттер для марки
        this.brand = brand;
    }//сеттер для марки

    public String getCarClass() {//геттер для класса автомобиля
        return carClass;
    }

    public void setCarClass(String carClass) {//сеттер для класса автомобиля
        this.carClass = carClass;
    }

    public int getWeight() {//сеттер для веса автомобиля
        return weight;
    }//геттер для веса машины

    public void setWeight(int weight) {//сеттер для веса автомобиля
        this.weight = weight;
    }//сеттер для веса машины

    public Driver getDriver() {//геттер для водителя
        return driver;
    }

    public void setDriver(Driver driver) {//сеттер для водителя
        this.driver = driver;
    }//сеттер для двигателя

    public Engine getEngine() {//геттер для двигателя
        return engine;
    }

    public void setEngine(Engine engine) {//сеттер для двигателя
        this.engine = engine;
    }//сеттер для двигателя
}
