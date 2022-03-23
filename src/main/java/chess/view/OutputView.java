package chess.view;

import chess.*;

public class OutputView {

    public static final String BLANK_SQUARE = ".";

    public void printBoard(Board board) {
        for (Rank rank : Rank.values()) {
            for (File file : File.values()) {
                System.out.print(board.findSymbol(new Position(rank, file)));
            }
            System.out.println();
        }
    }
}
