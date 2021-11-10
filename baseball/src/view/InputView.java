package view;

import java.util.Scanner;

public class InputView {

    public static String inputNumber(Scanner scanner){
        System.out.print("숫자를 입력하세요 :");
        String result = scanner.nextLine();

        return result;
    }
}
