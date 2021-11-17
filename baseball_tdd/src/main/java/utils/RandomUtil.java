package utils;

import java.util.Random;

public class RandomUtil {

    private RandomUtil(){}

    public static int nextInt(int startNumber, int endNumber){
        Random random = new Random();

        if(startNumber < 1 || endNumber > 9){
            throw new IllegalArgumentException("start min number is 1, end max number is 9");
        }

        if(startNumber > endNumber){
            throw new IllegalArgumentException("check input number");
        }

        if(startNumber == endNumber){
            return startNumber;
        }


        return startNumber + random.nextInt(endNumber);

    }
}
