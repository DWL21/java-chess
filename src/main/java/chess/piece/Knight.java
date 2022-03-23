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

public class Knight extends Piece{

    private static final List<Piece> INIT_KNIGHT = new ArrayList<>();
    private static final String SYMBOL = "n";

    static {
        INIT_KNIGHT.add(new Knight(BLACK, new Position(EIGHT,  B)));
        INIT_KNIGHT.add(new Knight(BLACK, new Position(EIGHT, G)));
        INIT_KNIGHT.add(new Knight(WHITE, new Position(ONE, B)));
        INIT_KNIGHT.add(new Knight(WHITE, new Position(ONE, G)));
    }

    public Knight(Color color, Position position) {
        super(color, position);
    }

    public String getSymbol() {
        if (this.color == BLACK) {
            return SYMBOL.toUpperCase(Locale.ROOT);
        }
        return SYMBOL;
    }

    public static List<Piece> getKnights() {
        return Collections.unmodifiableList(INIT_KNIGHT);
    }
}
