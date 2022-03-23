package chess.piece;

import chess.Color;
import chess.File;
import chess.Position;
import chess.Rank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static chess.Color.*;
import static chess.File.*;
import static chess.Rank.*;

public class Bishop extends Piece {

    private static final List<Piece> INIT_BISHOP = new ArrayList<>();

    private static final String symbol = "b";

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
        return symbol;
    }

    public static List<Piece> getBishops() {
        return Collections.unmodifiableList(INIT_BISHOP);
    }
}
