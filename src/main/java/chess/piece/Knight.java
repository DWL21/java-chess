package chess.piece;

import chess.Player;
import chess.board.Coordinate;
import chess.board.Direction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static chess.board.Direction.*;
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

    @Override
    public List<Coordinate> findMovableCoordinates(Player player, Map<Coordinate, Piece> chessBoard, Coordinate source) {
        if (player.equals(this.player)) {
            return canMovable();
        }
        return new ArrayList<>();
    }

    @Override
    protected List<Direction> getDirections() {
        return List.of(
                KNIGHT_EAST_RIGHT,
                KNIGHT_EAST_LEFT,
                KNIGHT_WEST_RIGHT,
                KNIGHT_WEST_LEFT,
                KNIGHT_SOUTH_RIGHT,
                KNIGHT_SOUTH_LEFT,
                KNIGHT_NORTH_RIGHT,
                KNIGHT_NORTH_LEFT
        );
    }
}
