package Lesson2_HW;

// Написать программу, где пользователь вводит целое положительное число,
// а программа суммирует все числа от 1 до этого числа

import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число:");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        if (scanner.hasNextInt()) {
            int userNumber = scanner.nextInt();
            if (userNumber > 0) {
                for (int i = 1; i <= userNumber; i++) {
                    sum += i;
                }
                System.out.println("Сумма: " + sum);
            } else {
                System.out.println("Данные некорректны");
            }
        } else {
            System.out.println("Данные некорректны");
        }
    }
}
