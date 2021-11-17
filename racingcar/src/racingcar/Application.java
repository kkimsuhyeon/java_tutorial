package racingcar;

import racingcar.domain.CarRacing;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        CarRacing.runCarRacing(scanner);
    }
}
