package utils;

import java.util.Random;

public class RandomUtil {

    private static final Random RANDOM = new Random();
    private RandomUtil(){}

    public static int nextInt(int startInclusive, int endInclusive){
        if(startInclusive > endInclusive){
            throw new IllegalArgumentException();
        }

        if(startInclusive < 0){
            throw new IllegalArgumentException();
        }

        if(startInclusive == endInclusive){
            return startInclusive;
        }

        return startInclusive + RANDOM.nextInt(endInclusive - startInclusive + 1);
    }
}
