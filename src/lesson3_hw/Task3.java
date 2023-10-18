package lesson3_hw;

// Создать 2 массива из 5 чисел. Посчитать среднее арифметическое для каждого массива
// и вывести сообщение, для какого из массивов оно больше (либо они равны)

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100 + 1);
            arr2[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        if (sum1 / arr1.length > sum2 / arr2.length) {
            System.out.println("Среднее арифметическое 1го массива (" + sum1 / arr1.length +
                    ") больше среднего арифметического 2го массива (" + sum2 / arr2.length + ")");
        } else if (sum1 / arr1.length < sum2 / arr2.length) {
            System.out.println("Среднее арифметическое 1го массива (" + sum1 / arr1.length +
                    ") меньше среднего арифметического 2го массива (" + sum2 / arr2.length + ")");
        } else System.out.println("Средние арифметические 2х массивов равны " + sum1 / arr1.length);
    }
}
