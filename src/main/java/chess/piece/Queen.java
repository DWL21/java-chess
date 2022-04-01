package chess.piece;

import chess.Player;

public final class Queen extends Piece {

    public Queen(final Player player) {
        super(player);
    }

    @Override
    public boolean isQueen() {
        return true;
    }
}
