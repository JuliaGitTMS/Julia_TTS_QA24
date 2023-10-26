package lesson4_HW;

// Создать двумерный массив целых чисел. Отсортировать элементы в строках массива

import java.util.Arrays;
import java.util.Random;

public class TaskAdd5 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
            Arrays.sort(arr[i]);
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
