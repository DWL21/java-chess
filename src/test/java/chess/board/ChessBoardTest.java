package chess.board;

import chess.piece.Piece;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ChessBoardTest {

    @DisplayName("체스판의 64개의 칸이 제대로 생성 되었는지 확인한다.")
    @Test
    void initBoard() {
        final ChessBoard board = new ChessBoard();
        final Map<Coordinate, Piece> chessBoard = board.getChessBoard();

        assertThat(chessBoard.size()).isEqualTo(64);
    }
}
