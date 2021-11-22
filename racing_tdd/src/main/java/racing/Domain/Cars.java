package racing.Domain;

import racing.type.ErrorType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {

    private List<Car> cars;

    public Cars(List<Car> cars){
        isValidCars(cars);
        this.cars = cars;
    }

    public List<Car> getCars(){
        return cars;
    }

    public void isValidCars(List<Car> cars){
        isValidDuplicate(cars);
    }

    public void isValidDuplicate(List<Car> cars){
        Set<String> carSet = new HashSet<>();

        for(Car car : cars){
            carSet.add(car.getName());
        }

        if(carSet.size() != cars.size()) throw new IllegalArgumentException(ErrorType.INVALID_NAME_DUPLICATE.getError());
    }
}
