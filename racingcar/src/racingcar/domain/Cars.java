package racingcar.domain;

import racingcar.type.ErrorType;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars){
        isDuplicate(cars);
        this.cars = cars;
    }

    public List<Car> getCars(){
        return cars;
    }

    public static void isDuplicate(List<Car> cars){

        Set<String> carsName = getCarsName(cars);

        if(cars.size() != carsName.size()){
            throw new IllegalArgumentException(ErrorType.INVALID_DUPLICATION.getError());
        }
    }

    public static Set<String> getCarsName(List<Car> cars){
        Set<String> carsName = new HashSet<>();

        for(Car car : cars){
            carsName.add(car.getName());
        }

        return carsName;
    }
}
