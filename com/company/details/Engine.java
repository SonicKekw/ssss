package com.company.details;

public class Engine {
    private int power;
    private String manufacturer;


    public Engine(int power, String manufacturer) {//конструктор
        this.power = power;
        this.manufacturer = manufacturer;
    }


    public int getPower() {//геттер для производителя двигателя
        return power;
    }

    public void setPower(int power) {//сеттер для производителя двигателя
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String toString() {//переопределение toString для вывода инфы о двигателе
        return "Engine{" +
                "power=" + power +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}