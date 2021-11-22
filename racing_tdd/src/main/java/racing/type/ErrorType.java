package racing.type;

public enum ErrorType {

    ERROR("[error] "),
    INVALID_NAME_LENGTH(ERROR.getError() + "자동차 이름의 길이는 5자를 넘길 수 없습니다."),
    INVALID_NAME_BLANK(ERROR.getError() + "자동차 이름에 공백이 포함되어 있습니다."),
    INVALID_NAME_DUPLICATE(ERROR.getError() + "중복된 자동차의 이름이 존재합니다."),
    ;


    private final String error;

    ErrorType(String error){
        this.error = error;
    }

    public String getError(){
        return error;
    }
}
