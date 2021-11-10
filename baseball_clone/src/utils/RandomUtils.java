package utils;

import java.util.Random;

public class RandomUtils {

    private static final Random RANDOM = new Random();

    private RandomUtils(){} // 싱글톤 방식을 위해서 생성할 수 없도록 막음

    public static int nextInt(final int startInclusive, final int endInclusive){
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
