import java.util.Scanner;

public class Application {

    public static void main(String[] main){

        final Scanner scanner = new Scanner(System.in);

        RacingGame racingGame = new RacingGame(scanner);
        racingGame.gameStart();

        scanner.close();
    }
}
