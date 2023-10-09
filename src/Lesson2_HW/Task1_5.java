package Lesson2_HW;

// По введенному номеру определить цвет радуги

import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        System.out.println("Введите номер цвета:");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            System.out.println("Данные некорректны");
        } else {
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Красный");
                    break;
                case 2:
                    System.out.println("Оранжевый");
                    break;
                case 3:
                    System.out.println("Желтый");
                    break;
                case 4:
                    System.out.println("Зеленый");
                    break;
                case 5:
                    System.out.println("Голубой");
                    break;
                case 6:
                    System.out.println("Синий");
                    break;
                case 7:
                    System.out.println("Фиолетовый");
                    break;
                default:
                    System.out.println("Данные некорректны");
            }
        }
    }
}
