package chess.piece;

import chess.Player;

public final class Bishop extends Piece {
    public Bishop(final Player player) {
        super(player);
    }

    @Override
    public boolean isBishop() {
        return true;
    }
}
