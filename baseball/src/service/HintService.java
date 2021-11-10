package service;

import domain.Hint;

import java.util.List;

public class HintService {

    Hint hint = new Hint();

    public void initializeHint(){
        hint.setBall(0);
        hint.setStrike(0);
    }

    public Hint getHint(){
        return hint;
    }

    public void generateHint(List<Integer> programNumber, List<Integer> playerNumber){

        for(int i = 0; i < 3; i++){
            if(programNumber.contains(playerNumber.get(i))){
                if(programNumber.get(i) == playerNumber.get(i)){
                    hint.setStrike(hint.getStrike() + 1);
                } else {
                    hint.setBall(hint.getBall() + 1);
                }
            }
        }
    }
}
