package chess.piece;

import chess.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PawnTest {

    @DisplayName("폰이 올바르게 생성되었을 때 true 를 반환하는 것을 확인한다.")
    @Test
    void is_pawn() {
        Piece piece = new Pawn(Player.WHITE);

        assertThat(piece.isPawn()).isTrue();
    }

    @DisplayName("폰 이외에 다른 기물이 생성되었을 때 false 를 반환하는 것을 확인한다.")
    @Test
    void is_not_pawn() {
        Piece piece = new King(Player.WHITE);

        assertThat(piece.isPawn()).isFalse();
    }
}