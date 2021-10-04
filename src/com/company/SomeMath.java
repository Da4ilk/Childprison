package com.company;
public class SomeMath {
    public static int fibonachi(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }
    public static int factorial(int number) {
        int temp=1;
        if (number <= 0) {
            System.out.println("Введите число больше 0");
        } else {
            for (int i = 1; i<=number; i++) {
                temp*=i;
            }
        }
        return temp;
    }
}
