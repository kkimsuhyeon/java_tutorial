package domain;

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
        isValidNameBlack(name);
    }

    private void isValidNameBlack(String name) {
        String pattern = "\\s";
        if(Pattern.compile(pattern).matcher(name).find()) throw new IllegalArgumentException("이름에 공백 있음");
    }

    private void isValidNameLength(String name) {
        if(name.length() > 5) throw new IllegalArgumentException("이름 길이가 5자가 넘으면 안됨");
    }

    private void isValidNameNull(String name) {
        if(name.equals("")) throw new IllegalArgumentException("이름이 없습니다.");
    }


}
