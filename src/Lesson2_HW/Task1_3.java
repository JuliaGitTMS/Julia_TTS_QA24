package Lesson2_HW;

// Определить, четное число или нет

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            System.out.println("Вы ввели некорректные данные. Программа работает только с целыми числами");
        } else if (scanner.nextInt() % 2 == 0) {
            System.out.println("Вы ввели четное число");
        } else
            System.out.println("Вы ввели нечетное число");
    }
}