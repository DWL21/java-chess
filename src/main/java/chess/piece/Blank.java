package chess.piece;

import chess.Player;

public final class Blank extends Piece {

    public Blank() {
        super(Player.NONE);
    }

    @Override
    public boolean isBlank() {
        return true;
    }
}
