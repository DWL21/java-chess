package chess;

import java.util.*;
import java.util.stream.Collectors;

import static chess.File.*;
import static chess.Pieces.*;
import static chess.Rank.*;

public class Board {
    private static final Map<Position, Pieces> INIT_BOARD = new HashMap<>();

    private final List<Square> squares;

    static {
        initBlackPieces();
        initWhitePieces();
    }

    private static void initWhitePieces() {
        INIT_BOARD.put(new Position(ONE, A), WHITE_ROOK);
        INIT_BOARD.put(new Position(ONE, B), WHITE_KNIGHT);
        INIT_BOARD.put(new Position(ONE, C), WHITE_BISHOP);
        INIT_BOARD.put(new Position(ONE, D), WHITE_QUEEN);
        INIT_BOARD.put(new Position(ONE, E), WHITE_KING);
        INIT_BOARD.put(new Position(ONE, F), WHITE_BISHOP);
        INIT_BOARD.put(new Position(ONE, G), WHITE_KNIGHT);
        INIT_BOARD.put(new Position(ONE, H), WHITE_ROOK);
        for (File file : File.values()) {
            INIT_BOARD.put(new Position(TWO, file), WHITE_PAWN);
        }
    }

    private static void initBlackPieces() {
        INIT_BOARD.put(new Position(EIGHT, A), BLACK_ROOK);
        INIT_BOARD.put(new Position(EIGHT, B), BLACK_KNIGHT);
        INIT_BOARD.put(new Position(EIGHT, C), BLACK_BISHOP);
        INIT_BOARD.put(new Position(EIGHT, D), BLACK_QUEEN);
        INIT_BOARD.put(new Position(EIGHT, E), BLACK_KING);
        INIT_BOARD.put(new Position(EIGHT, F), BLACK_BISHOP);
        INIT_BOARD.put(new Position(EIGHT, G), BLACK_KNIGHT);
        INIT_BOARD.put(new Position(EIGHT, H), BLACK_ROOK);
        for (File file : File.values()) {
            INIT_BOARD.put(new Position(SEVEN, file), BLACK_PAWN);
        }
    }

    public Board() {
        squares = INIT_BOARD.entrySet()
                .stream()
                .map(a -> new Square(a.getKey(), a.getValue())).collect(Collectors.toList());
    }

    public List<Square> getSquares() {
        return squares;
    }
}
