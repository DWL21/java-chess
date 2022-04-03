package chess.state;

import chess.chessBoard.Board;
import chess.chessBoard.position.Position;
import chess.piece.Piece;

import java.util.Map;

public abstract class Started implements State {

    protected final Board board;

    protected Started(Board board) {
        this.board = board;
    }

    @Override
    public Map<Position, Piece> getBoard() {
        return board.getBoard();
    }
}
