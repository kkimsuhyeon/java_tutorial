package utils;

import racingcar.domain.Car;
import racingcar.type.BoundaryType;
import racingcar.type.ErrorType;
import racingcar.type.TextType;
import racingcar.type.ValueType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class InputUtils {

    public static Car validateCar(String carName){
        if((carName.length() < BoundaryType.MINIMUM_CAR_NAME_LENGTH.getBoundary()) || carName.length() > BoundaryType.MAXIMUM_CAR_NAME_LENGTH.getBoundary()){
            throw new IllegalArgumentException(ErrorType.INVALID_LENGTH.getError());
        }

        if(carName.contains(TextType.BLANK_TEXT.getText())){
            throw new IllegalArgumentException(ErrorType.INVALID_FORMAT.getError());
        }

        return new Car(carName);
    }

    public static void validateDuplicateCar(ArrayList<Car> cars){
        Set<String> carSet = new HashSet<>();

        for(Car car : cars){
            carSet.add(car.getName());
        }

        if(cars.size() != carSet.size()){
            throw new IllegalArgumentException(ErrorType.INVALID_DUPLICATION.getError());
        }
    }

    public static void validateTimes(int scannerTimes){
        if(scannerTimes <= ValueType.ZERO.getValue()){
            throw new IllegalArgumentException(ErrorType.INVALID_ZERO_TIME.getError());
        }
    }


}
