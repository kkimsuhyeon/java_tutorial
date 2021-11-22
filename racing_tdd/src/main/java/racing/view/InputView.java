package racing.view;

import java.util.Scanner;

public class InputView {

    public static String scanCarNames(Scanner scanner){
        System.out.print("등록할 자동차 이름을 입력해주세요 : ");
        return scanner.nextLine();
    }

    public static int scanCount(Scanner scanner){
        System.out.print("횟수를 입력해주세요 : ");
        return scanner.nextInt();
    }
}
