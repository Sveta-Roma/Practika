package org.itstep.qa.lesson;

import java.util.Random;

public class Task09_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] intArr = new int [3][3];
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                intArr[i][j] = random.nextInt(25);
            }
        }
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                System.out.print(intArr[i][j] + " ");
            }
            System.out.println();
        }
        // находим максимальное значение
        int max = Integer.MIN_VALUE, indexI = 0, indexJ = 0;
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[0].length; j++) {
                if (intArr[i][j] > max) {
                    max = intArr[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        // выводим на экран максимальное значение
        System.out.println("Максимальное значение = " + max);
        System.out.println("Индекс i = " + indexI);
        System.out.println("Индекс j = " + indexJ);
        // находим соседей
        if (indexI == 0){
            System.out.println("Соседа сверху нет");
        } else {
            System.out.println("Соседа сверху " + intArr[indexI - 1][indexJ]);
        }
        if (indexI == intArr.length - 1){
            System.out.println("Соседа снизу нет");
        } else {
            System.out.println("Соседа снизу " + intArr[indexI + 1][indexJ]);
        }
        if (indexJ == 0){
            System.out.println("Соседа слева нет");
        } else {
            System.out.println("Соседа слева " + intArr[indexI][indexJ - 1]);
        }
        if (indexJ == intArr.length - 1){
            System.out.println("Соседа справа нет");
        } else {
            System.out.println("Соседа справа " + intArr[indexI][indexJ + 1]);
        }
    }
}
