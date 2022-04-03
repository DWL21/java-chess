package chess.board;

import chess.Player;
import chess.piece.Piece;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MovableCoordinates {


    private final Player player;

    public MovableCoordinates(Player player) {
        this.player = player;
    }

    public List<Coordinate> findMovableCoordinates(Map<Coordinate, Piece> chessBoard) {
        List<Coordinate> coordinates = new ArrayList<>();
        for (Coordinate source: chessBoard.keySet()) {
            if (chessBoard.get(source).isPawn()) {
                continue;
            }
            coordinates.addAll(chessBoard.get(source).findMovableCoordinates(player, chessBoard, source));
        }
    }

}
