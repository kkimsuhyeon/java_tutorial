package service;

import domain.Number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerService {

    private List<Integer> playerNumberList = new ArrayList<>();
    Number number = new Number();

    public PlayerService() {}



    public List<Integer> getPlayerNumberList(){
        return playerNumberList;
    }

    public void setPlayerNumberList(String playerNumber){
        initializePlayerNumberList();
        List<String> temp = new ArrayList<>();

        for(int i = 0; i < 3; i++) temp.add(playerNumber.substring(i, i+1));

        number.setNumberList(temp);
        this.playerNumberList = number.getNumberList();
    }

    private void initializePlayerNumberList() {
        playerNumberList.clear();
    }

}
