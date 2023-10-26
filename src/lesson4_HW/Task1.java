package lesson4_HW;

// Создать программу для раскраски шахматной доски (создать массив String 8х8,
// с помощью циклов задать элементам значения B (Black) или W (White))

public class Task1 {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                } else chessBoard[i][j] = "B";
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
    }
}
