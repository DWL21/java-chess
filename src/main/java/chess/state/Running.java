package chess.state;

import chess.chessBoard.Board;

public abstract class Running extends Started {

    public Running(final Board board) {
        super(board);
    }

    @Override
    public boolean isRunning() {
        return true;
    }

    @Override
    public boolean isStatus() {
        return false;
    }
}
