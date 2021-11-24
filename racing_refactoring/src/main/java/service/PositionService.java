package service;

import domain.Car;
import util.RandomUtil;

public class PositionService {

    public void move(Car car){ if(isMove()) car.movePosition(); }

    private boolean isMove(){
        if(RandomUtil.nextInt(0, 9) >= 4) return true;
        return false;
    }

}
