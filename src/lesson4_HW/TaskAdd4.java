package lesson4_HW;

// Создать двумерный массив. Вывести на консоль диагонали массива

import java.util.Arrays;
import java.util.Random;

public class TaskAdd4 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);

            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("-------------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i != j && j != (arr[i].length - i - 1)) {
                    arr[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
