package racingcar.service;

import racingcar.domain.Car;
import racingcar.type.TextType;
import racingcar.type.ValueType;

import java.util.ArrayList;
import java.util.List;

public class WinnerService {

    public static void showWinner(List<Car> cars){
        List<Integer> carPositions = PositionService.getPosition(cars);
        int maxPosition = PositionService.getMaxPosition(carPositions);

        List<String> winner = getWinner(cars, maxPosition);

        checkWinner(winner);
    }

    public static List<String> getWinner(List<Car> cars, int maxPosition){
        List<String> winner = new ArrayList<>();

        for(Car car : cars){
            if(isMaxPosition(car, maxPosition)){
                winner.add(car.getName());
            }
        }

        return winner;
    }

    public static boolean isMaxPosition(Car car, int maxPosition){
        return car.getPosition() == maxPosition;
    }

    public static void isNoWinner() {
        System.out.println("우승자가 없습니다.");
    }

    public static void checkWinner(List<String> winner){
        if(winner.size() == ValueType.ZERO.getValue()){
            isNoWinner();
            return;
        }
        isWinner(winner);
    }

    private static void isWinner(List<String> winner) {
        String result = String.join(TextType.COMMA_WITH_BLANK_TEXT.getText(), winner);
        System.out.println(result);
    }
}
