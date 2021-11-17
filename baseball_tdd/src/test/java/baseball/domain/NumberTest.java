package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {
    @Test
    @DisplayName("check length")
    void testCheckNumberLength(){
        assertDoesNotThrow(()->Number.checkNumberLength(new ArrayList<Integer>(Arrays.asList(1,2,3))));
        assertThrows(IllegalArgumentException.class , ()->Number.checkNumberLength(new ArrayList<Integer>(Arrays.asList(1,2))));
        assertThrows(IllegalArgumentException.class , ()->Number.checkNumberLength(new ArrayList<Integer>(Arrays.asList(1,2,3,4))));
    }

    @Test
    @DisplayName("check duplicate")
    void testCheckNumberDuplicate(){
        assertDoesNotThrow(()->Number.checkDuplicate(new ArrayList<Integer>(Arrays.asList(1,2,3))));
        assertThrows(IllegalArgumentException.class, ()->Number.checkDuplicate(new ArrayList<Integer>(Arrays.asList(1,1,3))));
    }

    @Test
    @DisplayName("check range")
    void testCheckNumberRange(){
        assertDoesNotThrow(() -> Number.checkNumberRange(new ArrayList<Integer>(Arrays.asList(1,2,3))));
        assertThrows(IllegalArgumentException.class, () -> Number.checkNumberRange(new ArrayList<Integer>(Arrays.asList(0,2,3))));
        assertThrows(IllegalArgumentException.class, () -> Number.checkNumberRange(new ArrayList<Integer>(Arrays.asList(1,2,10))));
    }
}