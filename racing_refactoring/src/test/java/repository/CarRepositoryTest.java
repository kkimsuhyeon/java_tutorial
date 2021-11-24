package repository;

import domain.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


class CarRepositoryTest {

    private CarRepository carRepository;

    @BeforeEach
    public void beforeEach(){
        carRepository = new CarRepository();
    }

    @Test
    public void regist(){
        Assertions.assertDoesNotThrow(() -> carRepository.registByNames(Arrays.asList(new String[]{"a", "b"})));
        Assertions.assertThrows(IllegalArgumentException.class, () -> carRepository.registByNames(Arrays.asList(new String[]{"a","a"})));
    }

    @Test
    public void getName(){
        carRepository.registByNames(Arrays.asList(new String[]{"a", "b"}));
        Assertions.assertEquals(carRepository.getCarNames(), Arrays.asList(new String[]{"a", "b"}));
    }

    @Test
    public void move(){
        carRepository.registByNames(Arrays.asList(new String[]{"a", "b"}));
        List<Car> tempCars = carRepository.getCars();
        carRepository.moveByName(tempCars.get(0).getName());
        Assertions.assertEquals(carRepository.getCars().get(0).getPosition(), 1);
    }

}