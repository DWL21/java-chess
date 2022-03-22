package chess;

public class Square {
    Position position;
    Pieces piece;

    public Square(Position position, Pieces piece) {
        this.position = position;
        this.piece = piece;
    }
}
