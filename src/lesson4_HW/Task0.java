package lesson4_HW;

// Создать трехмерный массив целых чисел. Увеличить каждый элемент
// массива на число, заданное с консоли

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        System.out.println("Введите целое  число:");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Неверные данные. Попробуйте снова:");
            scanner.next();
        }
        int incr = scanner.nextInt();
        int[][] dimArr = new int[m][n];
        Random random = new Random();
        System.out.println("Исходный массив:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dimArr[i][j] = random.nextInt(100);
                System.out.print(dimArr[i][j] + " ");
                dimArr[i][j] += incr;
            }
            System.out.println();
        }
        System.out.println("Массив, где каждый элемент увеличен на " + incr);
        System.out.println(Arrays.deepToString(dimArr));
    }
}
