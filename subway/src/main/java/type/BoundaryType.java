package type;

public enum BoundaryType {
    NAME_LENGTH_BOUNDARY(2),

    ORDER_NUMBER_BOUNDARY(1),
    ORDER_REPLACEMENT_LENGTH_BOUNDARY(0),

    STATIONS_IN_LINE_BOUNDARY(2);

    private final int boundary;

    BoundaryType(int boundary) {
        this.boundary = boundary;
    }

    public int getBoundary() {
        return boundary;
    }
}
