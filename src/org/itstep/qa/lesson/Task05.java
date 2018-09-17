package org.itstep.qa.lesson;

import java.util.Arrays;
import java.util.Random;

public class Task05 {
    // Здесь максимального не нашла
    // Найти максимальный и минимальный элементы ТРЕХ-мерного массива (заполнен случайными числами)
    public static void main(String[] args) {
        int [][][] a;
        a = new int[2][2][2];
        Random r = new Random();
        // заполнила массив
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = r.nextInt(100);
                }
            }
        }
        // вывела массив
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.println(a[i][j][k]);
                }
                System.out.println();
            }
        }
        // нашла минимальный элемент
        int min = a[0][0][0];
        //int max = a[0][0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    if (a[i][j][k] < min) {
                        min = a[i][j][k];
                    }
                }
            }
        }
        System.out.println("Минимальный элемент трехмерного массива равен " + min);
    }
}
