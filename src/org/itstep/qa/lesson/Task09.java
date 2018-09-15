package org.itstep.qa.lesson;

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
        Random r = new Random();
        int [][] a = new int[3][3];
        for (int i = 0;  i<10; i++){
            for (int j = 0;  j<10; j++){
                //a[j] = r.nextInt();
                //a[i] = r.nextInt();

            }
        }
    }
}
