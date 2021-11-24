package service;

import domain.Car;
import repository.CarRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarService {

    CarRepository carRepository = new CarRepository();

    public void regist(String names){
        carRepository.registByNames(Arrays.asList(names.split(",")));
    }

    public List<String> getCarNames(){
        return carRepository.getCarNames();
    }

    public List<Car> getCarList(){ return carRepository.getCars(); }

    public List<Car> getWinner(){
        int maxPosition = 0;
        List<Car> winnnerList = new ArrayList<>();

        for(Car car : carRepository.getCars()){
            if(maxPosition < car.getPosition()) maxPosition = car.getPosition();
        }

        for(Car car : carRepository.getCars()){
            if(car.getPosition() == maxPosition){
                winnnerList.add(car);
            }
        }

        return winnnerList;

//        return carRepository.getCars().stream().filter(car -> car.getPosition() == maxPosition);
    }
}
