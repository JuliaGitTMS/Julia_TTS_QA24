package Lesson2_HW;

import java.util.Scanner;

//Вывод названия поры года по номеру месяца (if-else if)

public class Task1_2 {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца:");
        Scanner scanner = new Scanner(System.in);
        int i;
        if (!scanner.hasNextInt()) {
            System.out.println("Некорректные данные");
        } else {
            i = scanner.nextInt();
            if (i == 1 || i == 2 || i == 12) {
                System.out.println("Зима");
            } else if (i >= 3 && i <= 5) {
                System.out.println("Весна");
            } else if (i >= 6 && i <= 8) {
                System.out.println("Лето");
            } else if (i >= 9 && i <= 11) {
                System.out.println("Осень");
            } else {
                System.out.println("Некорректные данные");
            }
        }
    }
}
