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
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        System.out.println("Начало: " + h1 + ":" + m1 + ":" + s1);
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        System.out.println("Конец: " + h2 + ":" + m2 + ":" + s2);
        int s = s2 -s1;
        if (s < 0) {
            s = s + 60;
            m2 = m2 - 1;
        }
        int m = m2 - m1;
        if (m < 0) {
            m = m +60;
            h2 = h2 - 1;
        }
        int h = h2 - h1;
        if (h < 0) {
            h = h +24;
        }
        System.out.println("Продолжительность: " + h + ":" + m + ":" + s);
    }
}
