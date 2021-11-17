package racingcar.domain;

import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.Scanner;

public class CarRacing {

    private static ArrayList<Car> cars = new ArrayList<>();
    private static int times;

    public static void runCarRacing(Scanner scanner){
        startCarRacing(scanner);
        playCarRacing();
        finishCarRacing();
    }

    public static void startCarRacing(Scanner scanner){

        cars = Initialization.initCars(scanner);
        times = Initialization.initTimes(scanner);
        OutputView.printNewLine();
    }

    public static void playCarRacing(){
        OutputView.printResultText();

        for(int i = 0; i < times; i++){
            for(Car car : cars){
                Car.moveCar(car);
            }

            Result.showResult(cars);
            OutputView.printNewLine();
        }

    }

    public static void finishCarRacing(){
        Winner.showWinner(cars);
    }
}
