package racing.Service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionServiceTest {

    private static PositionService positionService;

    @BeforeAll
    static void beforeAll(){
        positionService = new PositionService();
    }

    @Test
    @DisplayName("정상적으로 randomNumber 체크")
    void checkMove(){
        assertEquals(true, positionService.checkNumber(5));
        assertEquals(false, positionService.checkNumber(0));
    }

}