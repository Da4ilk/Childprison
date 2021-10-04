package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      Group fox= new Group("fox");
        System.out.println(fox);


    }

    private static void extracted() {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        int  num= 0;
        while (!choice.toLowerCase().equals("e")) {
            System.out.println("Выберите задание: 1-Фибоначи,2 -Факториал");
            if (scanner.nextInt()==1 ) {
                System.out.println("Введите число для Фибоначи");
                num=scanner.nextInt();
                System.out.println(SomeMath.fibonachi(num));
            } else {
                System.out.println("Введите число для Факториала");
                num=scanner.nextInt();
                System.out.println(SomeMath.factorial(num));
            }
            scanner.nextLine();
            System.out.println("Если хотите закончить расчеты напишите 'e' на англ");
            choice = scanner.nextLine();

        }
    }
}

