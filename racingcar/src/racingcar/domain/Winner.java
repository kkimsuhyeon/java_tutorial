package racingcar.domain;

import racingcar.type.ValueType;
import racingcar.view.OutputView;

import java.util.ArrayList;


public class Winner {
    private static int maxPosition;
    private static ArrayList<String> winner = new ArrayList<>();


    public static void showWinner(ArrayList<Car> cars) {
        ArrayList<Integer> carPositions = Position.extractPosition(cars);
        maxPosition = Position.calculateMaxPosition(carPositions);

        checkWinner(cars);

        if (winner.size() == ValueType.ZERO.getValue()) {
            isNoWinner();
        }

        if (winner.size() != ValueType.ZERO.getValue()) {
            isWinner();
        }
    }

    public static void checkWinner(ArrayList<Car> cars) {
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winner.add(car.getName());
            }
        }
    }

    public static void isNoWinner() {
        OutputView.printNoWinner();
    }

    public static void isWinner() {
        OutputView.printWinner(winner);
    }
}