package lesson4_HW;

// Умножение матриц. Создать 2 массива целых чисел.
// { {1,0,0,0},{0,1,0,0},{0,0,0,0} }
// { {1,2,3},{1,1,1},{0,0,0},{2,1,0} }
// Ожидаемый результат 1 2 3 1 1 1 0 0 0

import java.util.Arrays;

public class TaskAdd2 {
    public static void main(String[] args) {
        int[][] dimArr1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] dimArr2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int[][] dimArrResult = new int[dimArr1.length][dimArr2[0].length];
        for (int i = 0; i < dimArrResult[0].length; i++) {
            for (int j = 0; j < dimArrResult.length; j++) {
                for (int m = 0; m < dimArr1[0].length; m++) {
                    dimArrResult[i][j] = dimArrResult[i][j] + dimArr1[i][m] * dimArr2[m][j];

                }
                System.out.print(dimArrResult[i][j] + " ");
            }
        }
    }
}
