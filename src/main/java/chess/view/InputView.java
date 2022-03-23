package chess.view;

import java.util.Scanner;

public class InputView {

    public String inputGameFlag() {
        String flag = new Scanner(System.in).nextLine();
        try {
            return checkFlag(flag);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
            return inputGameFlag();
        }
    }

    private String checkFlag(String flag) {
        if (!(flag.equals("start") || flag.equals("end"))) {
            throw new IllegalArgumentException("[ERROR] 올바른 입력이 아닙니다.");
        }
        return flag;
    }
}
