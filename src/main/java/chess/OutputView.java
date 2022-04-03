package chess;

import java.util.List;

public final class OutputView {

    private static final int COUNT_RANK_STARTING_NUMBER = 1;
    public static final int NUMBER_OF_SYMBOLS_IN_RANK = 8;
    private static final int RANK_COUNTS = 1;

    public void printChessBoard(final List<String> chessBoardSymbols) {
        int countingSymbolsInRank = COUNT_RANK_STARTING_NUMBER;
        for (String symbol : chessBoardSymbols) {
            System.out.print(symbol);
            countingSymbolsInRank = countSymbolsInRank(countingSymbolsInRank);
        }
    }

    private int countSymbolsInRank(final int count) {
        if (count >= NUMBER_OF_SYMBOLS_IN_RANK) {
            System.out.println();
            return COUNT_RANK_STARTING_NUMBER;
        }
        return count + RANK_COUNTS;
    }
}
