package racingcar.domain;

import racingcar.type.BoundaryType;

public class Car {

    private final String name;
    private int position = 0;

    public Car(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getPosition(){
        return position;
    }

    public static void moveCar(Car car){
        int randomNumber = RandomNumber.generateRandomNumber();

        if((BoundaryType.MINIMUM_MOVE_NUMBER.getBoundary() <= randomNumber) && (randomNumber <= BoundaryType.MAXIMUM_MOVE_NUMBER.getBoundary())){
            car.movePosition();
        }

        if((BoundaryType.MINIMUM_STOP_NUMBER.getBoundary() <= randomNumber) && (randomNumber <= BoundaryType.MAXIMUM_RANDOM_NUMBER.getBoundary())){
            return;
        }
    }

    public void movePosition(){
        position++;
    }
}
