package racingcar.domain;

import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.Scanner;

public class Initialization {

    public static ArrayList<Car> initCars(Scanner scanner){
        OutputView.printCarNamesText();
        return InputView.scanCars(scanner);
    }

    public static int initTimes(Scanner scanner){
        OutputView.printTimeText();
        return InputView.scanTimes(scanner);
    }
}
