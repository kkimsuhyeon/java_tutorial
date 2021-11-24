package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import repository.CarRepository;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    private CarService carService = new CarService();
    private CarRepository carRepository = new CarRepository();

    @Test
    public void regist(){
        Assertions.assertDoesNotThrow(() -> carService.regist("a,b,c,d"));
    }

}