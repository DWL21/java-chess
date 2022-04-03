package chess.piece;

import chess.Player;

import static chess.piece.Symbol.*;

public final class Blank extends Piece {

    public Blank() {
        super(Player.NONE);
    }

    @Override
    public String getSymbol() {
        return BLANK.playerSymbol(player);
    }

    @Override
    public boolean isBlank() {
        return true;
    }
}
