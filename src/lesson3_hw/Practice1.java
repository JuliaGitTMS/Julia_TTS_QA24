package lesson3_hw;

// Задан массив int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13}
// Найти max и min элемент массива

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальное значение = " + max);
        System.out.println("Минимальное значение = " + min);
    }
}
