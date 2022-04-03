package chess.chessboard;

import chess.chessboard.position.File;
import chess.chessboard.position.Position;
import chess.chessboard.position.Rank;
import chess.game.Player;
import chess.piece.*;

import java.util.*;

import static chess.chessboard.position.File.*;
import static chess.game.Player.*;
import static chess.chessboard.position.Rank.*;

public final class Board {

    private final Map<Position, Piece> board;

    public Board() {
        board = new HashMap<>();
    }

    public void initBoard() {
        for (final Rank rank : Rank.values()) {
            createBlankIn(rank);
        }
    }

    private void createBlankIn(final Rank rank) {
        for (File file : File.values()) {
            board.put(Position.of(rank, file), new Blank(NONE, "."));
        }
    }

    public void createBlackPieces() {
        board.put(Position.of(EIGHT, A), new Rook(BLACK, "R"));
        board.put(Position.of(EIGHT, B), new Knight(BLACK, "N"));
        board.put(Position.of(EIGHT, C), new Bishop(BLACK, "B"));
        board.put(Position.of(EIGHT, D), new Queen(BLACK, "Q"));
        board.put(Position.of(EIGHT, E), new King(BLACK, "K"));
        board.put(Position.of(EIGHT, F), new Bishop(BLACK, "B"));
        board.put(Position.of(EIGHT, G), new Knight(BLACK, "N"));
        board.put(Position.of(EIGHT, H), new Rook(BLACK, "R"));
        for (final File file : File.values()) {
            board.put(Position.of(SEVEN, file), new Pawn(BLACK, "P"));
        }
    }

    public void createWhitePieces() {
        board.put(Position.of(ONE, A), new Rook(WHITE, "r"));
        board.put(Position.of(ONE, B), new Knight(WHITE, "n"));
        board.put(Position.of(ONE, C), new Bishop(WHITE, "b"));
        board.put(Position.of(ONE, D), new Queen(WHITE, "q"));
        board.put(Position.of(ONE, E), new King(WHITE, "k"));
        board.put(Position.of(ONE, F), new Bishop(WHITE, "b"));
        board.put(Position.of(ONE, G), new Knight(WHITE, "n"));
        board.put(Position.of(ONE, H), new Rook(WHITE, "r"));
        for (final File file : File.values()) {
            board.put(Position.of(TWO, file), new Pawn(WHITE, "p"));
        }
    }

    public Map<Position, Piece> getBoard() {
        return Collections.unmodifiableMap(board);
    }

    public void move(final Position source, final Position target) {
        Piece piece = board.get(source);
        checkNoneInSource(piece);
        checkMovable(source, target, piece);
        board.put(target, board.get(source));
        board.put(source, new Blank(NONE, "."));
    }

    private void checkMovable(final Position source, final Position target, final Piece piece) {
        if (!piece.canMove(source, target, board)) {
            throw new IllegalArgumentException("[ERROR] 기물이 해당 위치로 갈 수 없습니다.");
        }
    }

    private void checkNoneInSource(final Piece piece) {
        if (piece.isSame(NONE)) {
            throw new IllegalArgumentException("[ERROR] 선택한 위치에 기물이 없습니다.");
        }
    }

    public boolean isEndSituation() {
        return isKilledKing();
    }

    private boolean isKilledKing() {
        return board.values()
                .stream()
                .filter(Piece::isKing)
                .count() == 1;
    }

    public boolean checkRightTurn(final Player player, final Position source) {
        return board.get(source).isSame(player);
    }

    public boolean isSamePlayerIn(final Position position, final Player player) {
        return board.get(position).isSame(player);
    }

    public double addPieceScore(final Position position, final double score) {
        return board.get(position).addTo(score);
    }

    public boolean isPawn(final Position position) {
        return board.get(position).isPawn();
    }
}
