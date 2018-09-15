package org.itstep.qa.lesson;

import java.util.Scanner;

public class Task07 {
    // Пользователь вводит строку текста. После этого вводит контрольное слово. Программа выводит результат - содержится контрольное слово в строке или нет.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = sc.nextLine();
        System.out.println("Введите контрольное слово: ");
        String str_1 = sc.next();
        boolean b = str.contains(str_1);
        if (str.contains(str_1)){
            System.out.println(true);
        } else System.out.println(false);
    }
}
