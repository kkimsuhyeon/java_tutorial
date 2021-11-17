package baseball.view;

import baseball.domain.Hint;

public class OutputView {

    public static void printResult() {
        System.out.printf("스트라이크 : %d, 볼 : %d%n", Hint.getStrike(), Hint.getBall());
    }
}
