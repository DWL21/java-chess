package chess.piece;

import chess.Player;

import static chess.piece.Symbol.*;

public final class Queen extends Piece {

    public Queen(final Player player) {
        super(player);
    }

    @Override
    public boolean isQueen() {
        return true;
    }

    @Override
    public String getSymbol() {
        return QUEEN.playerSymbol(player);
    }
}
