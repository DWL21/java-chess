package chess.piece;

import chess.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static chess.piece.Symbol.BLANK;
import static chess.piece.Symbol.PAWN;
import static org.assertj.core.api.Assertions.assertThat;

class SymbolTest {

    @DisplayName("흰색 기물의 기호를 제대로 반환하는지 확인한다.")
    @Test
    void get_symbol_white() {
        String symbol = PAWN.getSymbol(Player.WHITE);

        assertThat(symbol).isEqualTo("♙");
    }

    @DisplayName("검은색 기물의 기호를 제대로 반환하는지 확인한다.")
    @Test
    void get_symbol_black() {
        String symbol = PAWN.getSymbol(Player.BLACK);

        assertThat(symbol).isEqualTo("♟");
    }

    @DisplayName("빈 좌표의 기호를 제대로 반환하는지 확인한다.")
    @Test
    void get_symbol_blank() {
        String symbol = BLANK.getSymbol(Player.BLACK);

        assertThat(symbol).isEqualTo(".");
    }
}