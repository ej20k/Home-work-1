package com.company;

public class Main {

    public static boolean
    isLowerTriangularMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int rows = 3, columns = 3;
        if (rows == columns) {
            int Matrix[][]
                    = { { 1, 1, 0 }, { 3, 4, 2 }, { 6, 5, 7 } };
            System.out.println("Matrix is : ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(Matrix[i][j] + " ");
                }
                System.out.println();
            }
            boolean result
                    = isLowerTriangularMatrix(Matrix);
            if (result == true) {
                System.out.println(
                        "Матрица является нижней треугольной");
            }
            else {
                System.out.println(
                        "Матрица не является нижней треугольной");
            }
        }
        else {
            System.out.println(
                    "Количество строк количество столбцов");
        }
    }
}


