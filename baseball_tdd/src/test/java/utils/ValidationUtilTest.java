package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ValidationUtilTest {

    @Test
    @DisplayName("1 ~ 9 값 검증")
    void test(){
        assertTrue(ValidationUtil.validNo(9)); // 결과값이 true가 나오도록 예측
        assertTrue(ValidationUtil.validNo(1));
        assertFalse(ValidationUtil.validNo(0)); // 결과값이 false가 나오도록 예측
        assertFalse(ValidationUtil.validNo(10));
    }

}