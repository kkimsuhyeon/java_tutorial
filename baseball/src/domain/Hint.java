package domain;

public class Hint {

    private int ball;
    private int strike;

    public Hint(){
        ball = 0;
        strike = 0;
    }

    public int getBall(){
        return ball;
    }

    public int getStrike(){
        return strike;
    }

    public void setBall(int value){
        ball = value;
    }

    public void setStrike(int value){
        strike = value;
    }

}
