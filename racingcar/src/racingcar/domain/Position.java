package racingcar.domain;

import racingcar.type.TextType;

import java.util.ArrayList;

public class Position {

    public static StringBuffer drawPosition(Car car){
        StringBuffer carPosition = new StringBuffer();

        for(int i = 0; i < car.getPosition(); i++){
            carPosition.append(TextType.LINE_TEXT.getText());
        }

        return carPosition;
    }

    public static ArrayList<Integer> extractPosition(ArrayList<Car> cars){
        ArrayList<Integer> carPositions = new ArrayList<>();

        for(Car car: cars){
            carPositions.add(car.getPosition());
        }

        return carPositions;
    }

    public static int calculateMaxPosition(ArrayList<Integer> carPositions){
        int maxPosition = 1;

        for(int currentPosition: carPositions){
            if(maxPosition <= currentPosition){
                maxPosition = currentPosition;
            }
        }

        return maxPosition;

    }
}
