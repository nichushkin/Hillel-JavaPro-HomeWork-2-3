package com.company;

public class Horse extends Animal{
    private String horseSound;
    public String getHorseSound() {
        return horseSound;
    }

    public void setHorseSound(String horseSound) {
        this.horseSound = horseSound;
    }

    public void makeNoise(){
        System.out.println("Лошадь издает звук");
    }

    public void eat(){
        System.out.println("Лошадь ест");
    }
}
