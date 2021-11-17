package baseball.controller;

import baseball.service.HintService;
import baseball.service.PlayerService;
import baseball.service.ProgramService;

import java.util.List;
import java.util.Scanner;

public class Baseball {

    Scanner scanner = new Scanner(System.in);

    ProgramService program = new ProgramService();
    PlayerService player = new PlayerService(scanner);

    public void start(){
        gameStart();

    }

    public void gameStart(){
        program.initializeProgram();

        while(HintService.getHint()[0] != 3){
            List<Integer> playerNumber = player.scanPlayer();
            HintService.countHint(program.getProgramNumber(), playerNumber);
        }

    }
}
