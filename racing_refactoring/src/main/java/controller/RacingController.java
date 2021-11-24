package controller;

import domain.Car;
import service.CarService;
import service.PositionService;
import view.input.InputView;
import view.output.OutputView;

import java.util.Scanner;

public class RacingController {

    final CarService carService = new CarService();
    final PositionService positionService = new PositionService();

    public void gameStart(Scanner scanner) {
        String names = InputView.scanCarNames(scanner);
        carService.regist(names);

        int count = InputView.scanCount(scanner);

        for(int i = 0; i < count; i++){
            OutputView.printDivision(i + 1);
            for(Car car : carService.getCarList()){
                positionService.move(car);
                OutputView.printCarPosition(car);
            }
        }

        OutputView.printWinner(carService.getWinner());
    }
}
