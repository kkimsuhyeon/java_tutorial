import controller.GameController;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        GameController.playGame(scanner);
    }
}
