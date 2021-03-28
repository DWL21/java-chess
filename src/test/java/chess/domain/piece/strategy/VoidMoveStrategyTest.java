package chess.domain.piece.strategy;

import chess.domain.board.Board;
import chess.domain.board.RequestedBoard;
import chess.domain.board.Position;
import chess.domain.exceptions.InvalidMoveException;
import chess.domain.piece.PieceColor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class VoidMoveStrategyTest {

    @DisplayName("움직이지 않은 경우 예외 발생")
    @Test
    void move_ExceptionThrown() {
        Board board = new Board(RequestedBoard.board());

        Position source = Position.of('c', 4);
        Position target = Position.of('c', 6);

        assertThatThrownBy(() -> board.move(source, target, PieceColor.WHITE))
            .isInstanceOf(InvalidMoveException.class)
            .hasMessageContaining(VoidMoveStrategy.VOID_MESSAGE);
    }
}