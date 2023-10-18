package lesson3_hw;

// Создать и заполнить массив случайными числами (Math.random())
// Размер массива вводится с консоли.
// Вывести max, min и avg значания

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива (целое положительное число)");
        Scanner scanner1 = new Scanner(System.in);
        while (!scanner1.hasNextInt()) {
            System.out.println("Неверные данные. Попробуйте снова");
            scanner1.next();
        }
        int arr[] = new int[scanner1.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальное значение = " + max);
        System.out.println("Минимальное значение = " + min);
        System.out.println("Среднее значение = " + Math.round((float)sum / arr.length));
    }
}
