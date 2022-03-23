package chess.piece;

import chess.Color;
import chess.Position;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import static chess.Color.BLACK;
import static chess.Color.WHITE;
import static chess.File.*;
import static chess.Rank.EIGHT;
import static chess.Rank.ONE;

public class King extends Piece{
    private static final List<Piece> INIT_KING = new ArrayList<>();

    private static final String SYMBOL = "k";

    static {
        INIT_KING.add(new King(BLACK, new Position(EIGHT, E)));
        INIT_KING.add(new King(WHITE, new Position(ONE, E)));
    }


    public King(Color color, Position position) {
        super(color, position);
    }

    public String getSymbol() {
        if (this.color == BLACK) {
            return SYMBOL.toUpperCase(Locale.ROOT);
        }
        return SYMBOL;
    }

    public static List<Piece> getKings() {
        return Collections.unmodifiableList(INIT_KING);
    }
}
