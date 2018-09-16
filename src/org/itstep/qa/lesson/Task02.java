package org.itstep.qa.lesson;

import java.util.Random;
import java.util.Scanner;

public class Task02 {
    // Составить программу, которая проверяет знание таблицы умножения и сообщает пользователю результат (верно или нет).
    public static void main(String[] args) {
        System.out.println("Таблица умножения!");
        System.out.println("Решите пример:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a + " * " + b + " = ");
        int c = sc.nextInt();
        if (c == a*b) System.out.println("Верно!");
        else System.out.println("Неверно!");
    }
}


