package Pieces;

public class Board {
    private int numRows, numCols;
    private final PieceType[][] board;


    public Board(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        board = new PieceType[numRows][numCols];
    }


    public PieceType[][] getBoard() {
        return board;
    }

    public boolean makeMove(Player player, PieceType piece, int row, int col) {
        if(row < 0 || col < 0 || row >= numRows || col >= numCols || board[row][col] != null)
            return false;

        board[row][col] = piece;
        return true;
    }

    public void printBoard() {
        for(int i = 0; i < numRows; ++i) {
            for(int j = 0; j < numCols; ++j) {
                if(board[i][j] != null)
                    System.out.print(board[i][j] + "   ");
                else
                    System.out.print("    ");
                System.out.print(" | ");

            }
            System.out.println();
        }
    }
}
