package chess.piece;

import chess.Player;

public final class King extends Piece {

    public King(final Player player) {
        super(player);
    }

    @Override
    public boolean isKing() {
        return true;
    }
}
