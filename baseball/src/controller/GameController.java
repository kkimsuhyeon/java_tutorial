package controller;

import service.HintService;
import service.PlayerService;
import service.ProgramService;
import view.InputView;

import java.util.*;

public class GameController {
    ProgramService program = new ProgramService();
    PlayerService player = new PlayerService();
    HintService hint = new HintService();
    Scanner scanner = new Scanner(System.in);

    public void play(){
        while(true){
            program.initializeProgramNumber();
            gameStart();
            if(gameFinish()) break;
        }
    }

    public void gameStart(){
        while(true){
            hint.initializeHint();
            player.setPlayerNumberList(InputView.inputNumber(scanner));
            hint.generateHint(program.getProgramNumber(), player.getPlayerNumberList());

            System.out.println(program.getProgramNumber());
            System.out.println(hint.getHint().getBall());
            System.out.println(hint.getHint().getStrike());

            if(isAnswer()) break;
        }
    }

    public boolean isAnswer(){
        if(hint.getHint().getStrike() == 3) return true;
        return false;
    }

    public boolean gameFinish(){
        System.out.println("1 or 2");
        String test = scanner.nextLine();
        if(test == "1") return false;
        return true;
    }

}
