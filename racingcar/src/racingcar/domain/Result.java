package racingcar.domain;

import racingcar.view.OutputView;

import java.util.ArrayList;

public class Result {

    public static void showResult(ArrayList<Car> cars){
        for(Car car : cars){
            StringBuffer carPosition = Position.drawPosition(car);
            OutputView.printResult(car, carPosition);
        }
    }
}
