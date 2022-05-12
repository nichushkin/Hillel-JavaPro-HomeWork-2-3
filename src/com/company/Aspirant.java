package com.company;

public class Aspirant extends  Student{
    private boolean scientificPaper = true;

    public double getScholarship(int averageMark) {
        double resault = 0;
        if (averageMark == 5) {
            resault = 200;
        } else {
            resault = 180;
        }
        return resault;
    }
}
