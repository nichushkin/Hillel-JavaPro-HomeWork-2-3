package com.company.professions;

import com.company.Person;

public class Driver extends Person {
    private String firstLastName;
    private int experienceDriving;

    public Driver(String firstLastName, int experienceDriving) {
        this.firstLastName = firstLastName;
        this.experienceDriving = experienceDriving;
    }

    @Override
    public String toString() {
        return "ФИО: " + firstLastName + ", опыт вождения = " + experienceDriving;
    }
}
