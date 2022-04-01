package chess.piece;

import chess.Player;

public final class Rook extends Piece {

    public Rook(final Player player) {
        super(player);
    }

    @Override
    public boolean isRook() {
        return true;
    }
}
