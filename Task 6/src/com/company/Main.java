package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] mat1 = new int[4][4];
        int[][] mat2 = new int[4][4];
        int[][] sumMat = new int[4][4];
        mat1 = fillMatrix(mat1);
        mat2 = fillMatrix(mat2);

        System.out.println("Матрица 1 :  ");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Матрица 2 :  ");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма двух матриц :  ");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                sumMat[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sumMat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Разность двух матриц :  ");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                sumMat[i][j] = mat1[i][j] - mat2[i][j];
                System.out.print(sumMat[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] fillMatrix (int[][] tmpMat) {
        for (int i=0; i<tmpMat.length; i++) {
            for (int j=0; j<tmpMat [i].length; j++) {
                tmpMat[i][j] = (int) (Math.random()*10);
            }
        }
        return tmpMat;
    }
}

