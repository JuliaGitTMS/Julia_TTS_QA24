package lesson3_hw;

// Создать массив целых чисел. Задать число с консоли.
// Удалить все вхождения заданного числа из массива либо
// вывести сособщение о том, что числа в массиве нет.

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {124, 33, -41, 900, 10, -23, 817, 9, 33, 5};
        System.out.println("Введите целое число:");
        Scanner scanner = new Scanner(System.in);
        int check = 0;

        if (scanner.hasNextInt()) {
            int consoleNumber = scanner.nextInt();
            for (int value : array) {
                if (consoleNumber == value) {
                    check += 1;
                }
            }
            if (check == 0) {
                System.out.println("Заданное число не входит в массив");
            } else {
                int array1[] = new int[array.length - check];
                for (int i = 0, j = 0; i < array.length; i++) {
                    if (consoleNumber != array[i]) {
                        array1[j] = array[i];
                        j++;
                    }
                }
                System.out.println(Arrays.toString(array1));
            }
        } else System.out.println("Неверные данные");
    }
}
