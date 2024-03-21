package com.example.BellIntegrator.task4;

public class Service {
    public static void main(String[] args) {

        //Матрица 1:
        int[][] matrix = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        //Матрица 2:
        int[][] matrix2 = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 5) {
                    matrix2[i][j] = 2;
                } else if (i == 1 || i == 4 || j == 1 || j == 4) {
                    matrix2[i][j] = 1;
                } else {
                    matrix2[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //Матрица 3:
        int[][] matrix3 = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 0 || i == 7 || j == 0 || j == 7) {
                    matrix3[i][j] = 3;
                } else if (i == 1 || i == 6 || j == 1 || j == 6) {
                    matrix3[i][j] = 2;
                } else if (i ==2 || i ==5 || j==2||j==5){
                    matrix3[i][j]=1;
                }else {
                    matrix3[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
