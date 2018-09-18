package org.itstep.qa.lesson;

import java.util.Scanner;

public class Task08_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String line = scanner.nextLine();
        String [] words = line.split(" +");// не важно сколько пробелов
        int result = 0;
        for (String tempWord : words){
            if (tempWord.length() > result){
                result = tempWord.length();
            }
        }
        System.out.println("Самое длиное слово: " + result + " символов");
     }
}
