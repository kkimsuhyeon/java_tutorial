import controller.SubwayController;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);

        SubwayController subWayController = new SubwayController();
        subWayController.runSubway(scanner);



    }
}
