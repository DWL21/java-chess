package chess;

public class Square {
    Position position;
    Pieces piece;

    public Square(Position position, Pieces piece) {
        this.position = position;
        this.piece = piece;
    }

    public int getFile() {
        return position.getFile();
    }

    public int getRank() {
        return position.getRank();
    }

    public String getPiece() {
        return piece.getValue();
    }
}
