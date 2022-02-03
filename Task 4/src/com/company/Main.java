package com.company;

public class Main {

    public static void main(String[] args) {
        int [][] array = {{1, -2, -3, -4, 5}, {6, -7, -8, 9, -10}};
        int amountMinus = 0;
        int amountPlus = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array [i].length; j++) {
                if(array [i] [j] > 0) {
                    amountPlus ++;
                }else  {
                    amountMinus ++;
                }
            }
        }
        System.out.println("количество положительных" + amountPlus);
        System.out.println("количество отрицательных" + amountMinus);
    }
}

