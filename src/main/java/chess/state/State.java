package chess.state;

import chess.chessBoard.position.Position;
import chess.piece.Piece;

import java.util.Map;

public interface State {
    boolean isRunning();

    State proceed(final String command);

    Map<Position, Piece> getBoard();

    boolean isStatus();
}
