package chess.piece;

import chess.Player;
import chess.board.Coordinate;
import chess.board.Direction;

import java.util.List;
import java.util.Map;

public abstract class Piece {

    protected final Player player;

    protected Piece(final Player player) {
        this.player = player;
    }

    public boolean isPawn() {
        return false;
    }

    public boolean isKnight() {
        return false;
    }

    public boolean isBishop() {
        return false;
    }

    public boolean isRook() {
        return false;
    }

    public boolean isQueen() {
        return false;
    }

    public boolean isKing() {
        return false;
    }

    public boolean isBlank() {
        return false;
    }

    public abstract String getSymbol();

    public List<Coordinate> findMovableCoordinates(Player player, Map<Coordinate, Piece> chessBoard, Coordinate source) {
        return null;
    }

    protected abstract List<Direction> getDirections();
}
