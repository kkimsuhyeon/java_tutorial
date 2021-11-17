package racingcar.service;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.type.BoundaryType;
import racingcar.type.TextType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingService {

    public static List<String> getCarNames(String racingCars){
        return new ArrayList<>(Arrays.asList(racingCars.split(TextType.COMMA_TEXT.getText())));
    }

    public static List<Car> getCarsFromNames(List<String> carNames){
        List<Car> cars = new ArrayList<>();

        for(String carName: carNames){
            cars.add(new Car(carName));
        }

        return cars;
    }

    public static Cars getCars(List<Car> cars){
        return new Cars(cars);
    }

    public static void moveCar(Car car){
        int random = RandomService.getRandomNumber();

        if((BoundaryType.MINIMUM_MOVE_NUMBER.getBoundary() <= random) && (random <= BoundaryType.MAXIMUM_MOVE_NUMBER.getBoundary())){
            car.movePosition();
        }
    }

    public static void showResult(List<Car> cars){
        for(Car car : cars){
            StringBuffer carPosition = PositionService.drawPosition(car);
        }
    }
}
