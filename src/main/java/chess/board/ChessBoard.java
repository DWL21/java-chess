package chess.board;

import chess.Player;
import chess.piece.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static chess.Player.BLACK;
import static chess.Player.WHITE;

public final class ChessBoard {

    static final Map<Coordinate, Piece> INITIAL_BOARD = new HashMap<>();
    
    final Map<Coordinate, Piece> chessBoard;
    
    static {
        createBlanks();
        createWhitePieces();
        createBlackPieces();
    }

    private static void createBlanks() {
        for (int rank = 3; rank <= 6; rank++){
            createBlank(rank);
        }
    }

    private static void createBlank(final int rank) {
        for (int file = 1; file <= 8; file++) {
            INITIAL_BOARD.put(new Coordinate(rank, file), new Blank());
        }
    }

    private static void createWhitePieces() {
        INITIAL_BOARD.put(new Coordinate(1, 1), new Rook(WHITE));
        INITIAL_BOARD.put(new Coordinate(1, 2), new Knight(WHITE));
        INITIAL_BOARD.put(new Coordinate(1, 3), new Bishop(WHITE));
        INITIAL_BOARD.put(new Coordinate(1, 4), new Queen(WHITE));
        INITIAL_BOARD.put(new Coordinate(1, 5), new King(WHITE));
        INITIAL_BOARD.put(new Coordinate(1, 6), new Bishop(WHITE));
        INITIAL_BOARD.put(new Coordinate(1, 7), new Knight(WHITE));
        INITIAL_BOARD.put(new Coordinate(1, 8), new Rook(WHITE));
        createPawns(2, WHITE);
    }

    private static void createBlackPieces() {
        INITIAL_BOARD.put(new Coordinate(8, 1), new Rook(BLACK));
        INITIAL_BOARD.put(new Coordinate(8, 2), new Knight(BLACK));
        INITIAL_BOARD.put(new Coordinate(8, 3), new Bishop(BLACK));
        INITIAL_BOARD.put(new Coordinate(8, 4), new Queen(BLACK));
        INITIAL_BOARD.put(new Coordinate(8, 5), new King(BLACK));
        INITIAL_BOARD.put(new Coordinate(8, 6), new Bishop(BLACK));
        INITIAL_BOARD.put(new Coordinate(8, 7), new Knight(BLACK));
        INITIAL_BOARD.put(new Coordinate(8, 8), new Rook(BLACK));
        createPawns(7, BLACK);
    }

    private static void createPawns(final int rank, final Player player) {
        for (int file = 1; file <= 8; file++) {
            INITIAL_BOARD.put(new Coordinate(rank, file), new Pawn(player));
        }
    }

    public ChessBoard() {
        chessBoard = new HashMap<>(INITIAL_BOARD);
    }

    public Map<Coordinate, Piece> getChessBoard() {
        return Collections.unmodifiableMap(chessBoard);
    }
}
