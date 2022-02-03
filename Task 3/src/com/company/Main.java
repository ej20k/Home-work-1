package com.company;

public class Main {

    public static void main(String[] args) {
        int [] arr = {21,58,74,3,15,12,45,61,34,95};
        reverse(arr, arr.length);
    }

    private static void reverse(int[] arr,    int length)    {

        for(int i=length;i>0;i--)    {
            System.out.println(arr[i-1]);
        }
    }
}

