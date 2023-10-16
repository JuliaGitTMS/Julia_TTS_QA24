package lesson3_hw;

// Создать массив из n случайных целых чисел (5 < размер массива <=10; вводится с консоли)
// Создать второй массив только из четных элементов первого и вывести его на экран

import java.util.Arrays;
import java.util.Scanner;

public class TaskAdd4 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива от 5 до 10 (включительно):");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (input <= 5 || input > 10) {
                System.out.println("Данные некорректны. Повторите ввод:");
            } else {
                int arr1[] = new int[input];
                int count = 0;
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = (int) (Math.random() * 10 + 1);
                    if (arr1[i] % 2 == 0) {
                        count++;
                    }
                }
                System.out.println("Исходный массив- " + Arrays.toString(arr1));
                int arr2[] = new int[count];
                int j = 0;
                for (int i = 0; i < arr1.length; i++) {
                    if (arr1[i] % 2 == 0) {
                        arr2[j] = arr1[i];
                        j++;
                    }
                }
                System.out.println("Массив четных чисел- " + Arrays.toString(arr2));
                break;
            }
        }
    }
}
