package chess.board;

import chess.Player;
import chess.piece.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static chess.Player.BLACK;
import static chess.Player.WHITE;
import static chess.board.File.*;
import static chess.board.Rank.*;

public final class ChessBoard {

    static final Map<Coordinate, Piece> INITIAL_BOARD = new HashMap<>();

    final Map<Coordinate, Piece> chessBoard;

    public ChessBoard() {
        chessBoard = new HashMap<>(INITIAL_BOARD);
    }

    static {
        createBlanks();
        createWhitePieces();
        createBlackPieces();
    }

    private static void createBlanks() {
        for (Rank rank : List.of(THREE, FOUR, FIVE, SIX)) {
            createBlanks(rank);
        }
    }

    private static void createBlanks(final Rank rank) {
        for (File file : File.values()) {
            INITIAL_BOARD.put(new Coordinate(rank, file), new Blank());
        }
    }

    private static void createWhitePieces() {
        createPieces(ONE, WHITE, TWO);
    }

    private static void createBlackPieces() {
        createPieces(EIGHT, BLACK, SEVEN);
    }

    private static void createPieces(final Rank pieces, final Player player, final Rank pawn) {
        INITIAL_BOARD.put(new Coordinate(pieces, A), new Rook(player));
        INITIAL_BOARD.put(new Coordinate(pieces, B), new Knight(player));
        INITIAL_BOARD.put(new Coordinate(pieces, C), new Bishop(player));
        INITIAL_BOARD.put(new Coordinate(pieces, D), new Queen(player));
        INITIAL_BOARD.put(new Coordinate(pieces, E), new King(player));
        INITIAL_BOARD.put(new Coordinate(pieces, F), new Bishop(player));
        INITIAL_BOARD.put(new Coordinate(pieces, G), new Knight(player));
        INITIAL_BOARD.put(new Coordinate(pieces, H), new Rook(player));
        createPawns(pawn, player);
    }

    private static void createPawns(final Rank rank, final Player player) {
        for (File file : File.values()) {
            INITIAL_BOARD.put(new Coordinate(rank, file), new Pawn(player));
        }
    }

    public Map<Coordinate, Piece> getChessBoard() {
        return Collections.unmodifiableMap(chessBoard);
    }
}
