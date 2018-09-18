package org.itstep.qa.lesson;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        for (int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.println("Введите результат " + "произведения чисел " + i + " и " + j);
                result = scanner.nextInt();
                if (result == i*j){
                    System.out.println("Верно");
                }else {
                    System.out.println("Не верно");
                }
            }
        }
    }
}
