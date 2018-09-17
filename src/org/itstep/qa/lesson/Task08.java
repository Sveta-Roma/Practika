package org.itstep.qa.lesson;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    // Пользователь вводит строку. Программа выводит количество символов самого длинного слова.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = sc.nextLine();
        int sym = str.length();
        System.out.println("Количество символов в строке равно " + sym);
        String [] result = str.split(" ");
        System.out.println("Количество слов в строке равно " + result.length);
        System.out.println(Arrays.toString(result));
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        /*
        int max = 0;
        int id = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (result[i] != " ") {
                count = count + 1;
            } else if (count > max) {
                max = count;
                id = i - count;
            }
            count = 0;
        }
        if (count > max) {
            max = count;
            id = sym - count + 1;
        }
        System.out.println("Количество символов самого длинного слова " + max);
        */

    }
}
