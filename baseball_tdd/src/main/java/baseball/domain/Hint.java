package baseball.domain;

public class Hint {

    private static int strike = 0;
    private static int ball = 0;

    public static int getStrike() {
        return strike;
    }

    public static int getBall() {
        return ball;
    }

    public static void addStrike(){ strike = strike + 1; }

    public static void addBall(){ ball = ball + 1; }

    public static void initializeHint(){
        strike = 0;
        ball = 0;
    }

}
