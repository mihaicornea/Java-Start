package main.java.com.encounters.v1;

public class Grid {
    int rows;
    int columns;
    char[][] board;

    public Grid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.board = new char[rows][columns];
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = '.';
            }
        }
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void placeCharacter (int x, int y, String character) {
        board [x][y] = character.charAt(0);
    }
}