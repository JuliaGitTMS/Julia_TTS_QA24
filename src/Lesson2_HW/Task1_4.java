package Lesson2_HW;

// Для введенного числа температуры на улице вывести Тепло/Нормально/Холодно

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        System.out.println("Введите температуру:");
        Scanner scanner = new Scanner(System.in);
        int temperature;

        if (!scanner.hasNextInt()) {
            System.out.println("Вы ввели некорректные данные");
        } else {
            temperature = scanner.nextInt();
            if (temperature > -5) {
                System.out.println("Тепло");
            } else if (temperature <= -20) {
                System.out.println("Холодно");
            } else System.out.println("Нормально");
        }
    }
}
