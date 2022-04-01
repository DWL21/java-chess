package chess.piece;

import chess.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PieceTest {

    @DisplayName("기물이 올바르게 생성되었는지 확인 한다.")
    @Test
    void is_pawn() {
        Piece piece = new Pawn(Player.WHITE);

        assertThat(piece.isPawn()).isTrue();
    }
}
