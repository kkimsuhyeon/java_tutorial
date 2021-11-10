package service;

import domain.Number;

import java.util.*;

public class ProgramService {

    private List<Integer> programNumber;
    Number number = new Number();

    public void initializeProgramNumber(){
        Set<String> tempSet = new HashSet<>();
        while(tempSet.size() != 3){
            Random random = new Random();
            int result = 1 + random.nextInt(9);
            tempSet.add(Integer.toString(result));
        }

        List<String> tempList = new ArrayList<>(tempSet);
        Collections.shuffle(tempList);
        System.out.println(tempList);
        setProgramNumber(tempList);
    }

    public List<Integer> getProgramNumber(){
        return programNumber;
    }

    private void setProgramNumber(List<String> programNumber){
        number.setNumberList(programNumber);
        this.programNumber = number.getNumberList();
    }


}
