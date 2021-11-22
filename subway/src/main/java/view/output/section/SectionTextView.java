package view.output.section;


import type.TextType;

public class SectionTextView {
    public static void printSectionAdditionLineText() {
        System.out.println();
        System.out.println(TextType.SECTION_ADDITION_LINE_TEXT.getText());
    }

    public static void printSectionAdditionStationText() {
        System.out.println();
        System.out.println(TextType.SECTION_ADDITION_STATION_TEXT.getText());
    }

    public static void printSectionAdditionOrderText() {
        System.out.println();
        System.out.println(TextType.SECTION_ADDITION_ORDER_TEXT.getText());
    }

    public static void printSectionDeletionLineText() {
        System.out.println();
        System.out.println(TextType.SECTION_DELETION_LINE_TEXT.getText());
    }

    public static void printSectionDeletionStationText() {
        System.out.println();
        System.out.println(TextType.SECTION_DELETION_STATION_TEXT.getText());
    }
}
