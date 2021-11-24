package view.input;

import java.util.Scanner;

public class InputView {

    private InputView(){}

    public static String scanCarNames(Scanner scanner){
        System.out.println("자동차 이름을 입력해주세요 : ");
        return scanner.nextLine();
    }

    public static int scanCount(Scanner scanner){
        System.out.println("반복 횟수를 입력해주세요 : ");
        return scanner.nextInt();
    }
}
