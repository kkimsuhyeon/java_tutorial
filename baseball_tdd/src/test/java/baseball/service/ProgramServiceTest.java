package baseball.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramServiceTest {

    private ProgramService program;

    @BeforeEach
    void beforeAll() {
        program = new ProgramService();
    }

    @Test
    @DisplayName("프로그램 정상적으로 번호 생성하는지 테스트")
    void testInitialize() {
        assertDoesNotThrow(() -> program.initializeProgram());
    }

}