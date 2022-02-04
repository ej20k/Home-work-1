package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {21, 58, 74, 3, 15, 12, 45, 61, 34, 95};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr [arr.length - i - 1];
            System.out.println(newArr[i] + " ");
        }
    }
}

