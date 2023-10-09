package Lesson2_HW;

// Вывести 10 первых чисел последовательности 0, -5, -10...

public class Task2_5 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while (j < 10) {
            System.out.println(i);
            i -= 5;
            j++;
        }
    }
}
