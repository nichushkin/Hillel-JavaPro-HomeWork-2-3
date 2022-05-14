package com.company;

import java.util.Random;

public class Matrix {
    //3. Создать класс `Matrix`. Класс должен иметь следующие поля:
    //   - двумерный массив вещественных чисел;
    //   - количество строк и столбцов в матрице.
    //   - Добавить следующие методы:
    //        1) сложение с другой матрицей;
    //        2) умножение на число;
    //        3) вывод на печать;
    //        4) умножение матриц - по желанию.
    //---

    private int row;
    private int column;
    double[][] matrix;
    Random random = new Random();
    int value = random.nextInt(1, 10);

    public Matrix(int row, int column){
        double[][] matrix = new double[row][column];
        this.matrix = matrix;
    }

    public double randomValue(){
        return random.nextDouble(0, 1);
    }

    public int getRow(){
        return matrix.length;
    }

    public int getColumn(){
        return matrix[0].length;
    }

    public void creatValuesMatrix() {
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                matrix[i][j] = randomValue();
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                System.out.printf("  %2.2f", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public double[][] matrixSum(Matrix matrix1, Matrix matrix2) {
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                matrix[i][j] = matrix1 + matrix2;
            }
        }
        return matrix;
    }
//
//        System.out.println();
//        for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < matrix[0].length; j++) {
//            System.out.printf("  %2.2f", matrix[i][j]);
//        }
//        System.out.println();
//    }
//
//        for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < matrix[0].length; j++) {
//            matrix[i][j] = matrix[i][j] * n;
//        }
//    }
//
//        System.out.println();
//        for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < matrix[0].length; j++) {
//            System.out.printf("  %2.2f", matrix[i][j]);
//        }
//        System.out.println();
//    }
//
//        for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < matrix[0].length; j++) {
//            matrix[i][j] = matrix1[i][j] * matrix2[i][j];
//        }
//    }
//
//        System.out.println();
//        for (int i = 0; i < matrix.length; i++) {
//        for (int j = 0; j < matrix[0].length; j++) {
//            System.out.printf("  %2.2f", matrix[i][j]);
//        }
//        System.out.println();
//    }
}
