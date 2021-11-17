package baseball.service;

import baseball.domain.Hint;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HintServiceTest {
    @Test
    @DisplayName("check initialize")
    void testInitialize(){
        HintService.initializeHint();
        assertEquals(Hint.getBall(), 0);
        assertEquals(Hint.getStrike(), 0);
    }


    @Test
    @DisplayName("only strike")
    void testOnlyStrike(){
        HintService.countHint(new ArrayList<Integer>(Arrays.asList(1,2,3)), new ArrayList<Integer>(Arrays.asList(1,5,6)));
        assertEquals(Hint.getStrike(), 1);
        HintService.countHint(new ArrayList<Integer>(Arrays.asList(1,2,3)), new ArrayList<Integer>(Arrays.asList(9,2,8)));
        assertEquals(Hint.getStrike(), 1);
        HintService.countHint(new ArrayList<Integer>(Arrays.asList(1,2,3)), new ArrayList<Integer>(Arrays.asList(1,5,6)));
        assertEquals(Hint.getStrike(), 1);
    }

    @Test
    @DisplayName("only ball")
    void testOnlyBall(){
        HintService.countHint(new ArrayList<Integer>(Arrays.asList(1,2,3)), new ArrayList<Integer>(Arrays.asList(9,8,1)));
        assertEquals(Hint.getBall(), 1);
        HintService.countHint(new ArrayList<Integer>(Arrays.asList(1,2,3)), new ArrayList<Integer>(Arrays.asList(9,8,2)));
        assertEquals(Hint.getBall(), 1);
    }

    @Test
    @DisplayName("ball and strike")
    void testBallAndStrike(){
        HintService.countHint(new ArrayList<Integer>(Arrays.asList(1,2,3)), new ArrayList<Integer>(Arrays.asList(1,3,2)));
        assertEquals(Hint.getBall(), 2);
        assertEquals(Hint.getStrike(), 1);
    }

    @Test
    @DisplayName("nothing")
    void testNothing(){
        HintService.countHint(new ArrayList<Integer>(Arrays.asList(1,2,3)), new ArrayList<Integer>(Arrays.asList(9,8,7)));
        assertEquals(Hint.getStrike(), 0);
        assertEquals(Hint.getBall(), 0);

    }

}