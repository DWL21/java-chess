package chess;

import chess.board.ChessBoard;
import chess.board.Coordinate;
import chess.board.File;
import chess.board.Rank;
import chess.piece.Piece;
import chess.view.InputView;
import chess.view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static chess.Command.*;

public final class ChessGame {

    public void run(final ChessBoard chessBoard) {
        OutputView outputView = new OutputView();
        InputView inputView = new InputView();
        outputView.printGameStartInstruction();
        String command = inputCommand(inputView, outputView);
        while (END.isUserInput(command)) {
            outputView.printChessBoard(getChessBoardSymbols(chessBoard.getChessBoard()));
            command = inputCommand(inputView, outputView);
        }
    }

    private String inputCommand(final InputView inputView, final OutputView outputView) {
        try {
            return inputView.inputCommand();
        } catch (IllegalArgumentException e) {
            outputView.printErrorMessage(e.getMessage());
            return inputCommand(inputView, outputView);
        }
    }

    public List<String> getChessBoardSymbols(final Map<Coordinate, Piece> chessBoard) {
        final List<String> chessBoardSymbols = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            symbolInRank(chessBoard, chessBoardSymbols, rank);
        }
        return chessBoardSymbols;
    }

    private void symbolInRank(final Map<Coordinate, Piece> chessBoard, final List<String> chessBoardSymbols, Rank rank) {
        for (File file : File.values()) {
            Coordinate coordinate = new Coordinate(rank, file);
            chessBoardSymbols.add(chessBoard.get(coordinate).getSymbol());
        }
    }
}
