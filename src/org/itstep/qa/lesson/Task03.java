package org.itstep.qa.lesson;

import java.util.Scanner;

public class Task03 {
    // Пользователь вводит с клавиатуры название валюты, программа выводит на экран текущий курс (курс можно просто нафантазировать)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название валюты");
        String val = sc.nextLine();
        switch (val) {
            case "Доллар": {
                System.out.println("Текущий курс доллара = 2.0 рубля");
                break;
            }
            case "Евро": {
                System.out.println("Текущий курс евро = 2.5 рубля");
                break;
            }
            case "Российский рубль": {
                System.out.println("Текущий курс доллара = 30 копеек");
                break;
            }
            case "Гривна": {
                System.out.println("Текущий курс доллара = 1.0 рубль");
                break;
            }
            case "Польский злотый": {
                System.out.println("Текущий курс доллара = 57 копеек");
                break;
            }
            default: System.out.println("Нет такой валюты");
        }
    }
}
