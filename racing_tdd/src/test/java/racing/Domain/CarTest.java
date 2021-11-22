package racing.Domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private static Car car;

    @BeforeAll
    static void beforeAll(){
        car = new Car("test");
    }

    @Test
    @DisplayName("자동차 정상 등록 테스트")
    void checkCar(){
        assertDoesNotThrow(() -> new Car("test"));
    }

    @Test
    @DisplayName("이름 길이 테스트")
    void checkNameLength(){
        assertThrows(IllegalArgumentException.class, () -> new Car("tttest"));
    }

    @Test
    @DisplayName("이름 공백 테스트")
    void checkNameBlank(){
        assertThrows(IllegalArgumentException.class, () -> new Car("te st"));
        assertThrows(IllegalArgumentException.class, () -> new Car(""));
        assertDoesNotThrow(() -> new Car(" test"));
        assertDoesNotThrow(() -> new Car("test "));
    }

    @Test
    @DisplayName("정상적으로 전진")
    void checkMovePosition(){
        car.movePosition();
        car.movePosition();

        assertEquals(2, car.getPosition());
    }

}