import Pieces.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    Deque<Player> q;
    Scanner scanner = new Scanner(System.in);
    Board board;
    private int numRows, numCols;
    Player player1, player2;
    PieceX pieceX = new PieceX();
    PieceO pieceO = new PieceO();

    public void initialize() {
        q = new LinkedList<>();

        player1 = new Player("Player1", pieceX.getPieceType());
        player2 = new Player("Player2", pieceO.getPieceType());

        q.offerLast(player1);
        q.offerLast(player2);

        numRows = 3;
        numCols = 3;

        board = Board.getInstance(numRows, numCols);
    }

    public void play() {
        int row, col, numMoves = 0;

        while(true) {
           Player player = q.pollFirst();

           System.out.println("Enter row and column where to put piece separated by comma");

           String input = scanner.nextLine();

           String[] s = input.split(",");

           row = Integer.parseInt(s[0]);
           col = Integer.parseInt(s[1]);

           boolean isMove = board.makeMove(player, player.getPiece(), row, col);

           if(!isMove) {
                q.offerFirst(player);
                continue;
           }

           board.printBoard();

           if(finished(row,  col, player.getPiece())) {
               System.out.println(player.getName() + " WINS");
               break;
           }

           numMoves++;
           if(numMoves == numRows * numCols) {
               System.out.println("TIE");
               break;
           }

           q.offerLast(player);
        }
    }

    public boolean finished(int row, int col, PieceType piece) {
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagMatch = true;
        boolean adiagMatch = true;

        for(int i = 0; i < numCols; ++i) {
            if(board.getBoard()[row][i] == null || board.getBoard()[row][i] != piece) {
                rowMatch = false;
                break;
            }
        }

        for(int i = 0; i < numRows; ++i) {
            if(board.getBoard()[i][col] == null || board.getBoard()[i][col] != piece) {
                colMatch = false;
                break;
            }
        }

        for(int i = 0; i < numRows; ++i) {
            if(board.getBoard()[i][i] == null || board.getBoard()[i][i] != piece) {
                diagMatch = false;
                break;
            }
        }

        for(int i = 0; i < numRows; ++i) {
            if(board.getBoard()[i][numCols - i - 1] == null || board.getBoard()[i][numCols - i - 1] != piece) {
                adiagMatch = false;
                break;
            }
        }

        return rowMatch || colMatch || diagMatch || adiagMatch;
    }
}
