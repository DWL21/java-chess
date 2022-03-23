package chess.piece;

import chess.Color;
import chess.Position;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import static chess.Color.BLACK;
import static chess.Color.WHITE;
import static chess.File.C;
import static chess.File.F;
import static chess.Rank.EIGHT;
import static chess.Rank.ONE;

public class Bishop extends Piece {

    private static final List<Piece> INIT_BISHOP = new ArrayList<>();

    private static final String SYMBOL = "b";

    static {
        INIT_BISHOP.add(new Bishop(BLACK, new Position(EIGHT, C)));
        INIT_BISHOP.add(new Bishop(BLACK, new Position(EIGHT, F)));
        INIT_BISHOP.add(new Bishop(WHITE, new Position(ONE, C)));
        INIT_BISHOP.add(new Bishop(WHITE, new Position(ONE, F)));
    }


    public Bishop(Color color, Position position) {
        super(color, position);
    }

    public String getSymbol() {
        if (this.color == BLACK) {
            return SYMBOL.toUpperCase(Locale.ROOT);
        }
        return SYMBOL;
    }

    public static List<Piece> getBishops() {
        return Collections.unmodifiableList(INIT_BISHOP);
    }
}
