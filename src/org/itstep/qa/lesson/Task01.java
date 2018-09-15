package org.itstep.qa.lesson;

import java.util.Scanner;

public class Task01 {
    // Ввести длину ребра куба с клавиатуры. Вывести объем куба и площадь его боковой поверхности.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину ребра куба: ");
        int l = sc.nextInt();
        int v = l*l*l;
        System.out.println("Объем куба равно " + v);
        int s = 4*l*l;
        System.out.println("Площадь боковой поверхности куба равно " + s);
    }
}
