package com.company;
//5. Создайте пример наследования, реализуйте класс `Student` и класс `Aspirant`,
// аспирант отличается от студента наличием некой научной работы.
//   - Класс Student содержит переменные: `String firstName`, `lastName`, `group`.
//   А также `double averageMark`, содержащую среднюю оценку.
//   - Создать переменную типа `Student`, которая ссылается на объект типа Aspirant`.
//   - Создать метод `getScholarship()` для класса `Student`, который возвращает сумму стипендии.
//   Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80. Переопределить этот метод в классе
//   `Aspirant`.  Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
//   - Создать массив типа `Student`, содержащий объекты класса `Student` и `Aspirant`. Вызвать
//   метод `getScholarship()` для каждого элемента массива.
//---
public class Student {
    private boolean scientificPaper = false;
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;
    private Student student = new Aspirant(scientificPaper, firstName, lastName, group, averageMark);

    public Student(boolean scientificPaper, String firstName, String lastName, String group, double averageMark) {
        this.scientificPaper = scientificPaper;
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship(int averageMark){
        double resault = 0;
        if (averageMark == 5){
            resault = 100;
        } else {
            resault = 80;
        }
        return resault;
    }
}
