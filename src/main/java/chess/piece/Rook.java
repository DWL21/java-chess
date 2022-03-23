package chess.piece;

import chess.Color;
import chess.Position;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static chess.Color.BLACK;
import static chess.Color.WHITE;
import static chess.File.*;
import static chess.Rank.EIGHT;
import static chess.Rank.ONE;

public class Rook extends Piece{

    private static final List<Piece> INIT_ROOK = new ArrayList<>();

    private static final String symbol = "r";

    public Rook(Color color, Position position) {
        super(color, position);
    }

    static {
        INIT_ROOK.add(new Rook(BLACK, new Position(EIGHT,  A)));
        INIT_ROOK.add(new Rook(BLACK, new Position(EIGHT, H)));
        INIT_ROOK.add(new Rook(WHITE, new Position(ONE, A)));
        INIT_ROOK.add(new Rook(WHITE, new Position(ONE, H)));
    }

    public String getSymbol() {
        return symbol;
    }

    public static List<Piece> getRooks() {
        return Collections.unmodifiableList(INIT_ROOK);
    }
}
