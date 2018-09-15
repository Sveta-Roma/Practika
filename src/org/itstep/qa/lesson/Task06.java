package org.itstep.qa.lesson;

import java.util.Scanner;

public class Task06 {
    /* Заданы моменты начала и конца некоторого промежутка времени в часах, минутах и секундах (в пределах одних суток). Найти продолжительность этого промежутка в тех же единицах измерения.
    Пример вывода:
    Начало  10:30:45
    Конец    13:20:15
    Продолжительность     2:49:30
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте время: ");
        System.out.println("Начало");
        String nach = sc.nextLine();
        String[] a = nach.split(":");
        System.out.println("Конец");
        String end = sc.nextLine();

    }
}
