package baseball.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramServiceTest {

    private ProgramService program;

    @BeforeEach
    void beforeAll(){
        program = new ProgramService();
    }

    @Test
    void testInitialize(){
        assertDoesNotThrow(() -> program.initializeProgram());
    }

}