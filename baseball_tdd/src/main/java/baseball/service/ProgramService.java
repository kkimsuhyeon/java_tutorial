package baseball.service;

import baseball.domain.Hint;
import baseball.domain.Number;
import utils.RandomUtil;

import java.util.*;

public class ProgramService {

    private Number number;

    public void initializeProgram() {
        Set<Integer> tempSet = new HashSet<>();
        while (tempSet.size() != 3) {
            int number = RandomUtil.nextInt(1, 9);
            tempSet.add(number);
        }

        List<Integer> tempList = new ArrayList<>(tempSet);
        Collections.shuffle(tempList);

        number = new Number(tempList);
        Hint.initializeHint();
        System.out.println("프로그램 셋팅 완료");
    }

    public List<Integer> getProgramNumber() {
        return number.getNumberList();
    }
}
