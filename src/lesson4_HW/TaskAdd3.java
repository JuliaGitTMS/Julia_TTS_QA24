package lesson4_HW;

// Создать двумерный массив целых чисел. Вывести в консоль сумму всех лементов массива

import java.util.Arrays;
import java.util.Random;

public class TaskAdd3 {
    public static void main(String[] args) {
        int[][] arr = new int[5][3];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
                sum += arr[i][j];
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Сумма всех элементов = " + sum);
    }
}
