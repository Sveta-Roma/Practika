package org.itstep.qa.lesson;

import java.util.Arrays;
import java.util.Random;

public class Task05 {
    // Найти максимальный и минимальный элементы ТРЕХ-мерного массива (заполнен случайными числами)
    public static void main(String[] args) {
        int [][][] a;
        a = new int[3][4][5];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = r.nextInt(20);
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.println(a[i][j][k]);
                }
                System.out.println();
            }
        }
        /*int max =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    if (a[i][j][k] > max) {
                        max = max
                    }

                }
            }
        }
        */
    }
}
