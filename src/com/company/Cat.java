package com.company;

public class Cat extends Animal{
    private String meowTone;

    public String getMeowTone() {
        return meowTone;
    }

    public void setMeowTone(String meowTone) {
        this.meowTone = meowTone;
    }

    public void makeNoise(){
        System.out.println("Кот издает звук");
    }

    public void eat(){
        System.out.println("Кот ест");
    }
}
