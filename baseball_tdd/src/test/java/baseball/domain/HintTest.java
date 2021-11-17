package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HintTest {

    @Test
    @DisplayName("check initialize")
    void testInitialize(){
        Hint.initializeHint();
        assertEquals(Hint.getBall(), 0);
        assertEquals(Hint.getStrike(), 0);
    }

    @Test
    @DisplayName("check increase strike")
    void testIncreaseStrike(){
        Hint.initializeHint();
        Hint.addStrike();
        Hint.addStrike();
        assertEquals(Hint.getStrike(), 2);
    }

    @Test
    @DisplayName("check increase ball")
    void testIncreaseBall(){
        Hint.initializeHint();
        Hint.addBall();
        Hint.addBall();
        assertEquals(Hint.getBall(), 2);
    }
}