package domain;

import type.SizeType;

import java.util.List;

public class Hint {

    private int strike;
    private int ball;

    public Hint(int strike, int ball){
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike(){
        return this.strike;
    }

    public int getBall(){
        return this.ball;
    }

    // 이렇게 하면 무조건 isSameNumber 이후에 isSamePosition 실행해야함
    public void isSameNumber(List<Integer> playerNumber, List<Integer> programNumber){
        for(Integer player : playerNumber){
            if(programNumber.contains(player)){
                ball++;
            }
        }
    }

    public void isSamePosition(List<Integer> playerNumber, List<Integer> programNumber){
        for(int i = 0; i < SizeType.NUMBER_SIZE.getSize(); i++){
            if(playerNumber.get(i).equals(programNumber.get(i))){
                strike++;
                ball--;
            }
        }
    }
}
