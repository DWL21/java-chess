package chess.piece;

import chess.Player;

import static chess.piece.Symbol.*;

public final class Bishop extends Piece {

    public Bishop(final Player player) {
        super(player);
    }

    @Override
    public boolean isBishop() {
        return true;
    }

    @Override
    public String getSymbol() {
        return BISHOP.playerSymbol(player);
    }
}
