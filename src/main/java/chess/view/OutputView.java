package chess.view;

import chess.*;

public class OutputView {

    public void printGameFlag() {
        System.out.println("체스 게임을 시작합니다.");
        System.out.println("게임 시작은 start, 종료는 end 명령을 입력하세요.");
    }

    public void printBoard(Board board) {
        for (Rank rank : Rank.values()) {
            for (File file : File.values()) {
                System.out.print(board.findSymbol(new Position(rank, file)));
            }
            System.out.println();
        }
    }
}
