package view;

import type.ExceptionType;
import type.StatusType;

import java.util.Scanner;

public class InputView { // inputView면 여기서 number에 대한 조건 추가 가능하지 않나??

    public static String scanNumber(Scanner scanner){
        String value = scanner.nextLine();
        return value;
    }

    public static String scanStatus(Scanner scanner){
        String status = scanner.nextLine();
        if(isValidStatus(status)) return status;
        throw new IllegalArgumentException(ExceptionType.INVALID_BOUNDARY.getException());
    }

    public static boolean isValidStatus(String status){
        return (status.equals(StatusType.RESTART.getStatus()) || status.equals(StatusType.FINISH.getStatus()));
    }
}
