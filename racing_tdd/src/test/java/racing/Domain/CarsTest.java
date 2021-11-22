package racing.Domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CarsTest {

    @Test
    @DisplayName("차량 이름 중복 확인")
    void checkDuplicate(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Cars(new ArrayList<Car>(Arrays.asList(new Car[]{new Car("test"), new Car("test")})));
        });
    }

}