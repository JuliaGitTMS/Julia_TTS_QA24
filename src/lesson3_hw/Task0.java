package lesson3_hw;

// Создать массив целых чисел. Задать число с консоли.
// Проверить,входит ли данное число в массив.

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        int[] array = {12, 3, -4, 90, 1099, -23, 87, 96, 55};
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int check = 0;

        if (scanner.hasNextInt()) {
            int consoleNumber = scanner.nextInt();
            for (int value : array) {
                if (consoleNumber == value) {
                    System.out.println(consoleNumber + " входит в заданный массив");
                    check += 1;
                    break;
                }
            }
            if (check == 0) {
                System.out.println(consoleNumber + " не входит в заданный массив");
            }
        }
    }
}
