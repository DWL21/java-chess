package chess.piece;

import chess.Player;

import static chess.piece.Symbol.*;

public final class Rook extends Piece {

    public Rook(final Player player) {
        super(player);
    }

    @Override
    public boolean isRook() {
        return true;
    }

    @Override
    public String getSymbol() {
        return ROOK.playerSymbol(player);
    }
}
