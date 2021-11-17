package baseball.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PlayerServiceTest {

    private PlayerService player;
    Scanner scanner = new Scanner(System.in);
    @BeforeEach
    void beforeEach(){
        player = new PlayerService(scanner);
    }


    @Test
    @DisplayName("입력값 체크 테스트")
    void testCheckLength(){
        assertThrows(IllegalArgumentException.class, () -> player.parseInteger("1234"));
        assertThrows(IllegalArgumentException.class, () -> player.parseInteger("12"));
        assertEquals(player.parseInteger("123"), new ArrayList<Integer>(Arrays.asList(1,2,3)));
    }

}