package baseball.controller;

import baseball.service.HintService;
import baseball.service.PlayerService;
import baseball.service.ProgramService;
import baseball.view.InputView;

import java.util.List;
import java.util.Scanner;

public class Baseball {

    Scanner scanner = new Scanner(System.in);

    ProgramService program = new ProgramService();
    PlayerService player = new PlayerService(scanner);

    public void start() {
        gameStart();
    }

    public void gameStart() {

        while (true) {
            program.initializeProgram();
            System.out.println(program.getProgramNumber());

            while (HintService.getHint()[0] != 3) {

                List<Integer> playerNumber = player.scanPlayer();
                HintService.countHint(program.getProgramNumber(), playerNumber);
                HintService.printHint();
            }

            InputView.playerRestartScan();
            String result = scanner.nextLine();

            if(result.equals("2")) break;
            continue;
        }
    }
}
