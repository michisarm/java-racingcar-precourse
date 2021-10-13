package racinggame;

import java.util.ArrayList;
import java.util.Collections;

public class RacingGame {
    private static int lapCount;
    private Cars racingCars;
    private Boolean isEndGame = false;
    ArrayList<String> winnerList;

    public RacingGame(int input, Cars racingCars) {
        this.lapCount = input;
        this.racingCars = racingCars;
    }

    public int getRacingCount() {
        return lapCount;
    }

    public Cars getRacingCars() {
        return racingCars;
    }

    public void startGame() {
        isEndGame = false;
        for(int lap = 0; lap < lapCount; lap++){
            racingCars.runTrack(lap);
        }
        isEndGame = true;
    }

    public boolean isEndGame(){
        return isEndGame;
    }

    public void showGameResult() {
        for (int i=0; i< lapCount; i++){
            ConsoleView.resultRecord(i, racingCars);
        }
    }

    public void setMaxLapCars(int lapCount, Cars racingCars) {
        ArrayList<Integer> lapList = new ArrayList<>();
        for (Car car : racingCars.getRacingCar()) {
            int length = car.cumulativeLap(lapCount-1).length();
            car.setResultLap(length);
            lapList.add(length);
        }
        for (Car car : racingCars.getRacingCar()) {
            addWinnerCars(Collections.max(lapList), car);
        }
    }

    public void addWinnerCars(int max, Car car) {
        if(car.isResultLap(max)){
            winnerList.add(car.getName());
        }
    }

    public void showWinnerCars() {
        winnerList = new ArrayList<>();
        setMaxLapCars(lapCount, racingCars);
        ConsoleView.winnerCars(winnerList);
    }
}
