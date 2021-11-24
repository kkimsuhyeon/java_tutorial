package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("car 등록 테스트")
    public void registCar(){
        Assertions.assertDoesNotThrow(() -> new Car("test")); // 정상 등록
        Assertions.assertDoesNotThrow(() -> new Car("test  ")); // 정상 등록
        Assertions.assertDoesNotThrow(() -> new Car("  test")); // 정상  등록
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Car("te st")); // 이름 사이에 공백 있을 경우
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Car("testtest")); // 이름 5자 이상
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Car("")); // 이름 공백
    }
}