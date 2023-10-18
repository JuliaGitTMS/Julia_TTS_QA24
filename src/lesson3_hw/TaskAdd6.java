package lesson3_hw;

// Создать массив строк, заполнить его именами, отсортировать, вывести в консоль

import java.util.Arrays;

public class TaskAdd6 {
    public static void main(String[] args) {
        String arr [] = {"Jack", "Kate", "Julia", "Bob", "Mike" };
        Arrays.sort (arr);
        System.out.println(Arrays.toString(arr));
    }
}
