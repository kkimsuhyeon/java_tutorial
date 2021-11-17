package baseball.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Number {

    private List<Integer> numberList;

    public Number(List<Integer> numberList){
        checkNumberLength(numberList);
        checkDuplicate(numberList);
        checkNumberRange(numberList);
        this.numberList = numberList;
    }

    public List<Integer> getNumberList() { return numberList; }

    public void setNumberList(List<Integer> numberList) {
        checkNumberLength(numberList);
        checkDuplicate(numberList);
        checkNumberRange(numberList);
        this.numberList = numberList;
    }

    public static void checkNumberLength(List<Integer> numberList)  {
        if(numberList.size() != 3) throw new IllegalArgumentException("[error] length over 3");
    }

    public static void checkDuplicate(List<Integer> numberList) {
        Set<Integer> temp = new HashSet<>(numberList);
        if(temp.size() != 3) throw new IllegalArgumentException("[error] duplicate error");
    }

    public static void checkNumberRange(List<Integer> numberList) {

        for(int number : numberList){
            if(number < 1 || number > 9) throw new IllegalArgumentException("[error] number range");
        }
    }
}
