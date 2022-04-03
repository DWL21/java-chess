package chess.view;

import java.util.List;

public final class OutputView {

    private static final String ERROR_SIGN = "[ERROR] ";
    private static final int COUNT_RANK_STARTING_NUMBER = 1;
    private static final int NUMBER_OF_SYMBOLS_IN_RANK = 8;
    private static final int RANK_COUNTS = 1;

    public void printGameStartInstruction() {
        System.out.println("체스 게임을 시작합니다.");
        System.out.println("게임 시작은 start, 종료는 end 명령을 입력하세요.");
    }

    public void printChessBoard(final List<String> chessBoardSymbols) {
        int countingSymbolsInRank = COUNT_RANK_STARTING_NUMBER;
        for (String symbol : chessBoardSymbols) {
            System.out.print(symbol);
            countingSymbolsInRank = countSymbolsInRank(countingSymbolsInRank);
        }
        System.out.println();
    }

    private int countSymbolsInRank(final int count) {
        if (count >= NUMBER_OF_SYMBOLS_IN_RANK) {
            System.out.println();
            return COUNT_RANK_STARTING_NUMBER;
        }
        return count + RANK_COUNTS;
    }
    
    public void printErrorMessage(final String errorMessage) {
        System.out.println(ERROR_SIGN + errorMessage);
    }
}
