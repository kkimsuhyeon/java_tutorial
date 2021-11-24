package repository;

import domain.Car;

import java.util.*;
import java.util.stream.Collectors;

public class CarRepository {

    private List<Car> cars = new ArrayList<>();

    public void registByNames(List<String> names){ // 생성자로 만들면 일급컬랙션인가 ??
        isValidDuplication(names);
        for(String name : names){
            cars.add(new Car(name));
        }
    }

    public List<String> getCarNames(){
        return cars.stream().map(car -> car.getName()).collect(Collectors.toList());
    }

    public List<Car> getCars(){
        return Collections.unmodifiableList(cars);
    }

    public void moveByName(String name){
        if(!getCarNames().contains(name)) throw new IllegalArgumentException("일치하는 이름의 차가 없습니다.");

        cars.stream().forEach(car -> {
            if(car.getName().equals(name)) car.movePosition();
        });
    }

    public void isValidDuplication(List<String> names){
        Set<String> setNames = new HashSet<>(names);
        if(setNames.size() != names.size()) throw new IllegalArgumentException("이름에 중복된 값이 있습니다.");
    }
}
