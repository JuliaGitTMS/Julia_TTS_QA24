package Lesson2_HW;

// Написать программу, в которую вводится сумма вклада (float) и кол-во месяцев
// и вычисляется конечная сумма вклада с учетом процентов (7%)

import java.util.Scanner;

public class TaskAdd_2 {
    public static void main(String[] args) {
        System.out.println("Введите сумму вклада:");
        Scanner scanner1 = new Scanner(System.in);
        while (!scanner1.hasNextFloat()) {
            System.out.println("Вы ввели некорректные данные. Попробуйте снова:");
            scanner1.next();
        }
        float deposit = scanner1.nextFloat();
        System.out.println("Введите кол-во месяцев:");
        Scanner scanner2 = new Scanner(System.in);
        while (!scanner2.hasNextInt()) {
            System.out.println("Вы ввели некорректные данные. Попробуйте снова:");
            scanner2.next();
        }
        int month = scanner2.nextInt();

        for (int i = 0; i < month; i++) {
            deposit = (float) (deposit * 1.07);
        }
        System.out.println("Сумма вклада по истечении срока: " + deposit);
    }
}
