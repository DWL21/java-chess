package chess.board;

import chess.Player;

public enum Direction {

    KNIGHT_EAST_RIGHT(-1, 2),
    KNIGHT_EAST_LEFT(1, 2),
    KNIGHT_WEST_RIGHT(1, -2),
    KNIGHT_WEST_LEFT(-1, -2),
    KNIGHT_SOUTH_RIGHT(-2, -1),
    KNIGHT_SOUTH_LEFT(-2, 1),
    KNIGHT_NORTH_RIGHT(2, 1),
    KNIGHT_NORTH_LEFT(2, -1)
    ;

    private final int rank;
    private final int file;

    Direction(final int rank, final int file) {
        this.rank = rank;
        this.file = file;
    }

    public boolean isMovable(Coordinate source, Player player) {

    }
}
