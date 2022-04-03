package chess;

import chess.board.ChessBoard;
import chess.board.Coordinate;
import chess.board.File;
import chess.board.Rank;
import chess.piece.Piece;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ChessGame {

    public void run(ChessBoard chessBoard) {
        OutputView outputView = new OutputView();
        outputView.printChessBoard(getChessBoardSymbols(chessBoard.getChessBoard()));
    }

    public List<String> getChessBoardSymbols(Map<Coordinate, Piece> chessBoard) {
        final List<String> chessBoardSymbols = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            symbolInRank(chessBoard, chessBoardSymbols, rank);
        }
        return chessBoardSymbols;
    }

    private void symbolInRank(Map<Coordinate, Piece> chessBoard, List<String> chessBoardSymbols, Rank rank) {
        for (File file : File.values()) {
            Coordinate coordinate = new Coordinate(rank, file);
            chessBoardSymbols.add(chessBoard.get(coordinate).getSymbol());
        }
    }
}
