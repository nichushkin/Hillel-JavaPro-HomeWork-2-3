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


    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        double[][] matrix = new double[this.row][this.column];
        this.matrix = matrix;
    }

    public double randomValue() {
        return random.nextDouble(0, 1);
    }

    public double[][] creatValuesMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomValue();
            }
        }
        return matrix;
    }

    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("  %2.2f", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public double[][] matrixSum(Matrix matrix1, Matrix matrix2) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix1.matrix[i][j] + matrix2.matrix[i][j];
            }
        }
        return matrix;
    }

    public double[][] multiplyMatrix(Matrix matrix1, Matrix matrix2) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix1.matrix[i][j] * matrix2.matrix[i][j];
            }
        }
        return matrix;
    }

    public double[][] matrixMultiplyValue(Matrix matrix1) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix1.matrix[i][j] * value;
            }
        }
        return matrix;
    }
}