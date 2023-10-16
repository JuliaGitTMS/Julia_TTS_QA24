package lesson3_hw;

// Организовать генерацию массива с помощью класса Random
// Размер массива ввести с клавиатуры с использованием Scanner

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Неверные данные. Попробуйте снова");
            scanner.next();
        }

        int arr [] = new int[scanner.nextInt()];
        Random random = new Random();
        for (int i = 0; i<arr.length; i++){
            arr[i] = random.nextInt(300);
        }
        System.out.println(Arrays.toString(arr));
    }
}
