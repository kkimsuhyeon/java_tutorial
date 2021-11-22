package view.output.station;

import type.TextType;

public class StationTextView {
    public static void printStationAdditionText() {
        System.out.println();
        System.out.println(TextType.STATION_ADDITION_TEXT.getText());
    }

    public static void printStationDeletionText() {
        System.out.println();
        System.out.println(TextType.STATION_DELETION_TEXT.getText());
    }
}
