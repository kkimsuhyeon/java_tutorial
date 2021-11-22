package repository;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TransitMapRepositoryTest {

    @Test
    void tempTest(){
        Map<String, String> tempMap = new HashMap<>();
        tempMap.put("a","A");
        tempMap.put("b","B");

        for(Map.Entry<String, String> test: tempMap.entrySet()){
            System.out.println(test.getKey());
        }

    }

}