package type;

public enum InputType {
    INPUT_ONE("1"),
    INPUT_TWO("2"),
    INPUT_THREE("3"),
    INPUT_FOUR("4"),
    INPUT_QUITTING("Q"),
    INPUT_BACK("B");

    private final String input;

    InputType(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }
}
