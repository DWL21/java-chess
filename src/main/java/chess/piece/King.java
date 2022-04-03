package chess.piece;

import chess.Player;

import static chess.piece.Symbol.*;

public final class King extends Piece {

    public King(final Player player) {
        super(player);
    }

    @Override
    public boolean isKing() {
        return true;
    }

    @Override
    public String getSymbol() {
        return KING.playerSymbol(player);
    }
}
