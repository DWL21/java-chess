package chess;

import chess.view.InputView;
import chess.view.OutputView;

public class Application {

    public static void main(String[] args) {

        OutputView outputView = new OutputView();
        outputView.printGameFlag();
        InputView inputView = new InputView();
        String gameFlag = inputView.inputGameFlag();

        while (gameFlag.equals("start")) {
            Board board = new Board();
            outputView.printBoard(board);
            gameFlag = inputView.inputGameFlag();
        }
    }
}
