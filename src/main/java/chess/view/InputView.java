package chess.view;

import java.util.Scanner;

public final class InputView {

    public static final String COMMAND_END = "end";
    public static final String COMMAND_START = "start";
    private static Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    public String inputCommand() {
        String command = input();
        if (command.equals(COMMAND_START) || command.equals(COMMAND_END)) {
            return command;
        }
        throw new IllegalArgumentException("올바르지 않은 명령입니다.");
    }

    private String input() {
        return scanner.nextLine();
    }
}
