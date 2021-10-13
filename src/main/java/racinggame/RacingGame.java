package racinggame;

public class RacingGame {
    private static int lapCount;
    private Cars racingCars;

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
        for(int lap = 0; lap < lapCount; lap++){
            racingCars.runTrack(lap);
        }
    }
}
