package racing.Service;

import racing.Domain.Car;

public class PositionService {

    public void movePosition(Car car, int number){
        if(checkNumber(number)) car.movePosition();
    }

    public boolean checkNumber(int randomNumber) {
        if(randomNumber >= 4) return true;
        return false;
    }
}
