package racingcar.view;

import racingcar.domain.Car;
import racingcar.type.ErrorType;
import racingcar.type.TextType;
import utils.InputUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public static ArrayList<Car> scanCars(Scanner scanner){
        String scannerCars = scanner.nextLine();

        List<String> carNames = new ArrayList<>(Arrays.asList(scannerCars.split(TextType.COMMA_TEXT.getText())));
        ArrayList<Car> cars = new ArrayList<>();

        for(String carName: carNames){
            cars.add(InputUtils.validateCar(carName));
        }
        InputUtils.validateDuplicateCar(cars);

        return cars;
    }

    public static int scanTimes(Scanner scanner){
        while(!scanner.hasNextInt()){
            System.out.println("pass");
            scanner.next();
            System.out.println(ErrorType.INVALID_CHARACTER.getError());
        }
        int scannerTimes = scanner.nextInt();

        InputUtils.validateTimes(scannerTimes);

        return scannerTimes;
    }
}
