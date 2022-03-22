package chess.view;

import chess.Board;
import chess.Square;

import java.util.ArrayList;
import java.util.List;

public class OutputView {

    public static final String BLANK_SQUARE = ".";

    public void printBoard(Board board) {
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            result.add(new ArrayList<>(List.of(BLANK_SQUARE, BLANK_SQUARE, BLANK_SQUARE, BLANK_SQUARE, BLANK_SQUARE, BLANK_SQUARE, BLANK_SQUARE, BLANK_SQUARE)));
        }

        List<Square> squares = board.getSquares();
        for (Square square : squares) {
            result.get(square.getRank() - 1)
                    .set(square.getFile() - 1, square.getPiece());
        }
        for (List<String> line : result) {
            for (String square : line) {
                System.out.print(square);
            }
            System.out.println();
        }
    }
}
