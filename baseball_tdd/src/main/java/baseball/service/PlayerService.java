package baseball.service;

import baseball.view.InputView;

import java.util.*;

public class PlayerService {

    private final Scanner scanner;

    public PlayerService(Scanner scanner){
        this.scanner = scanner;
    }

    public List<Integer> scanPlayer(){
        InputView.playerNumberScan();
        String numbers = scanner.nextLine();
        return parseInteger(numbers);
    }

    public List<Integer> parseInteger(String input){

        List<String> tempList = new ArrayList<>(Arrays.asList(input.split("")));
        List<Integer> numberList = new ArrayList<>();

        checkNumbers(input);

        for(String number : tempList){ numberList.add(Integer.parseInt(number)); }
        return numberList;
    }

    public void checkNumbers(String numbers){
        List<String> tempList = new ArrayList<>(Arrays.asList(numbers.split("")));
        Set<String> tempSet = new HashSet<>(tempList);

        if(tempList.size() != 3) throw new IllegalArgumentException("[error] input 3 number");
        if(tempSet.size() != 3) throw new IllegalArgumentException("[error] duplicate error");

        return;
    }
}
