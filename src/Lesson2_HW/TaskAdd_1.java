package Lesson2_HW;

// Вывести на экран первые 11 членов последовательности Фибоначчи

public class TaskAdd_1 {
    public static void main(String[] args) {
        int k0 = 0;
        int k1 = 1;
        int k2;
        System.out.print(k0 + " " + k1 + " ");
        for (int i = 3; i <= 11; i++) {
            k2 = k0 + k1;
            System.out.print(k2 + " ");
            k0 = k1;
            k1 = k2;
        }
    }
}
