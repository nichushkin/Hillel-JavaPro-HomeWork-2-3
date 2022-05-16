package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    int loadCapacity;

    public Lorry(String brandCar, String classCar, int weightCar, Driver driver, Engine engine, int loadCapacity) {
        super(brandCar, classCar, weightCar, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
