package chess.piece;

import chess.Color;
import chess.File;
import chess.Position;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import static chess.Color.BLACK;
import static chess.Color.WHITE;
import static chess.Rank.*;

public class Pawn extends Piece {

    private static final List<Piece> INIT_PAWN = new ArrayList<>();

    private static final String SYMBOL = "p";

    static {
        for (File file : File.values()) {
            INIT_PAWN.add(new Pawn(BLACK, new Position(SEVEN, file)));
            INIT_PAWN.add(new Pawn(WHITE, new Position(TWO, file)));
        }
    }

    public Pawn(Color color, Position position) {
        super(color, position);
    }

    public String getSymbol() {
        if (this.color == BLACK) {
            return SYMBOL.toUpperCase(Locale.ROOT);
        }
        return SYMBOL;
    }
    public static List<Piece> getPawns() {
        return Collections.unmodifiableList(INIT_PAWN);
    }
}
