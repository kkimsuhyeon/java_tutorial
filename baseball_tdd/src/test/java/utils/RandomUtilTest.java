package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomUtilTest {

    @Test
    @DisplayName("랜덤 유틸 기능 테스트")
    void testCheckParams(){
        assertDoesNotThrow(() -> RandomUtil.nextInt(1, 9));
        assertEquals(RandomUtil.nextInt(2,2), 2);
        assertThrows(IllegalArgumentException.class, () -> RandomUtil.nextInt(0, 9));
        assertThrows(IllegalArgumentException.class, () -> RandomUtil.nextInt(1, 10));
    }

}