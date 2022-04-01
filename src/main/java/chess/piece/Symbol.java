package chess.piece;

public enum Symbol {

    KNIGHT("♘", "♞"),
    BISHOP("♗", "♝"),
    ROOK("♖", "♜"),
    QUEEN("♕", "♛"),
    KING("♔", "♚"),
    PAWN("♙", "♟"),
    BLANK(".", ".")
    ;

    private final String white;
    private final String black;

    Symbol(String white, String black) {
        this.white = white;
        this.black = black;
    }

    public String white() {
        return white;
    }

    public String black() {
        return black;
    }
}
