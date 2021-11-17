package racingcar.domain;

import racingcar.type.BoundaryType;
import utils.RandomUtils;

public class RandomNumber {

    public static int generateRandomNumber(){
        return RandomUtils.nextInt(BoundaryType.MINIMUM_RANDOM_NUMBER.getBoundary(), BoundaryType.MAXIMUM_RANDOM_NUMBER.getBoundary());
    }
}
