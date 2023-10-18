package lesson3_hw;

// Создать и заполнить массив. Вывести на экран. Заменить каждый элемент
// с нечетным индексом на 0. Вывести полученный массив на экран

import java.util.Arrays;

public class TaskAdd5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 89, 67, 45, 78, 23, -12};
        System.out.println(Arrays.toString(arr1));
        for (int i = 1; i < arr1.length; i += 2) {
            arr1[i] = 0;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
