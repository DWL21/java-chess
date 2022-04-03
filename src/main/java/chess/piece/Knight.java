package chess.piece;

import chess.Player;

import static chess.piece.Symbol.*;

public final class Knight extends Piece {

    public Knight(final Player player) {
        super(player);
    }

    @Override
    public boolean isKnight() {
        return true;
    }

    @Override
    public String getSymbol() {
        return KNIGHT.playerSymbol(player);
    }
}
