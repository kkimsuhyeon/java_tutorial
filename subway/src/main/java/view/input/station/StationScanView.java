package view.input.station;

import view.output.station.StationTextView;
import view.output.util.ScreenView;

import java.util.Scanner;

public class StationScanView {
    public static String scanStationInputForManagement(Scanner scanner) {
        ScreenView.printStationManagementScreen();
        return scanner.nextLine();

    }

    public static String scanStationNameForAddition(Scanner scanner) {
        StationTextView.printStationAdditionText();
        return scanner.nextLine();
    }

    public static String scanStationNameForDeletion(Scanner scanner) {
        StationTextView.printStationDeletionText();
        return scanner.nextLine();
    }
}
