package org.itstep.qa.lesson;

import java.util.Random;
import java.util.Scanner;

public class Task02 {
    // Составить программу, которая проверяет знание таблицы умножения и сообщает пользователю результат (верно или нет).
    public static void main(String[] args) {
        int a = 5;
        System.out.println (a);
        Scanner sc = new Scanner(System.in);
        System.out.println ("Введите число");
        int b = sc.nextInt();
        System.out.println (b);
        int result = a*b;
        System.out.println ("Результат: " + result);

        //Scanner sc = new Scanner(System.in);
        //System.out.println ("Введите результат: ");
        //int res = sc.nextInt();


    }
}
