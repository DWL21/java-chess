package chess.board;

import chess.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MovableCoordinatesTest {

    @DisplayName("흰색 나이트가 움직일 수 있는 위치인지 확인한다.")
    @Test
    void findMovablePosition() {
        ChessBoard chessBoard = new ChessBoard();
        MovableCoordinates movableCoordinates = new MovableCoordinates(Player.WHITE);
        List<Coordinate> coordinates = movableCoordinates.findMovableCoordinates(chessBoard.getChessBoard());
        boolean isMovable = coordinates.contains(new Coordinate(Rank.THREE, File.C));
        assertThat(isMovable).isTrue();
    }
}
