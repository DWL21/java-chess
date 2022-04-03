package chess.piece;

import chess.Player;

public final class Pawn extends Piece {

    public Pawn(final Player player) {
        super(player);
    }

    @Override
    public boolean isPawn() {
        return true;
    }

    @Override
    public String getSymbol() {
        return Symbol.PAWN.playerSymbol(player);
    }
}
