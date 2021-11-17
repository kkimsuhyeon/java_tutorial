package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HintTest {

    @Test
    @DisplayName("Hint 초기화 확인")
    void testInitialize(){
        Hint.initializeHint();
        assertEquals(Hint.getBall(), 0);
        assertEquals(Hint.getStrike(), 0);
    }

    @Test
    @DisplayName("스트라이크 늘어나는거 확인")
    void testIncreaseStrike(){
        Hint.initializeHint();
        Hint.addStrike();
        Hint.addStrike();
        assertEquals(Hint.getStrike(), 2);
    }

    @Test
    @DisplayName("볼 늘어나는거 확인")
    void testIncreaseBall(){
        Hint.initializeHint();
        Hint.addBall();
        Hint.addBall();
        assertEquals(Hint.getBall(), 2);
    }
}