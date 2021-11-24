package view.output;

import domain.Car;

import java.util.List;


public class OutputView {

    private OutputView(){}

    public static void printCarPosition(Car car){
        StringBuilder position = new StringBuilder();

        for(int i = 0; i < car.getPosition(); i++){
            position.append("-");
        }
        System.out.printf("%s : %s%n", car.getName(), position);
    }

    public static void printDivision(int count){
        System.out.printf("################## %d 회%n", count);
    }

    public static void printWinner(List<Car> cars){
        StringBuilder stringBuilder = new StringBuilder();

        if(cars.size() == 0 || cars.get(0).getPosition() == 0){
            System.out.println("우승자 없음");
            return;
        }

        for(Car car : cars){
            stringBuilder.append(car.getName());
            stringBuilder.append(" ");
        }

        System.out.printf("우승차 : %s%n", stringBuilder);
    }
}
