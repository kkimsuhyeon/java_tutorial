import racing.controller.RacingGame;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);

        RacingGame game = new RacingGame(scanner);
        game.start();
    }


}
