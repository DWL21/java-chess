package chess.piece;

import chess.Color;
import chess.Position;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static chess.Color.BLACK;
import static chess.Color.WHITE;
import static chess.File.D;
import static chess.Rank.EIGHT;
import static chess.Rank.ONE;

public class Queen extends Piece {

    private static final List<Piece> INIT_QUEEN = new ArrayList<>();

    private static final String symbol = "q";

    static {
        INIT_QUEEN.add(new Queen(BLACK, new Position(EIGHT, D)));
        INIT_QUEEN.add(new Queen(WHITE, new Position(ONE, D)));
    }

    public Queen(Color color, Position position) {
        super(color, position);
    }

    public String getSymbol() {
        return symbol;
    }

    public static List<Piece> getQueens() {
        return Collections.unmodifiableList(INIT_QUEEN);
    }
}
