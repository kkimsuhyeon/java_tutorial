package racingcar.type;

public enum BoundaryType {
    MINIMUM_MOVE_NUMBER(4),
    MAXIMUM_MOVE_NUMBER(9),
    MINIMUM_STOP_NUMBER(0),
    MAXIMUM_STOP_NUMBER(3),
    MINIMUM_RANDOM_NUMBER(0),
    MAXIMUM_RANDOM_NUMBER(9),
    MINIMUM_CAR_NAME_LENGTH(1),
    MAXIMUM_CAR_NAME_LENGTH(5);

    private final int boundary;

    BoundaryType(int boundary){
        this.boundary = boundary;
    }

    public int getBoundary() {
        return boundary;
    }
}
