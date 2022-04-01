package chess;

public enum Player {

    WHITE,
    BLACK,
    NONE
    ;

    public boolean isWhite() {
        return this == WHITE;
    }

    public boolean isBlack() {
        return this == BLACK;
    }

    public boolean isNone() {
        return !(isWhite() || isBlack());
    }
}
