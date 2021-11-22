package racing.Service;

import racing.Domain.Car;
import racing.Domain.Cars;
import utils.RandomUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarsService {

    private Cars cars;

    PositionService positionService = new PositionService();

    public void registCars(String carNames) {

        List<Car> tempList = new ArrayList<>();
        for(String name : Arrays.asList(carNames.split(","))){
            tempList.add(new Car(name));
        }

        cars = new Cars(tempList);
    }

    public void racingCar(int count){
        for(int i = 0 ; i < count; i++){
            for(Car car : cars.getCars()){
                positionService.movePosition(car, RandomUtil.nextInt(0, 9););
            }
        }
    }

    public List<String> getCarNames(){
        List<String> names = new ArrayList<>();

        for(Car car : cars.getCars()){
            names.add(car.getName());
        }

        return names;
    }

    public List<Car> getWinnerList(){

        int maxPosition = 0;
        List<Car> winnnerList = new ArrayList<>();

        for(Car car : cars.getCars()){
            if(car.getPosition() > maxPosition){
                maxPosition = car.getPosition();
            }
        }

        for(Car car : cars.getCars()){
            if(maxPosition == car.getPosition()){
                winnnerList.add(car);
            }
        }

        return winnnerList;
    }
}
