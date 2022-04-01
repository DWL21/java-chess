package chess.piece;

import chess.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BishopTest {

    @DisplayName("비솝이 올바르게 생성되었을 때 true 를 반환하는 것을 확인한다.")
    @Test
    void is_bishop() {
        Piece piece = new Bishop(Player.WHITE);

        assertThat(piece.isBishop()).isTrue();
    }

    @DisplayName("비솝이 아닌 다른 기물이 생성되었을 때 false 를 반환하는 것을 확인한다.")
    @Test
    void is_not_bishop() {
        Piece piece = new Pawn(Player.WHITE);

        assertThat(piece.isBishop()).isFalse();
    }
}