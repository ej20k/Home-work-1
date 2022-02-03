package com.company;

public class Main {

    public static void main(String[] args) {
        int a;
        int b = 0;
        int c = 1;
        int sum = 0;

        for (int i = 0; i < 7; i++) {
            a = b;
            b = c;
            c = a + b;

            if (c % 2 == 0) {
                System.out.println(c);

                sum += c;
            }
        }
        System.out.println(sum);
    }
}

