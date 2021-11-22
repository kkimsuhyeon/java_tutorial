package view.output.station;

import type.ExceptionType;

public class StationExceptionView {
    public static void printInvalidStationNameException() {
        System.out.println();
        System.out.println(ExceptionType.INVALID_STATION_NAME.getException());
    }

    public static void printInvalidStationNameLengthException() {
        System.out.println();
        System.out.println(ExceptionType.INVALID_STATION_NAME_LENGTH.getException());
    }

    public static void printInvalidStationNameLastCharacterException() {
        System.out.println();
        System.out.println(ExceptionType.INVALID_STATION_NAME_LAST_CHARACTER.getException());;
    }

    public static void printInvalidStationNameInTransitMapException() {
        System.out.println();
        System.out.println(ExceptionType.INVALID_STATION_NAME_IN_TRANSIT_MAP.getException());
    }

    public static void printInvalidStationNameExistenceException() {
        System.out.println();
        System.out.println(ExceptionType.INVALID_STATION_NAME_EXISTENCE.getException());
    }
}
