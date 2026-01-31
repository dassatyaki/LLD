package Pieces;

public class Player {
    private String name;
    private PieceType piece;

    public Player(String name, PieceType piece) {
        this.name = name;
        this.piece = piece;
    }

    public PieceType getPiece() {
        return piece;
    }

    public String getName() {
        return name;
    }
}
