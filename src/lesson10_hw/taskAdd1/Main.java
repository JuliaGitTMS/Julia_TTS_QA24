package lesson10_hw.taskAdd1;

/*Пользователь вводит набор чисел одной строкой (1,2,5,7,2,1,9)
 Избавиться от повторяющихся элементов в строке и вывести на экран*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        String[] strArr = scanner.nextLine().split("\\D");
        for (String s : strArr) {
            set.add(s);
        }
        System.out.println(set);

    }
}
