package chess;

import chess.board.ChessBoard;

public class Application {

    public static void main(String[] args) {
        ChessGame chessGame = new ChessGame();
        ChessBoard chessBoard = new ChessBoard();
        chessGame.run(chessBoard);
    }
}
