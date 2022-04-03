package chess.piece;

import chess.chessBoard.Direction;
import chess.game.Player;
import chess.chessBoard.position.Position;

import java.util.*;
import java.util.stream.Collectors;

import static chess.chessBoard.Direction.*;
import static chess.game.Player.BLACK;
import static chess.game.Player.NONE;

public class Pawn extends Piece {

    private static final double SCORE = 1;

    public Pawn(Player player, String symbol) {
        super(player, symbol);
    }

    public boolean canMove(Position source, Position target, Map<Position, Piece> board) {
        Set<Position> positions = new HashSet<>();
        positions.addAll(findCatchPositions(source, board, getCatchingDirections()));
        positions.addAll(findMovedOnePosition(source, board, getForwardDirection()));
        positions.addAll(findMovedTwoPosition(source, board, getForwardDirection(), getForwardTwoDirection()));
        return positions.contains(target);
    }

    private List<Position> findCatchPositions(Position source, Map<Position, Piece> board, List<Direction> directions) {
        return directions.stream()
                .filter(source::isInBoardAfterMoved)
                .map(source::createMovablePosition)
                .filter(position -> board.get(position).isOpponent(player))
                .collect(Collectors.toUnmodifiableList());
    }

    private List<Position> findMovedOnePosition(Position source, Map<Position, Piece> board, Direction direction) {
        List<Direction> directions = List.of(direction);
        return directions.stream()
                .filter(source::isInBoardAfterMoved)
                .map(source::createMovablePosition)
                .filter(position -> board.get(position).isSame(NONE))
                .collect(Collectors.toUnmodifiableList());
    }

    private List<Position> findMovedTwoPosition(Position source, Map<Position, Piece> board, Direction forwardDirection, Direction forwardTwoDirection) {
        if (!source.isInBoardAfterMoved(forwardTwoDirection)) {
            return List.of();
        }
        Position oneForwardPosition = source.createMovablePosition(forwardDirection);
        Position twoForwardPosition = source.createMovablePosition(forwardTwoDirection);
        if (source.isStartingPositionOfPawn() && isMovedTwoPosition(board.get(oneForwardPosition), board.get(twoForwardPosition))) {
            return List.of(twoForwardPosition);
        }
        return List.of();
    }

    private boolean isMovedTwoPosition(Piece pieceInOneForwardPosition, Piece pieceInTwoForwardPosition) {
        return pieceInOneForwardPosition.isSame(NONE) && !pieceInTwoForwardPosition.isSame(player);
    }

    private List<Direction> getCatchingDirections() {
        if (player.equals(BLACK)) {
            return List.of(SOUTHEAST, SOUTHWEST);
        }
        return List.of(NORTHEAST, NORTHWEST);
    }

    private Direction getForwardDirection() {
        if (player.equals(BLACK)) {
            return SOUTH;
        }
        return NORTH;
    }

    private Direction getForwardTwoDirection() {
        if (player.equals(BLACK)) {
            return BLACK_PAWN_FORWARD_TWO;
        }
        return WHITE_PAWN_FORWARD_TWO;
    }

    @Override
    public double addTo(double score) {
        return score + SCORE;
    }

    @Override
    public boolean isPawn() {
        return true;
    }
}
