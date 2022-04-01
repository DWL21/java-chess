package chess.piece;

import chess.Player;

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

    Symbol(final String white, final String black) {
        this.white = white;
        this.black = black;
    }

    public String getSymbol(final Player player) {
        if (player.isWhite()) {
            return white;
        }
        return black;
    }
}
