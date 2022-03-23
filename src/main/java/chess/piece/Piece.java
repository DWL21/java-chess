package chess.piece;

import chess.Color;
import chess.Position;

public abstract class Piece {
    protected final Color color;
    protected final Position position;

    protected Piece(Color color, Position position) {
        this.color = color;
        this.position = position;
    }

    public boolean existsOn(Position position) {
        return this.position.equals(position);
    }

    public abstract String getSymbol();
}
