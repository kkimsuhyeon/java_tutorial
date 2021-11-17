package racingcar.type;

public enum TextType {

    CAR_NAMES_TEXT("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    RACING_TIMES_TEXT("시도할 회수는 몇회인가요?"),

    COMMA_TEXT(","),
    BLANK_TEXT(" "),
    LINE_TEXT("-"),
    COMMA_WITH_BLANK_TEXT(", "),

    RESULT_TEXT("실행 결과"),
    WINNER_TEXT("최종 우승자: "),
    ;

    private final String text;

    TextType(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
