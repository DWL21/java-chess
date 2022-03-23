package chess;

import chess.piece.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Board {

    private static final String BLANK_SYMBOL = ".";

    private final List<Piece> pieces;

    public Board() {
        pieces = new ArrayList<>();
        pieces.addAll(King.getKings());
        pieces.addAll(Queen.getQueens());
        pieces.addAll(Rook.getRooks());
        pieces.addAll(Bishop.getBishops());
        pieces.addAll(Knight.getKnights());
        pieces.addAll(Pawn.getPawns());
    }

    public String findSymbol(Position position){
        for (Piece piece : pieces) {
            if (piece.existsOn(position)) {
                return piece.getSymbol();
            }
        }
        return BLANK_SYMBOL;
    }
}
