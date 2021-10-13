package racinggame;

public class RacingGame {
    private static int lapCount;
    private Cars racingCars;
    private Boolean isEndGame = false;

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
}
