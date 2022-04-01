package chess.piece;

import chess.Player;

public final class Knight extends Piece {

    public Knight(final Player player) {
        super(player);
    }

    @Override
    public boolean isKnight() {
        return true;
    }
}
