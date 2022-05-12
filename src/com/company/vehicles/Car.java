package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    //6. Создать класс `Car` в пакете `com.company.vehicles`, `Engine` в пакете `com.company.details` и `Driver`
    // в пакете `com.company.professions`. Класс `Driver` содержит поля - `ФИО`, `стаж вождения`. Класс `Engine`
    // содержит поля - `мощность`, `производитель`. Класс `Car` содержит поля - `марка автомобиля`,
    // `класс автомобиля`, `вес`, водитель типа `Driver`, мотор типа `Engine`.
    //Методы `start()`, `stop()`, `turnRight()`, `turnLeft()`, которые выводят на печать: "Поехали",
    // "Останавливаемся", "Поворот направо" или "Поворот налево". А также метод `printInfo()`, который выводит
    // полную информацию об автомобиле, ее водителе и моторе.
    //Создать производный от `Car` класс  - `Lorry` (грузовик), характеризуемый также грузоподъемностью кузова.
    //Создать производный от `Car` класс - `SportCar`, характеризуемый также предельной скоростью. Пусть класс
    // `Driver` расширяет класс `Person`.
    //---

    private String brandCar;
    private String classCar;
    private int weightCar;
    private Driver driver;
    private Engine engine;

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public void printInfo(){
        System.out.printf("Модель автомобиля: %s, класс автомобиля: %s, вес автомобиля: %d, водитель: %s, " +
                "двигатель: %s", brandCar, classCar, weightCar, driver, engine);
    }
}
