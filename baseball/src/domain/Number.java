package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Number {

    private List<Integer> numberList = new ArrayList<>();

    public Number(){ }

    public List<Integer> getNumberList(){
        return numberList;
    }

    public void setNumberList(List<String> numberList){
        isValidNumber(numberList);
        this.numberList = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            this.numberList.add(Integer.parseInt(numberList.get(i)));
        }
    }


    private void isValidNumber(List<String> numberList){
        isValidBoundary(numberList);
        isValidLength(numberList);
        isDuplicate(numberList);
    }

    private void isValidLength(List<String> numberList){
        if(numberList.size() != 3){
            throw new IllegalArgumentException("길이가 맞지 않음");
        }
    }

    private void isValidBoundary(List<String> numberList){
        for(String number : numberList){
            char charNumber = number.charAt(0);
            if(charNumber < 49 || charNumber > 57){
                throw new IllegalArgumentException("이상한 값 들어옴");
            }
        }
    }

    private void isDuplicate(List<String> numberList){
        Set<String> numberSet = new HashSet<>(numberList);
        if(numberSet.size() != 3){
            throw new IllegalArgumentException("중복된 값 있음");
        }
    }
}
