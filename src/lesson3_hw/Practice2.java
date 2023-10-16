package lesson3_hw;

// Организовать ввод массива с клавиатуры.
// Размер массива и его элементы ввести сиспользованием Scanner

import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива (целое положительное число)");
        Scanner scanner1 = new Scanner(System.in);
        while (!scanner1.hasNextInt()) {
            System.out.println("Неверные данные. Попробуйте снова");
            scanner1.next();
        }

        System.out.println("Введите элементы массива");
        Scanner scanner2 = new Scanner(System.in);
        if (scanner2.hasNextInt()) {
            int arr[] = new int[scanner1.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner2.nextInt();
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
