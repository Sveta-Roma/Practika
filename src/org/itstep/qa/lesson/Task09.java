package org.itstep.qa.lesson;

import java.util.Arrays;
import java.util.Random;

public class Task09 {
    /* Имеется двумерный массив, заполненный случайными значениями. Найти максимальный элемент этого массива. Вывести значение элемента, его индексы, а также значения его соседей в обоих  измерениях
    Пример.
            Массив:
            1   2   4
            7   9   8
            4   5   6
    Вывод на экран должен быть вида:
    Максимальный элемент 9
    Индексы: i = 1; j = 1
    Значения соседей: 2, 7, 8, 5
    */
    public static void main(String[] args) {
        int [][] a;
        a = new int[3][4];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = r.nextInt(20);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
    }
}

