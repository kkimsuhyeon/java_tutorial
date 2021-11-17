package racingcar.service;

import racingcar.type.BoundaryType;
import utils.RandomUtils;

public class RandomService {
    public static int getRandomNumber(){
        return RandomUtils.nextInt(BoundaryType.MINIMUM_RANDOM_NUMBER.getBoundary(), BoundaryType.MAXIMUM_RANDOM_NUMBER.getBoundary());
    }
}
