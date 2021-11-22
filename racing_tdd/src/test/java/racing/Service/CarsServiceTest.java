package racing.Service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarsServiceTest {

    private static CarsService carsService;
    @BeforeAll
    static void beforeAll(){
        carsService = new CarsService();
    }

    @Test
    @DisplayName("차 정상적으로 생성하는지 테스트")
    void checkRegistCar(){
        assertDoesNotThrow(() -> carsService.registCars("test,test1,test2"));
        assertThrows(IllegalArgumentException.class, () -> carsService.registCars("test,test,test1,test2"));
    }


}