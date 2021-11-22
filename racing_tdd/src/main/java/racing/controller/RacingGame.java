package racing.controller;

import racing.Service.CarsService;
import racing.view.InputView;
import racing.view.OutputView;
import utils.RandomUtil;

import java.util.Scanner;

public class RacingGame {
    private final Scanner scanner;
    private CarsService carsService = new CarsService();

    public RacingGame(Scanner scanner){
        this.scanner = scanner;
    }

    public void start(){
        carsService.registCars(InputView.scanCarNames(scanner));
        int count = InputView.scanCount(scanner);
        carsService.racingCar(count);

    }


}
