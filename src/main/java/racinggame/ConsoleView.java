package racinggame;

public class ConsoleView {
    private static String RESULT = "실행 결과";
    private static String COL = ":";

    public static void resultRecord(int lap, Cars cars) {
        if(lap == 0){
            System.out.println(RESULT);
        }
        for (Car car : cars.getRacingCar()) {
            System.out.println(car.getName() + COL + car.cumulativeLap(lap));
        }
        System.out.println();
    }
}
