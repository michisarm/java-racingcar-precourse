package racinggame;

import java.util.ArrayList;
import java.util.Collections;

public class ConsoleView {
    private static String RESULT = "실행 결과";
    private static String COL = ":";
    private static String FINAL_START = "최종 우승자는 ";
    private static String FINAL_END = " 입니다";

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

}
