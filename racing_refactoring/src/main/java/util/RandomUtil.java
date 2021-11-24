package util;

import java.util.Random;

public class RandomUtil {

    private static final Random RANDOM = new Random();
    private RandomUtil(){}

    public static int nextInt(int startInt, int endInt){

        if(startInt > endInt) throw new IllegalArgumentException();

        if(startInt < 0) throw new IllegalArgumentException();

        if(startInt == endInt) return startInt;

        return startInt + RANDOM.nextInt(endInt - startInt + 1);
    }

}
