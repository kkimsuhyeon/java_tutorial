package racing.view;

import racing.Domain.Car;

import java.util.List;

public class OutputView {

    public static void showCarPosition(Car car){
        StringBuffer position = new StringBuffer();

        for(int i = 0; i < car.getPosition(); i++){
            position.append("-");
        }

        System.out.printf("%s : %s%n", car.getName(), position);
    }

    public static void showWinner(List<Car> cars){
        if(cars.size() == 0) {
            System.out.println("우승자가 존재하지 않습니다.");
        }

        StringBuffer winner = new StringBuffer();

        for(int i = 0; i < cars.size(); i++){
            winner.append(cars.get(i).getName());
        }

        System.out.printf("우승 자동차 : %s%n", winner);
    }
}
