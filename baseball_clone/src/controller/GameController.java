package controller;

import domain.Hint;
import service.HintService;
import service.PlayerService;
import service.ProgramService;
import type.StatusType;
import type.ValueType;
import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.Scanner;

public class GameController {

    public static void playGame(Scanner scanner){
        do{
            ProgramService.initializeProgramNumber();
            startGame(scanner);
        } while (!finishBaseBall(scanner));
    }

    public static void startGame(Scanner scanner){

        List<Integer> programNumber = ProgramService.generateProgramNumber();

        while(true){
            OutputView.printStart();
            String number = InputView.scanNumber(scanner);
            List<Integer> playerNumber = PlayerService.generatePlayerNumber(number);

            if(isAnswer(playerNumber, programNumber)){
                break;
            }
        }
    }

    public static boolean isAnswer(List<Integer> playerNumber, List<Integer> programNumber){

        Hint hint = HintService.generateHint(playerNumber, programNumber);
        List<Integer> totalHint = HintService.getHint(hint);

        int ball = totalHint.get(ValueType.BALL_VALUE.getValue());
        int strike = totalHint.get(ValueType.STRIKE_VALUE.getValue());

        return OutputView.printHint(ball, strike);
    }

    public static boolean finishBaseBall(Scanner scanner) {
        String status = InputView.scanStatus(scanner);
        return status.equals(StatusType.FINISH.getStatus());
    }

}
