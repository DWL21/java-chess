package chess;

public enum Command {

    START("start"),
    END("end")
    ;

    private final String userInput;

    Command(String userInput) {
        this.userInput = userInput;
    }

    public boolean isUserInput(String command) {
        return userInput.equals(command);
    }
}
