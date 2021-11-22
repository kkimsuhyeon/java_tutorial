package racing.Domain;

import racing.type.ErrorType;

import java.util.regex.Pattern;

public class Car {

    private String name;
    private int position;

    public Car(String name){
        isValidCar(name.trim());
        this.name = name.trim();
    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }

    public void movePosition(){
        position = position + 1;
    }

    public void isValidCar(String name){
        isValidNameNull(name);
        isValidNameLength(name);
        isValidNameBlank(name);
    }

    public void isValidNameLength(String name){
        if(name.length() > 5) throw new IllegalArgumentException(ErrorType.INVALID_NAME_LENGTH.getError());
    }

    public void isValidNameBlank(String name){
        String pattern = "\\s";
        if(Pattern.compile(pattern).matcher(name).find()) throw new IllegalArgumentException(ErrorType.INVALID_NAME_BLANK.getError());
    }

    public void isValidNameNull(String name){
        if(name.equals("")) throw new IllegalArgumentException(ErrorType.INVALID_NAME_BLANK.getError());
    }
}
