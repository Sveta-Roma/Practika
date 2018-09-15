package org.itstep.qa.lesson;

import java.util.Scanner;

public class Task04 {
    // Пользователь вводит целое трёхзначное число. Найти сумму цифр этого числа.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        String a = sc.next();
        int b = Integer.parseInt(a);
        int sum = 0;
        for (int i = 0; i < 3; i++){
            sum = sum + b%10;
            b = b/10;
        }
        System.out.println("Сумма равна " + sum);

    }
}
