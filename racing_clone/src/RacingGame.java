import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RacingGame {

    private final Scanner scanner;
    private static List<Car> carList = new ArrayList<>();
    private int winnerPosition = 0;
    private List<Car> winnerList;

    public RacingGame(Scanner scanner){
        this.scanner = scanner;
    }

    public void gameStart(){

        System.out.print("차량 이름을 입력해주세요 : ");
        String carNames = scanner.nextLine();

        for(String name : carNames.split(",")){
            carList.add(new Car(name));
        }

        System.out.print("횟수 입력 : ");
        int count = scanner.nextInt();

        for(int i = 0; i < count; i++){
            for(Car car : carList){
                if(RandomUtils.nextInt(0, 9) >= 4){
                    car.setPosition(car.getPosition() + 1);
                }
            }
        }

        for(Car car : carList){
            if(car.getPosition() > winnerPosition){
                winnerPosition = car.getPosition();
            }
            System.out.println(car.getName() + ":" + car.getPosition());
        }

        var result = carList.stream().filter(car -> car.getPosition() == winnerPosition).collect(Collectors.toList());

        for(Car car : result){
            System.out.println(car.getName());
        }
    }
}
