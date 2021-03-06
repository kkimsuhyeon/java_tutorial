package view.input.line;

import view.output.line.LineTextView;
import view.output.util.ScreenView;

import java.util.Scanner;


public class LineScanView {
    public static String scanLineInputForManagement(Scanner scanner) {
        ScreenView.printLineManagementScreen();
        return scanner.nextLine();
    }

    public static String scanLineNameForAddition(Scanner scanner) {
        LineTextView.printLineAdditionText();
        return scanner.nextLine();
    }

    public static String scanUpStationNameForAddition(Scanner scanner) {
        LineTextView.printLineUpStationNameText();
        return scanner.nextLine();
    }

    public static String scanDownStationNameForAddition(Scanner scanner) {
        LineTextView.printLineDownStationNameText();
        return scanner.nextLine();
    }

    public static String scanLineNameForDeletion(Scanner scanner) {
        LineTextView.printLineDeletionText();
        return scanner.nextLine();
    }
}
