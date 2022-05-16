package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    int maxSpeed;

    public SportCar(String brandCar, String classCar, int weightCar, Driver driver, Engine engine, int maxSpeed) {
        super(brandCar, classCar, weightCar, driver, engine);
        this.maxSpeed = maxSpeed;
    }
    @Override
    public void printInfo(){
        super.printInfo();
    }
}
