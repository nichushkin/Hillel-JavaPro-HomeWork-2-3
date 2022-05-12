package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // ### Часть 3:
        //

        //   - Вызвать из конструктора с двумя параметрами конструктор с тремя параметрами.
// Student



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
        Student[] student1 = new Student[4];
//        Student[] student2 = new Aspirant[2];
        Random random = new Random();

//        for (int i = 0; i < student1.length; i++) {
//            student1[i] = new Student();
//        }
//
////        student1[0] = new Student(false, "Vasya", "Ivanov", "tr", 5);
////        student1[1] = new Student(true, "Anna", "Shag", "trw", 3);
////        student1[2] = new Student(true, "Ganna", "Tag", "pp", 5);
////        student1[3] = new Student(false, "Ivan", "Smirnov", "RR", 3);
//
//        System.out.println(student1[0].getScholarship(5));
//        System.out.println(student1[1].getScholarship(3));
//        System.out.println(student1[2].getScholarship(5));
//        System.out.println(student1[3].getScholarship(3));
    }
}
