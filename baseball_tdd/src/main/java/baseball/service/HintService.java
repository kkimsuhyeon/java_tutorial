package baseball.service;

import baseball.domain.Hint;
import baseball.view.OutputView;

import java.util.List;

public class HintService {

    public static void initializeHint() { Hint.initializeHint(); }

    public static int[] getHint(){
        return new int[]{Hint.getStrike(), Hint.getBall()};
    }

    public static void countHint(List<Integer> programNumberList, List<Integer> playerNumberList) {
        initializeHint();
        for(int i = 0; i < playerNumberList.size(); i++) {
            if(programNumberList.contains(playerNumberList.get(i))){
                if(programNumberList.get(i).equals(playerNumberList.get(i))) {
                    Hint.addStrike();
                } else{
                    Hint.addBall();
                }
            }
        }
    }

    public static void printHint(){
        OutputView.printResult();
    }
}
