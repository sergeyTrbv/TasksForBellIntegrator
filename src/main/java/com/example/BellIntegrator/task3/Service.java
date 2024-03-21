package com.example.BellIntegrator.task3;

public class Service {
    public static void main(String[] args) {

        //Дан массив NxN. Напишите программу на Java которая находит минимальный
        // элемент диагонали на картинке, без учёта элемента пересечения диагоналей.

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 1}
        };

        int min = Integer.MAX_VALUE;

        for (int i = 0, j = matrix.length-1; i < matrix.length; i++, j--) {
            if (j != matrix.length / 2) {
                min = Math.min(matrix[i][j], min);
            }
        }
        System.out.println("Минимальное значение на диагонали: " + min);
    }
}
