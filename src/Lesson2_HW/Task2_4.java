package Lesson2_HW;

// Вывеести на экран последовательность (цикл while)
// 7 14 21 28 35 42 49 56 63 70 77 84 91 98

public class Task2_4 {
    public static void main(String[] args) {
        int i = 7;
        while (i <= 98) {
            System.out.print(i + " ");
            i+=7;
        }
    }
}
