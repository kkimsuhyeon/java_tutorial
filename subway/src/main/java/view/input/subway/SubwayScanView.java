package view.input.subway;

import view.output.util.ScreenView;

import java.util.Scanner;

public class SubwayScanView {
    public static String scanMainInputForManagement(Scanner scanner) {
        ScreenView.printMainScreen();
        return scanner.nextLine();
    }
}
