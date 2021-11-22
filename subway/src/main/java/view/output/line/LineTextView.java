package view.output.line;

import type.TextType;

public class LineTextView {
    public static void printLineAdditionText() {
        System.out.println();
        System.out.println(TextType.LINE_ADDITION_TEXT.getText());
    }

    public static void printLineUpStationNameText() {
        System.out.println();
        System.out.println(TextType.LINE_UP_STATION_NAME_TEXT.getText());
    }

    public static void printLineDownStationNameText() {
        System.out.println();
        System.out.println(TextType.LINE_DOWN_STATION_NAME_TEXT.getText());
    }

    public static void printLineDeletionText() {
        System.out.println();
        System.out.println(TextType.LINE_DELETION_TEXT.getText());
    }
}
