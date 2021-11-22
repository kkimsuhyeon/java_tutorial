package view.input.section;

import view.output.section.SectionTextView;
import view.output.util.ScreenView;

import java.util.Scanner;

public class SectionScanView {
    public static String scanSectionInputForManagement(Scanner scanner) {
        ScreenView.printSectionManagementScreen();
        return scanner.nextLine();
    }

    public static String scanLineNameForAddition(Scanner scanner) {
        SectionTextView.printSectionAdditionLineText();
        return scanner.nextLine();
    }

    public static String scanStationNameForAddition(Scanner scanner) {
        SectionTextView.printSectionAdditionStationText();
        return scanner.nextLine();
    }

    public static String scanOrderForAddition(Scanner scanner) {
        SectionTextView.printSectionAdditionOrderText();
        return scanner.nextLine();
    }

    public static String scanLineNameForDeletion(Scanner scanner) {
        SectionTextView.printSectionDeletionLineText();
        return scanner.nextLine();
    }

    public static String scanStationNameForDeletion(Scanner scanner) {
        SectionTextView.printSectionDeletionStationText();
        return scanner.nextLine();
    }
}
