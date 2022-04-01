package chess;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static chess.Player.*;
import static org.assertj.core.api.Assertions.assertThat;

class PlayerTest {

    @DisplayName("플레이어의 진영이 흰색일 때 true 를 반환하는지 확인한다.")
    @Test
    void is_white() {
        assertThat(WHITE.isWhite()).isTrue();
    }

    @DisplayName("플레이어의 진영이 흰색이 아닐 때 false 를 반환하는지 확인한다.")
    @Test
    void is_not_white() {
        assertThat(BLACK.isWhite()).isFalse();
    }

    @DisplayName("플레이어의 진영이 검은색일 때 true 를 반환하는지 확인한다.")
    @Test
    void is_black() {
        assertThat(BLACK.isBlack()).isTrue();
    }

    @DisplayName("플레이어의 진영이 검은색이 아닐 떄 false 를 반환하는지 확인한다.")
    @Test
    void is_not_black() {
        assertThat(WHITE.isBlack()).isFalse();
    }

    @DisplayName("플레이어의 진영이 없을 때 true 를 반환하는지 확인한다.")
    @Test
    void is_none() {
        assertThat(NONE.isNone()).isTrue();
    }

    @DisplayName("플레이어가 어떤 진영일 때 false 를 반환하는지 확인한다.")
    @Test
    void is_not_none() {
        assertThat(WHITE.isNone()).isFalse();
    }
}