package racinggame;

import nextstep.utils.Console;

import java.util.ArrayList;

public class ConsoleView {
    private static String RESULT = "실행 결과";
    private static String COL = " : ";
    private static String FINAL_START = "최종 우승자는 ";
    private static String FINAL_END = " 입니다.";
    private static String GAME_START_CAR = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static String GAME_START_LAP = "시도할 회수는 몇회인가요?";


    public static void resultRecord(int lap, Cars cars) {
        if(lap == 0){
            System.out.println(RESULT);
        }
        for (Car car : cars.getRacingCar()) {
            System.out.println(car.getName() + COL + car.cumulativeLap(lap));
        }
        System.out.println();
    }

    public static void winnerCars(ArrayList<String> winnerList) {
        System.out.println(FINAL_START+String.join(",", winnerList)+FINAL_END);
    }

    public static String readCar(){
        System.out.println(GAME_START_CAR);
        return Console.readLine();
    }

    public static String readLap(){
        System.out.println(GAME_START_LAP);
        return Console.readLine();
    }
}
