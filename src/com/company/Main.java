package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // ### Часть 3:
        //

        //   - Вызвать из конструктора с двумя параметрами конструктор с тремя параметрами.

        //6. Создать класс `Car` в пакете `com.company.vehicles`, `Engine` в пакете `com.company.details` и `Driver` в пакете `com.company.professions`. Класс `Driver` содержит поля - `ФИО`, `стаж вождения`. Класс `Engine` содержит поля - `мощность`, `производитель`. Класс `Car` содержит поля - `марка автомобиля`, `класс автомобиля`, `вес`, водитель типа `Driver`, мотор типа `Engine`.
        //Методы `start()`, `stop()`, `turnRight()`, `turnLeft()`, которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево". А также метод `printInfo()`, который выводит полную информацию об автомобиле, ее водителе и моторе.
        //Создать производный от `Car` класс  - `Lorry` (грузовик), характеризуемый также грузоподъемностью кузова.
        //Создать производный от `Car` класс - `SportCar`, характеризуемый также предельной скоростью. Пусть класс `Driver` расширяет класс `Person`.
        //---
        //7. Создать класс `Animal` и расширяющие его классы `Dog`, `Cat`, `Horse`. Класс `Animal` содержит переменные `food`, `location` и методы `makeNoise`, `eat`, `sleep`. Метод makeNoise, например, может выводить на консоль "Такое-то животное спит". `Dog`, `Cat`, `Horse` переопределяют методы `makeNoise`, `eat`. Добавьте переменные в классы `Dog`, `Cat`, `Horse`, характеризующие только этих животных. Создайте класс Ветеринар, в котором определите метод `void treatAnimal(Animal animal)`. Пусть этот метод распечатывает `food` и `location` пришедшего на прием животного. В методе main создайте массив типа `Animal`, в который запишите животных всех имеющихся у вас типов. В цикле отправляйте их на прием к ветеринару.
        Phone phone1 = new Phone(123456, "Sony", 8.5);
        Phone phone2 = new Phone(456789, "Redmi", 12.2);
        Phone phone3 = new Phone(987321, "Apple", 3.8);
        System.out.println(phone1.toString());
        System.out.println((phone2.toString()));
        System.out.println(phone3.toString());
        phone1.receiveCall("Vasya");
        phone1.getNumber();
        phone2.receiveCall("Petya");
        phone2.getNumber();
        phone3.receiveCall("Anna");
        phone3.getNumber();
        phone1.receiveCall("Jhonny", 147258);
        phone2.receiveCall("Hercules", 369258);
        phone3.receiveCall("Aragorn", 789456);
        phone1.sendMessage(new int[]{444, 5555, 4555, 5555});
        Person person1 = new Person();
        Person person2 = new Person("Igor", 11);
        person1.talk();
        person1.move();
        person2.talk();
        person2.move();
        Reader reader1 = new Reader();
        reader1.takeBook(4);
        reader1.takeBook(new String[]{"First", "Second"});
        Book book = new Book();
        reader1.takeBook(book);
        reader1.returnBook(5);
        reader1.returnBook(new String[]{"Second", "First"});
        reader1.returnBook(book);
        Student[] student1 = new Student[1];
//        Student[] student2 = new Aspirant[2];
        Random random = new Random();

        student1[0] = new Student(false, "Vasya", "Ivanov", "tr", 50);
//        student1[1] = new Student(true, "Anna", "Shag", "trw", 99);
//        student1[2] = new Student(true, "Ganna", "Tag", "pp", 88);
//        student1[4] = new Student(false, "Ivan", "Smirnov", "RR", 92);

        System.out.println(Arrays.toString(student1));
    }
}
