package HW_09;

public class ChessBoard {
    public static void main(String[] args) {

        int size = 8; // Размер доски
        int[][] board = new int[size][size];

        // Заполнение доски
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Чередование белых и черных клеток
                if ((i + j) % 2 == 0) {
                    board[i][j] = 0; // Белая клетка
                } else {
                    board[i][j] = 1; // Черная клетка
                }
            }
        }

        // Вывод доски на экран
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // Переход на новую строку после каждой строки доски
        }
    }
}
    

